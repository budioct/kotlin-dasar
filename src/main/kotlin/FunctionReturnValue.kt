fun main() {

    printHello("")
    printHello("budhi")

}

fun printHello(name: String): Unit {

    // Unit adalah variable yang tidak return data.. (sebagai penanda) java: foin / kotlin: unit

    if (name == null) {
        println("Hello Broo")
    } else {
        println("Hello $name")
    }

} // method ini tidak wajib return data


