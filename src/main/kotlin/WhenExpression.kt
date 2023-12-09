fun main() {

    // penggunanya untuk kondisional percabangan, when expression lebih sederhana ketimbang if conditional, digunakan untuk pengecekan ke kondisi dalam satu variable

    whenExpression1()
    whenExpression2()
    whenExpression3()
    whenExpression4()

}

fun whenExpression1() {

    val nilai: String = "A"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }

        "B" -> {
            println("Good")
        }

        "C" -> {
            println("Not Bad")
        }

        "D" -> {
            println("Bad")
        }

        else -> {
            println("try again next month")
        }

    }
}

fun whenExpression2() {
    val nilai: String = "G"

    when (nilai) {
        "A", "F", "G" -> println("Amazing") // multiple option
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        else -> println("try again next month")

    }
}

fun whenExpression3() {

    val nilai: String = "A"
    val passValue = arrayOf("A", "B", "C")

    when (nilai) {
        in passValue -> println("Pass") // if nested loops
        !in passValue -> println("Try Again")
    }

    val name = "budhi"
    when(name) {
        is String -> println("Name is string") // equals()
        !is String -> println("Name is not string")
    }

}

fun whenExpression4(){

    val examValue = 90
    when{
        examValue > 80 -> println("Good Job")
        examValue > 70 -> println("Not Bad")
        else -> println("try again next month")
    }

}