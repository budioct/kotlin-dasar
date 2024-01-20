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
            /**
             * Tail Recusive factorial
             * factorialRecursive(10, 1) ==> 10 x 1 = 10
             * factorialRecursive(9, 10) ==> 9 x 10 = 90
             * factorialRecursive(8, 90) ==> 8 x 90 = 720
             * factorialRecursive(7, 720) ==> 7 x 720 = 5040
             * factorialRecursive(6, 5040) ==> 6 x 5040 = 30240
             * factorialRecursive(5, 30240) ==> 5 x 30240 = 151200
             * factorialRecursive(4, 151200) ==> 4 x 151200 = 604800
             * factorialRecursive(3, 604800) ==> 3 x 604800 = 1814400
             * factorialRecursive(2, 1814400) ==> 2 x 1814400 = 3628800
             * factorialRecursive(1, 3628800) ==> 1 x 3628800  = 3628800
             */
        }
    }

    display(10000) // Exception in thread "main" java.lang.StackOverflowError // tidak menggunakan keyword tailrec
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

