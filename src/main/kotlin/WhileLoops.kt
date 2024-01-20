fun main() {

    whileLoops()

}

fun whileLoops() {

    var i: Int = 0

    var totalNilai : Int = 0
    while (i < 10) {
        i++
        totalNilai += i
        println("loops $i")
    }
    println("Total Nilai $totalNilai")
    println("Selesai Looping")

}