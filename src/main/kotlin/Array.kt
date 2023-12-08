fun main() {

    val members: Array<String> = arrayOf("budhi", "oct")
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val bytes: Array<Byte> = arrayOf(8, 7, 6, 5, 4, 3, 2, 1)

    println("size: " + members.size)
    println(members[0]) // mengakses array dengan array[index]
    println(members.get(1))

    members.set(0, "ubah data array")
    println(members.get(0))
    arrayNullAble()

}

fun arrayNullAble() {

    // array String boleh di set null, karna ? --> Array<String?>
    // array di kotlin tidak dinamis, panjangnya akan selalu mengikuti yang di set
    val squad: Array<String?> = arrayOfNulls(5)
    squad[0] = "satu"
    squad[1] = "dua"
    squad[2] = "tiga"
    squad[3] = "empat"
    squad[4] = null

    for (value in squad) {
        println("value of arrayOfNulls() " + value)
    }
}