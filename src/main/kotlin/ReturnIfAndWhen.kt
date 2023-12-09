fun main() {

    // return common
    fun sayHello1(name: String = ""): String {
        if (name == "") {
            return "Hello Bro!"
        } else {
            return "Hello $name"
        }
    }

    // return if
    fun sayHello2(name: String = ""): String {
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }
    }

    println(sayHello1(""))
    println(sayHello1("budhi"))
    println(sayHello2(""))
    println(sayHello2("danang"))

    // return common
    fun smile1(name: String = ""): String {
         when (name) {
            "" -> return "Hello Bro!"
            else -> return  "Hello $name"
        }
    }

    // return when
    fun smile2(name: String = ""): String {
        return when (name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }

    println(smile1(""))
    println(smile1("adam"))
    println(smile2(""))
    println(smile2("bilal"))

}
