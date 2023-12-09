fun main() {

    operate()
    exam()

}

fun operate() {

    val benar: Boolean = true
    val salah: Boolean = false

    println(!benar)
    println(!salah)

    println(benar && salah)
    println(benar || salah)
    println(benar && !salah)

}

fun exam() {

    val finalExam: Int = 80
    val attendat: Int = 75
    val exstraExam: Int = 75

    val pass = finalExam > 75 && attendat > 80 && exstraExam > 75

    println("Exam: " + pass)

}