package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param){

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }

}

class Car(brand: String, year: Int){
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable(""){ property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable(""){ property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    var car = Car("Toyota", 2019)

    car.brand = "Wuling"
    println(car.brand)

    car.year = 2020
    println(car.year)

    car.owner = "Eko"
    println(car.owner)

    car.description = "Desc"
    println(car.description)

    car.other = "Other"
    println(car.other)

}