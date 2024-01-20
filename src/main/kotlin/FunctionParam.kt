fun main() {

    sayHello("Bambang", "pamungkas")
    sayHello("Mo", "salah")
    sayHello("Riski", "ridho")
    // sayHello("asek", ) // di kotlin wajib mengisi parameter function yang sudah di set. akan Error jika tidak di isi

}

fun sayHello(firstName: String, lastName: String){

    println("my name is $firstName $lastName")
}
