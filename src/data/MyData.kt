package data

class MyData<T, U>(val firstData: T, val secondData: U) {

    fun getData(): T = firstData

    fun getSecond(): U = secondData

    fun printlnData(){
        println("Data is $firstData $secondData")
    }

}