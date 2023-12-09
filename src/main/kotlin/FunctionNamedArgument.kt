fun main() {

    fullName(firstName = "budhi",
        lastName = "ct",
        middleName = "o") // function named argument

}

fun fullName(firstName: String,
             middleName: String,
             lastName: String){

    println("Hello Bro $firstName $middleName $lastName")
}