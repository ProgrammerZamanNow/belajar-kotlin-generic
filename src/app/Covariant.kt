package app

class Covariant<out T>(val data: T) {

    fun data(): T {
        return data
    }

    // tidak boleh membuat function dengan input generic covariant
//    fun setData(param: T){
//        data = param
//    }

}

fun main() {
    val covariantString = Covariant<String>("Eko")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())

    // covariantAny.setData(100) tidak boleh
}