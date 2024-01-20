fun main() {

    // function default parameter. gunanya menganti parameter yang tidak di isi, supaya tidak error

    hello("Nunez") // tidak Error saat parameter 2 tidak di isi
    hello("Karim", "Benzema")
    hello("Jamal", "Abdullah")

}

fun hello(firstName: String, lastName: String = ""){

    println("my name is $firstName $lastName")
}