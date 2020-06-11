package app

import data.Function

fun main() {
    val function = Function("Eko")

    function.sayHello("Joko")
    function.sayHello<String>("Joko")

    function.sayHello(10)
    function.sayHello<Int>(10)
}