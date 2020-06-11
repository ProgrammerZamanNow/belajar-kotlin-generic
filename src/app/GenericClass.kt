package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Eko", 100)
    myDataString.printlnData()

    val myDataInt = MyData(100, "Eko")
    myDataInt.printlnData()
}