fun main() {

    // penggunanya untuk kondisional percabangan, when expression lebih sederhana ketimbang if conditional, digunakan untuk pengecekan ke kondisi dalam satu variable

    whenExpression1()
    whenExpression2()
    whenExpression3()
    whenExpression4()

}

fun whenExpression1() {

    // When Expression

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

    // When Expression Multiple Option

    val nilai: String = "G"

    when (nilai) {
        "A", "F", "G" -> println("Amazing") // multiple option = if(A || F || G)
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        else -> println("try again next month")

    }
}

fun whenExpression3() {

    // When Expression In

    val nilai: String = "A"
    val passValue = arrayOf("A", "B", "C")

    // if(passValue.contains(nilai)) = apakah nilai terkadung dalam passValue
    when (nilai) {
        in passValue -> println("Pass") // in = condition true
        !in passValue -> println("Try Again") // !in = condition false
    }

    // kepake di OOP Kotlin
    val name = "budhi"
    when(name) {
        is String -> println("Name is string") // is = condition data type true
        !is String -> println("Name is not string") // !is = condition data type false
    }

}

fun whenExpression4(){

    // when{body expression}

    val examValue = 90
    when{
        examValue > 80 -> println("Good Job")
        examValue > 70 -> println("Not Bad")
        else -> println("try again next month")
    }

}