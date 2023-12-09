fun main() {

    // var data = (String param) -> {param.toUpperCase()}

    // lambda 1
    val lambdaName1: (String) -> String = { value: String ->
        value.toUpperCase()
    }
    // akses lambda
    val name1 = lambdaName1("budhi")
    println(name1)

    // lambda 2..
    val lambdaName2: (String) -> String = {
        it.toUpperCase() // keyword it menganti variable yang tidak di deklarasi
    }
    val name2 = lambdaName2("husein")
    println(name2)

    // lambda 3.. method reference
    val lambdaName3: (String) -> String = ::toUpper
    val name3 = lambdaName3("adam")
    println(name3)

}

fun toUpper(param: String): String = param.toUpperCase()