fun main() {

    // var keyword untuk membuat variable di kotling
    // val keyword untuk membuat variable di kotling

    var name:String = "budhi"
    var hobby:String = "fotball"
    var age:Byte = 27
    var ribuan:Short = 4000
    var balance:Long = 1000000L

    var separatorNumber:Long = 100_000_000L

    println("name : " + name)
    println("hobby : " + hobby)
    println("age : " + age)
    println("ribuan : " + ribuan)
    println("balance : " + balance)
    println("separator Number : " + separatorNumber)
    floatingPoint()
    literal()
    convertionNumber()

}

fun floatingPoint(){

    // pecahan

    var sampleFloat:Float = 10.01F
    var sampleDobule:Double = 10.0112903812930

    println("Sample 1: " + sampleFloat)
    println("Sample 2: " + sampleDobule)

}

fun literal(){

    // hexadecimal

    var decimalLiteral:Int = 100
    var hexadecimalLiteral:Int = 0xFF
    var binaryLiteral:Int = 0b0001

    println("literal 1: " + decimalLiteral)
    println("literal 2: " + hexadecimalLiteral)
    println("literal 3: " + binaryLiteral)

}

fun convertionNumber(){

    var number:Int = 100

    // convertion // casting

    var byte:Byte = number.toByte()
    var short:Short = byte.toShort()
    var int:Int = short.toInt()
    var long:Long = int.toLong()
    var float:Float = long.toFloat()
    var double:Double = float.toDouble()

    println("convertion number: " + double)


}