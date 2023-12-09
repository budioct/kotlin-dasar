fun main() {

    /**
     * Higher-Order Function adalah function yang menggunakan function sebagai parameter atau return type function
     */

    // transformer: (String) -> String // create Higher-Order Function, kalau mau buat harus di paling akhir parameter
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("budhi", lambdaUpper))

    println(hello("husein", { value: String -> value.toLowerCase() })) // akses langsung di method

    // trailing lambda (optional)
    val result1 = hello("adam", { value: String -> value.toUpperCase() })
    val result2 = hello("jamal") { value: String -> value.toLowerCase() }

    println(result1)
    println(result2)

}


