fun main() {

    // function named argument, bisa menyebutkan nama parameter yang ada di function tersebut tanpa harus tau urutan set parameter function tersebut

    fullName(
        firstName = "budhi",
        lastName = "ct",
        middleName = "o"
    )

    fullName(
        middleName = "middle param",
        lastName = "last param",
        firstName = "first param"
    )
}

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {

    println("Hello Bro $firstName $middleName $lastName")
}