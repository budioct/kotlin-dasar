fun main() {

    fun factorialLoop(value: Int): Int {

        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    fun factorialRecursive(value: Int): Int {

        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }

//        return if (value == 1) {
//            value
//        } else {
//            value * factorialRecursive(value - 1)
//        }
    }

    println(factorialLoop(10)) // 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
    println(factorialRecursive(10)) // 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

}

