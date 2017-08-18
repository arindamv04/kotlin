package Oo

abstract class mammal (open val name: String, open var age: Int){//we marked this class abstract and open.
    //this lets the class be passed down for inheritance but no objects can be created from this

    abstract fun speak()//we marked this function abstract. this lets the function be passed down for inheritance
    //but in each of the child classes we can make this function do different things specific to that child class.
}

class dogs(override val name: String, override var  age: Int): mammal(name,age){
    override fun speak() {//the speak function says its a dog here.
        println("hi, I am a dog named $name and my age is $age")
    }
}

class cats(override val name: String, override var age: Int):mammal(name,age){
    override fun speak() {//the speak function says its a cat here. different from above.
        println("hi, I am a cat named $name and my age is $age")
    }
}

fun main(args: Array<String>) {
    var bob = dogs("bob",3)
    bob.speak()
    var bell = cats("bell",5)
    bell.speak()

    //we cant make a new object of type mammal because mammal is an abstract class.
    //this is useful when we dont want code repeating while restricting stray objects from being created. say we only want dogs and cats in this list and not some mammals.

}