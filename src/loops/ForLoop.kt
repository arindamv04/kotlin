package loops

fun main(args: Array<String>) {
    //when you use forloops you need to know howmany iterations you need well in advance
    //unless you are running the loop over the length of an array or a list. in which case the list lengts will stop the loop

    for (i in 1..10){  //simple example of a for loop. no need to define i before hand.
        println(i)
    }

    var sum = 0
    for (j in 1..100){
        sum = sum + j
    }
    println("the sum of first 100 numbers is $sum")

    //loops on lists

    var list = listOf("java","kotlin","python")
    for (e in list){ //we dont to use i in the loop and then as an index in the list. we simply can define a var in the loop thatwill take the value of each element in the list.
        println(e) //this is something like for each element in the list.
    }

    //withindex() function gives you not just the value of the list but also the index number of that value.
    //this function first returns the index and then the actual value of the list element.
    //to use this, we need two elements in the for loop. one to hold the index and the second to hold the value.

    for ((index, value) in list.withIndex()){
        println("the value at $index is $value")
    }
}