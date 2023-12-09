fun main() {

    // walaupun closure sangat power full, di sarankan tidak menggunakan karna kalau salah sangat fatal

    var counter: Int = 0

    val lambdaInrement: () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymouseIncrement = fun() {
        println("Anonymouse Increment")
        counter++
    }

    fun functionInrement(){
        println("Function Increment")
        counter++
    }

    lambdaInrement()
    lambdaInrement()
    anonymouseIncrement()
    anonymouseIncrement()
    functionInrement()
    functionInrement()

    println(counter)

}