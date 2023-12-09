fun main() {

    tailrec fun display(value: Int) {

        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {

        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value) // karna tailrec recursive merubah recursive biasa ke looping biasa. dengan kejadian tersebut tidak akan lagi error  // Exception in thread "main" java.lang.StackOverflowError
        }
    }

    display(10000) // Exception in thread "main" java.lang.StackOverflowError // tidak menggunakan tailrec
    println(factorialRecursive(10)) // 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

    // ketika pangil method recursive tidak ada boleh selain method itu sendiri
//    tailrec fun factorialRecursive(value: Int): Int {
//
//        return when (value) {
//            1 -> 1
//            else -> value * factorialRecursive(value - 1) // Recursive call is not a tail call ketika menggunakan keyword tailrec
//        }
//    }
//    println(factorialRecursive(10)) // 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1


}

