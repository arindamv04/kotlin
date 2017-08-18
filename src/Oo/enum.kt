package Oo

//passing simple strings for properties in constructor is simple but for standard types of data, there is no type safety
//eg if we want direction (north,east,west,south), anything could be passed in the constructor including "fuck"
//enum gives you that type safety

enum class colour(val rgb: Int){ //this is how an enum class is created. no constructor brackets required
    red(0xFF0000),blue(0x0000FF),green(0x00FF00),yellow(0xFFFF00); //these are the elements of the class that can be used directly. no need to creat a different object.
    //let us extend the function of this enum with a fun that will check if the colour contains red. end about enums with;

    fun containsred(): Boolean{
        return this.rgb and 0xFF0000 != 0 //if this value is not equal to zero, return true. else return false
    }

}

class bike(val colour: colour ){//here the type for the colour is set to the enum class type. this is internally stored as int
    fun bikecolour(){
        println("this bike is of colour $colour")
    }
}

fun main(args: Array<String>) {
    val firstbike = bike(colour.green)//here since the constructor says its of type enum class(colour)
    //we can only enter a value as colour.--- autocompleat will prompt you. it will force you to pick element from enum class

    firstbike.bikecolour()//wen you ask for colour to be printed.. it would print the element we mentioned in the enum class

    //lets call the function in the class
    println(colour.red.containsred()) //contains red so true
    println(colour.green.containsred())//doesnt contain so will return false.
}

//by using enum you reestrict the possible inputs to the constructor. and if those inputs are not give
//the program will fail at compile time and not in run time.

