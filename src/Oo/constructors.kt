package Oo

class person(var name: String, var age: Int) { //if we make the class by typing person(name:string, age:int) we will need an init block

    //an init{} block is used once when the object is created and it actually has a new set of values that are initialised to the arguments of the class
    //this is because init block is the only thing that can access the arguments passed during object clreation.
    //functions or methods in a class cannot access these argument values directly. they access what is initialised in the init block

    //this process of passing arguments to the class to creat an object is called a constructor. there is no need for init block in knotlin
    fun details() {
        println("hellow world")
        println("my name is $name and my age is $age")
        println("i was born in " + (2017-age)) //all the variables from the constructor are now available to all the functions without the init block
    }
}

fun main(args: Array<String>) {
    var melly = person("melly", 40) //this is building an object using constructors.
    //the data given here as arguments goes to the class using constructors. its accessable to all the functions without the use of init block
    //thats because we initialised the valuse in the class constructor itself. nice no.
    melly.details()
}