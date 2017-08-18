package Oo

//singleton is basically a class of which online one object can ever be created. this class can be used once for one object
//this also means you cannot call a constructor for this.

//the keyword for making a singleton is object. esssentially you will make an object itself (outside main)

object Cache{ //this here is called an object decleration. there is also object expressing which will come later
    val name = "damal"

    fun data(): Int{
        return 0
    }
    //just like a normal class this object/singleton can have properties and methods
}

fun main(args: Array<String>) {
    println(Cache.name)
}