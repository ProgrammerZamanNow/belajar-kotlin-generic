package app

import data.Fruit

fun main() {
    val fruit1 = Fruit("Apple", 100)
    val fruit2 = Fruit("Apple", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}