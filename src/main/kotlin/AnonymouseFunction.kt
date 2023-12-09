fun main() {

    // anonymouse function (funtion tanpa nama).. digunakan untuk kasus yang komplex
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Exception: value is Blank"
        }
        return value.toUpperCase()
    }

    // lambda expression.. digunakan untuk kasus sederhana
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    println(hello("adam", anonymousUpper))
    println(hello("", anonymousUpper))

}