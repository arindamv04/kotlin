package Oo

class animal{
    var age: Int = 0 //this in kotlin is initialising a variable but what its actually doing is accessing a field behind this variable
    //in jave this same command will be accessing a field. not initialising a variable.
    //to set values in the so called field, we need to use getters and setters. essentially a get() and a set() function
 //in kotlin the get and set functions get used auto in the background
        get() = field //field here is what holds the value. printing this value through an object refers to this method for a value
        set(value) {// when we try to give a value to age, this gets called and here we are modifying a default function
            if (value>0){
            field = value //if the value we gave is more than 0 then the field gets set to the value given.
        }
    }
}

fun main(args: Array<String>) {
    val animal = animal()
    animal.age = 8//we cannot access the field directly. this function can only be carried out using the set() function
    animal.age = 0//this will not happen because we have a conditioin for the setter
    println(animal.age)
}