fun main() {

    val result = double(10)
    println("result: $result")
    hi("husein")

}

/**
 * Single Expression Function
 * Single expression function adalah deklarasi function hanya dengan 1 baris kode
 * untuk membuatnya hanya butuh tanda = (sama dengan) setelah deklarasi nama function dan tipe data pengembalian function
 */
fun double(a: Int): Int = a * 2

fun hi(name: String): Unit = println("Hi $name")