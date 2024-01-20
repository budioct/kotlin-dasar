fun main() {

    var name: String = "budhi"

    println(name.hello())

    "budhi".printHello()

}

fun String.hello(): String {

    /**
     * Extension Function
     *
     * fun TypeData.method(): Return TypeData {}
     *
     * Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
     * fitur yang sangat powerfull
     * untuk membuat tambahkan tipe_data pada nama function nya, lalu diikuti dengan tanda . (titik)
     * untuk mengaksesnya menggunakan keyword this --> $this jika di dalam string
     * $this mengakses data type data tersebut
     */

    return "Hello 1: $this"
}

fun String.printHello(): Unit = println("Hello 2: $this") // function single expression with extension
