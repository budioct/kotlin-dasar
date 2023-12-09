fun main() {

    forLoops()
    forRange()

}

fun forLoops() {

    val names: Array<String> = arrayOf("budhi", "oct", "jamal", "husein", "adam")
    var total = 0;

    for (name in names) {
        println("name is " + name)
        total++
    }
    println("Total Perulangan $total")

    val sizearray = names.size - 1 // initializ array
    // val sizearray: Int = names.size - 1

    for (i in 0..sizearray) {
        println("Index $i = ${names.get(i)}")
    }

}

fun forRange() {

    for (value in 0..5) {
        println("value: $value")
    }

    for (value in 10 downTo 0 step 2) {
        println("value: $value")
    }

}