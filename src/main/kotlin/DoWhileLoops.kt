fun main() {

    doWhileLoops()

}

fun doWhileLoops() {

    var i: Int = 0
    var totalNilai = 0

    do {
        i++
        totalNilai += i
        println("loops $i")
    } while (i < 10)
    println("Total Nilai $totalNilai")
    println("Selesai Looping")

}