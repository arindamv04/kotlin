package Oo

//a short note on visibility
//private is for vars and methods that can only be accessed in that class. they cant be accessed outside
//protected is for stuff that can onlly be accessed from a child class. nowhere else.
//internal is for stuff that can be accessed within the module but not outside. what so ever. here kotlin programming is the module
//public the var or method is accessable everywere. this is used for functions in the class that controle interface with user.

//now to the subject of this file

//DRY = dont repeat yourself. keep your code dry

class stack<E>(vararg val item: E){//this is a generic class. here the e stands for an element and we can write functions on this element.
    //here in the constructor we said we will feed it a list of items of type E. this is how items are fed into a list by default. we are using it for our constructor

    val elements = item.toMutableList() //this is how we take the items from the default internal list and put it in our list items.
    //we want to operate on our list. that is push and pop work on our defined list. they cant access the default list in which data is fed into
    fun push(element: E){         //even if this class is used with int or double or any other elements.
        elements.add(element)//we took element in the argument. this is of type E. generic so it will work no matter what we pass
    }                   //if we didnt have this element type agnostic functions, we would have to redefine then everytime we hve a different data type
    fun pop(): E?{ //return type is element but can hold null value
        if (!elements.isEmpty()){//if the stach is not empty
            return elements.removeAt(elements.size - 1) //this will return the element that is last in and will also delete it
        }else{
            return null
        }

    }

    fun isempty(): Boolean{
        return elements.isEmpty()
    }
}

fun <T> stackof(vararg elements: T): stack<T>{//this function is generic with list of arguments of type T(generic)
                                                //and the return type is a stack from the stack class we created above
    return stack(*elements) //we dont have to store the vararg items saperately in a list. we can pass it directly to the stack constructor
    //but if we pass just elements, then an array of all the arguments will get passed to the constructor and just one element E will be created
    //this is because for a generic function the list of parameters are stored in a array.
    //to pass them as indivudial items.. ie.. to turn them back to vararg.. we use the * symbol
}

fun main(args: Array<String>) {
    var stack1 = stack(2,3,4,5,6)
    for (i in 1..6){
        println(stack1.pop())
    }

    val stack2 = stackof("arindam","my name is","hello" )//we used the function which will return a stack
    for(i in 1..4){
        println(stack2.pop())
        //the helper function stackof is generic and the class stack is also generic. we could have made a direct class constructor call too
    }

    val stack3 = stack("done","is","test")//here we made a string based stack without the helper function
    for (i in 1..3){
        println(stack3.pop())
    }

}