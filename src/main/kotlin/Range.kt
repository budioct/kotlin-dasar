fun main() {

    // type range punya kemampuan menampung data yang berurutan
    // type range tidak seperti array, bukan untuk menampung data
    val seratus = 1..100
    val seribu = 1000 downTo 1 step 2 // dengan step 2 tiap kenaikan

    println(seratus.count())
    println(seratus.contains(100))
    println(seratus.first)
    println(seratus.last)
    println(seratus.step) // step // mendapat nilai tiap kenaikan

    println(seribu.count())
    println(seribu.contains(566))
    println(seribu.first)
    println(seribu.last)
    println(seribu.step)

}