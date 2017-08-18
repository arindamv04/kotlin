package Oo

import functions.getdate //a highlevel function from the package gunctions that we defined is now imported and used below in main
import Oo.colour.green // we can import enum constents
import java.util.*

//we can even import functions from objects. we cannot import functions from the class itself because if there is a constructor
//and if the value of the constructor is used un the method then we can use that method till there is an object with definet value.


//a note about packages and imports

//we can group logically similar classes and other bits of source code into folders called packages.
// java and few other libraries also have a lot of packages that are already predefined and they usually get imported as you use them
//observe how it says package Oo on the top. that is because this file belongs to the Oo package we made.
//all the classes and the functions defined in this package are accessable here in this program.

fun main(args: Array<String>) {
    println("date is ${getdate()}")
    println("the colour is ${colour.green}")
    val today = Date() //this called for a function in the util package in the java package. that got imported above

}

//finally, we always want package names to be unique because when code from multiple sources gets put together we dont want conflicts
//importing packages is how we use other peoples code. standard practice is to use our domain name in reverse order.