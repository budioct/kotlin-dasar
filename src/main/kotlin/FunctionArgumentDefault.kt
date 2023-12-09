fun main() {

    hello("Nunez")
    hello("Karim", "Benzema")

}

fun hello(firstName: String, lastName: String = ""){

    println("my name is $firstName $lastName")
}