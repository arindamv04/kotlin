package IOio

import java.util.*

fun main(args: Array<String>) {
    var number = Random().nextInt(100) + 1 //next int will set the upper bound to 99. ie 0 to 99. thats why the addition
    var input: String? //this is where we will take user input. since we cant trust user, this can take null value
    var guess = -1 //default value for the guess. we will set the guess to input once we check for null

    while (guess != number){//as long as the user didnt guess the exact number
        print("guess a number between 1 to 100: ")
        input = readLine()

        if (input != null){
            guess = input.toInt() //this will convert the input into int. usually numbers too are stored as strings until specified
        }

        if (guess>number){
            println("your guess is Too Large")
        }else if (guess<number){
            println("your guess is too small")
        }else{
            println("you got it!!")
        }
    }
}