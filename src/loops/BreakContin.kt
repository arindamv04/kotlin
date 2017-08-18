package loops

fun main(args: Array<String>) {
    //the break operator lets us jump to the end of the loop and skip all further iterations
    //the continue operator allows us to skip to the next iteration

    for (c in "python"){
        if (c == 'o'){ //if our loop var equals 'o' we will break out of this for loop
            break
        }
        print(c) //nothing beyond 'h' will get printed here
    }
    //we detected the first occurance of something and skipped any further steps. this is the usual use case to save computation time.


    //a continue statement skips the current iteration and starts the next iteration.
    //an example for this use is when you are working with a list of users buy you are selective based on some condition

    println()


    var str = listOf("challenges.book","table","laptop")
    for (item in str){
        if (!item.contains('o')){ //checking if the item doesnt contain o
            continue //if the item doesn't contain o, then continue will run and jump to the next loop iteration.
            //this means the following println command wont get executed. it will simply jump to the next item
        }
        //some calculations that are avoided to save time
        println(item)
    }
}