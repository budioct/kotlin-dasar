fun main() {

    // var data = (String param) type lambda -> String return value function {firstName: String deklarasi param -> block body manipulation/modified}

    // lambda 1
    val lambdaName1: (String) -> String = { value: String ->
        value.toUpperCase()
    }
    // akses lambda
    val name1 = lambdaName1("budhi")
    println(name1)

    // lambda 2..
    val lambdaName2: (String) -> String = {
        "Hello " + it.toUpperCase() // keyword it menganti variable yang tidak di deklarasi.. bisa jalan kalau parameter nya 1 dan digunakan di body lambda saja
    }
    val name2 = lambdaName2("husein")
    println(name2)

    // lambda 3.. method reference
    val lambdaName3: (String) -> String = ::toUpper // :: object reference
    val name3 = lambdaName3("adam")
    println(name3)

}

fun toUpper(param: String): String = param.toUpperCase()