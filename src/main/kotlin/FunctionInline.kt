fun main() {

    /**
     * Inline Functions
     * ● Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
     * ● Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi
     * berjalan, karena harus membuat object lambda berulang-ulang. Jika penggunaannya tidak terlalu
     * banyak mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
     * ● Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi
     * Inline Function
     * ● Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada
     * saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang
     *
     * // mirip seperti tailrecursive
     *
     * contoh code
     * inline fun hello(name_argument_function: () -> type_lambda): return_type_function{ bloc body function return "Hello ${name()}" }
     *
     * contoh access menggunakan trailing
     * println(hello { "budhi" })
     */

    println(hello({ "Budhi" }, { "oct" }))
    println(hello({ "Adam" }, { "hudesin" }))
    println(hello({ "Husein" }, { "abdilah" }))

    for (i in 1..10) {
        println("index: $i " + hello { "jamal" })
    }

}

inline fun hello(
    fistname: () -> String,
    noinline lastname: () -> String
): String {
    return "Hello ${fistname()} ${lastname()}"
} // bentuk function yang return inline tetapi argument ada yang noinline

inline fun hello(
    fistname: () -> String
): String {
    return "Hello ${fistname()}"
}