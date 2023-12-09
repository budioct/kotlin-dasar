fun main() {

    keyBreak()
    keyContinue()

}

fun keyBreak() {

    var i: Int = 0
    var totalNilai = 0

    while (true) {
        i++
        totalNilai += i
        println("loops $i")
        if (i >= 10) {
            break // menhentikan program secara paksa dan langsung return value
        }
    }
    println("Total Nilai $totalNilai")
    println("Selesai Looping")

}

fun keyContinue() {

    // 1 % 2 == 1 --> genap
    // 1 % 2 == 0 --> ganjil

    for (i in 1..100) {
        if (i % 2 == 1) {
            continue // melewati hasil pembagian bilangan yang gajil / genap
        }
        println("print continue $i")
    }

}