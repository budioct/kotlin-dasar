fun main() {

    // var keyword untuk membuat variable (mutable)
    // val keyword untuk membuat variable (immutable)

    // val/var namaVariable:TipeData = value

    val firstName = "budhi"
    val lastName = "oct"

    // val tidak bisa di ubah.. Exception Val cannot be reassigned
    // firstName = "makan"

    println("$firstName $lastName")
    variableNullAble()
    println("$APP $VERSION")
}

fun variableNullAble() {

    // ? keyword bisa memaksa variable menjadi null untuk suatu kebutuhan

    var value: Int? = null
    var data: String? = null

    println(value)
    println(data)

}

// constant adalah variable immutable untuk keperluan variable global bisa diakses dimanapun
const val APP: String = "Belajar Kotlin"
const val VERSION: String = "0.0.1"