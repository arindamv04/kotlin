package conditionals

fun main(args: Array<String>) {
    val age: Int = 19
    if (age<18){
        println("you cannot register")
    } else if (age<21){
        println("maybe you can")
    }else{
        println("welcome")
    }

    println("the end")

//    any content that is writtin at the end of the if elseif blocks will run no matter what happens before it
}
