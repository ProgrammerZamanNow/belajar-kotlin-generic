package app

fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Eko", "Kurniawan", "Khannedy")

    displayLength(arrayInt)
    displayLength(arrayString)
}