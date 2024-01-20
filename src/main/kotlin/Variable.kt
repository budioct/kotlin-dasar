fun main() {

    // var keyword untuk membuat variable (mutable)
    // val keyword untuk membuat variable (immutable)

    // val/var namaVariable:TipeData = value

    /**
     * Direkomendasikan menggunakan Immutable dibanding Mutable data
     */

    val firstName = "budhi"
    val lastName = "oct"

    // val tidak bisa di ubah.. Exception Val cannot be reassigned
    // firstName = "makan"

    println("$firstName $lastName")
    variableNullAble()
    println("$APP $VERSION")
}

fun variableNullAble() {

    // ? tanda keyword bisa memaksa variable menjadi null untuk suatu kebutuhan
    // tidak ada ?.. Exception: Null can not be a value of a non-null type Int

    //var value: Int = null // Error
    var data: String? = null

    //println(value)
    println(data)

}

// constant variable adalah immutable data, untuk keperluan variable global bisa diakses dimanapun
const val APP: String = "Belajar Kotlin"
const val VERSION: String = "0.0.1"