fun main() {

    math()
    augmentedAssigments()
    unaryOp()

}

fun math(){

    var result: Int = 10 + 3
    println(result)

    var result2: Int = 10 + 10 / 2
    println(result2)

    var result3: Int = 10 / 3
    println(result3) // hasil adalah bilangan bulat. sisa pembagian tidak di hitung

    var result4: Int = 10 % 3
    println(result4) // hasil sisa pembagian

    var result5: Int = 10 - 3
    println(result5)

    var result6: Int = 10 * 10
    println(result6)

}

fun augmentedAssigments(){

    var total: Int = 0

    val item1 = 100
    total += item1 // total = total + item

    val item2 = 100
    total += item2

    println(total)

}

fun unaryOp(){

    var value = 0

    value++
    value++
    println(value)

    value--
    println(value)

    value = -2
    println(value)

    var sehat = !true
    println(sehat)

}