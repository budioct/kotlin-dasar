fun main() {

    // type range punya kemampuan menampung data yang berurutan
    // type range tidak seperti array, bukan untuk menampung data
    val seratus = 1..100 // Range dari 1 sampai 100
    val seribu = 1000 downTo 1 step 2 // Range dari 1000 ke 1 // dengan 2 step tiap kenaikan... jika ingin dari besar ke kecil menggunakan downTo
    val limapuluh = 0..50 step 2

    println(seratus.count()) // count() jumlah data range
    println(seratus.contains(100)) // contains(value) apakah ada data retang range
    println(seratus.first) // first get value pertama
    println(seratus.last) // last get value terakhir
    println(seratus.step) // step // mendapat nilai tiap kenaikan atau langkah

    println("")
    println(seribu.count())
    println(seribu.contains(566))
    println(seribu.first)
    println(seribu.last)
    println(seribu.step)

    println("")
    println(limapuluh.count())
    println(limapuluh.contains(44))
    println(limapuluh.first)
    println(limapuluh.last)
    println(limapuluh.step)

}