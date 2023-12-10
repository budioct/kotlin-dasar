fun main() {
    /**
     * Label
     * ● Label adalah penanda
     * ● Semua expression di Kotlin bisa ditandai dengan label
     * ● Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @
     *
     * Break, Continue dan Return
     * ● Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
     * ● Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka
     * berada, namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti
     */

//    labelBreak()
//    labelContinue()
    labelReturn("ada") test@{
        if (it == ""){
            // return
            return@test
        } else{
            println("Hello World")
        } // di kotlin lambda tidak bisa return, untuk mengakalinya dengan label, ketika tidak 'return@label' dia akan akan error compiler
    }
}

fun labelBreak() {
    loopI@ for (i in 1..10) {
        for (j in 1..10) {
            if (i > 5) {
                break@loopI // ini akan menghentikan loop variable j dan i yang diluar block loop j karna fitur label @loopI
            }
            println("$i * $j = ${i * j}")
        }
    } // loopI@ // label penanda
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI // ini akan menghentikan loop variable j dan i yang diluar block loop j karna fitur label @loopI
            }
            println("$i * $j = ${i * j}")
        }
    } // loopI@ // label penanda
}

fun labelReturn(name: String, operation: (String) -> Unit): Unit = operation(name)

