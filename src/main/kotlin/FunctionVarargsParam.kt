fun main() {

    // vararg
    finalValue("budhi", 1, 2, 3, 4, 5)

    // common array
    val values = arrayOf(1, 2, 3, 4, 5)
    var result = hitung(values)
    println("commond array: $result")

}

fun hitung(values: Array<Int>): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun finalValue(name: String, vararg values: Int) {

    /**
     * Function Varargs Parameter
     * Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
     * Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
     * cara membuarnya dengan keyword vararg nama_var: type_data
     */

    var total: Double = 0.0
    for (value in values) {
        total += value
    }
    total /= values.size
    println("final value $name = $total")

}