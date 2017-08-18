package conditionals

fun main(args: Array<String>) {
    val mode: Int = 54

//    when statement is similar to the switch statement in c ++. switching is a fun little game

    when (mode){
        1 -> println("this is the first switch option using when statement")
        2 ->{
            println("this is the second option")
            println("also using the when statement")
//            we can use curly brackets to include more than one line of code for the same option
        }
        3 -> println("this is mode 3 or case three in swithch. this is the last mentioned condition")
        3*3 -> println("the case here is 9")
        "hello world ppl".length -> println("this is the 15th case from strin len")
        in 16..40 -> println("cases of 16 to 40")
        !in 1..40 -> println("cases beyond 40")
//        these two lines about are used to check if the mode is in a range
        else -> println("i dont know this mode")
//        else statement is used to catch all other cases that are not defined
    }
}