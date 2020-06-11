package app

class Contravariant<in T>{
    fun sayHello(param: T){
        println("Hello $param")
    }

    // tidak boleh
//    fun getData():T {
//        return data
//    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    // contravariantString.getData() // error
    contravariantString.sayHello("Eko")
}