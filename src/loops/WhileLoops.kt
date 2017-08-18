package loops

fun main(args: Array<String>) {
    //while loops are used when we dont know how many iterations we need to run in advance
    //one common example is when we need to read a text file. we go line by line without knowing when the file would end.
    //we carry on till we encounter the end of file symbol.

    var x = 9

    while (x>=0){ //the while loop runs while a condition is satisfied.
        println(x)
        x-- //we are reducing the value of x by 1 for every loop. this loop will stop once x reaches zero
    }

    //the sum of one to 100 can also be run using the while loop

    var i = 0 //for a while loop we have to define the var. it needs this to check condition
    var sum = 0
    while (i<=100){ //all vars have to be defined in advance and conditions have to be explained
        sum = sum+i
        i++ //the vars should be manually incremented because all this does is check conditions
    }
    println("the sum is $sum") // using for loop for this is a better choice. uses less code.

}