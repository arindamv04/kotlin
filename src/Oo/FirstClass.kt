package Oo

class Person{ //define a class with the this syntax. Let the class name start with a capitol letter. this is SOP
    var name: String = "damal" //these are properties. for now we have to initialise them with something
    var age: Int = 30 //this preassigning will be resolved using constructors

    fun speak(){ //this is a method. methods are basically a function inside a class.
        println("hello")
    }

    fun greet(name: String){ //this is a method that takes an argument. again just like a function
        println("hello $name!!")
    }

    fun YearOfBirth(): Int { //this is a function with a return value and no printline statement.
        return 2017 - age //age is recognised here because its a var defined in the class. this method is in the same class.
    }

//    there is another way to get write the same above function in kotlin
    fun BirthYear() = 2017-age //this is just one like. the calling of the function will return the value we assigned to the fun itself

}

fun main(args: Array<String>) {
    var man = Person() // we make a var called man and assigne person() to it. this person() asks kotlin to create an objet from the person class above
    // our class is almost like a data type. this var man will assume the properties defined by the class.
    //the var holds an object that is of the type the class wants it to be.
    println(man.name)
    println(man.age) //this is how we access the data of the object defined in the class

    man.name = "arind"
    man.age = 29

    println(man.name)
    println(man.age)

    man.speak()//this is how we call the method that we defined in the class.
    man.greet("damal")//calling a method with an argument.
    println("your year of birth is " + man.YearOfBirth())
    println("age with the second function is " + man.BirthYear())
}