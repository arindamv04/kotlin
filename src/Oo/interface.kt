package Oo

//interface is like a contract to a class. if a class implements a interface, it will have all the functions defined in that interface.
//just like how a child class inherits everything from the parent. interface is like a parent but will only contain abstract functions
//these functions have to (must be) overriden in the classes that implement the interface.

interface drivable { //simple syntax. no need for the ()
    fun drive()//these functions will be overriden.
}
interface buildable {//can have as many interfaces as you want
    fun build()
    var TimeRequired: Int //interface can also have properties. these are also abstract. they cannot have default values
}

class car(val colour: String) :drivable{//this is how we implement an interface
    override fun drive() {//we absolutly have to override the function from the interface
        println("driving a $colour car..")
    }
}

class bus(val colour: String ):drivable, buildable {
    override fun drive() {
        println("i am driving a $colour bus..")
    }

    override fun build() {
        println("building a $colour bus")
    }

    override var TimeRequired = 34//the property must be overriden
}

fun main(args: Array<String>) {
    var swift = car("black")
    swift.drive()
    var f7 = bus("green")
    f7.drive()
    f7.build()
    var h45: drivable = bus("brown")//here we set the object to the type drivable.
    h45.drive()//althouge this object is from the class buss that has both drive and build. we can call the build function
    //this is because by setting the object to type drivable, we can only access those methods that are there in that interface.
    //in this case that method is drive. build() is out of reach here.
}