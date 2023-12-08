fun main() {

    var data1: String = "data 1"
    var data2: String =
        """data ini 
        lebih 
        dari satu baris
    """

    println(data1)
    println(data2)
    concatString()
    stringTamplate()

}

fun concatString(){

    var data1: String = "data 1"
    var data2: String = "data 2"

    println(data1 + " " + data2)

}

fun stringTamplate(){

    var data1: String = "data 1"
    var data2: String = "data 2"

    var fullData:String  = "$data1 $data2"
    var desc:String = "total $fullData --> lengh char = ${fullData.length}"

    println(fullData)
    println(desc)

}