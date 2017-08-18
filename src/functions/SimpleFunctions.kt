package functions

import java.util.*

fun helloworld(){ //syntax for defining a simple function. no parameter and no return value
    println("hello world")
}

fun withspace(text: String){ //this is how you make functions take arguments. mention a var with its type in the function definition
    for (item in text){
        print(item + " ")
    }
}

fun getdate(): Date { //here we said that the function will reurn something of data type 'Date' colen outside will define data type of the functions return value
    return Date() //this is creating an object of date class. this gets returned by our function.
}

//lets make a function that has two parameters and also returns the largest of the two numbers. so also has a return

fun max(a: Int, b: Int): Int {//we mentioned the type of bot paramethers and also the return value.
    if (a>=b){
        return a
    }else{
        return b
    }
}

//functions must be defined outside mains and then called in challenges.main. if you dont call a function in challenges.main. it wont get used.
fun main(args: Array<String>) {
    helloworld()
    withspace("arindama")//pass argumetns as the same datatype and mentioned in the definition
    println()
    println(getdate())

    println(max(34,9))
}