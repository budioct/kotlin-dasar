fun main() {

    var name: String = "budhi"
    val hello: String = name.hello()

    println(hello)

}

fun String.hello(): String {

    /**
     * Extension Function
     * Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
     * fitur yang sangat powerfull
     * untuk membuat tambahkan tipe_data pada nama function nya, lalu diikuti dengan tanda . (titik)
     * untuk mengaksesnya menggunakan keyword this --> $this
     */

    return "Hello $this"
}
