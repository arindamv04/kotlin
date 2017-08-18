package challenges

fun main(args: Array<String>) {
    var sum: Long = 0 // or var sum = 0L
    //the sum should be long. if its left to default int value, errors will happen
    for (i in 100..100000){
        sum = sum + i // this can also be written as sum+=i. kind of like how c++ works
    }
    println("the sum of integers from 100 to 100000 is $sum")
}