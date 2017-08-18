package functions

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,6,8,9)
    println(reverse(numbers))
    println(reverse2(numbers))

}

fun reverse(list: List<Int>): List<Int>{ //this function will take in a list of int type and return a list of int type.
    //this is how you specify that a var will be of type list of integers. interesting
    var result = arrayListOf<Int>()
    for (i in 0..list.size-1){  //i will go from 0 to the last index of the list given as input
        result.add(list[list.size-1-i])//or use the .get fuction with the () insted of the []
    }
    return result

}

fun reverse2(list: List<Int>): List<Int>{
    var result = arrayListOf<Int>()
    for (i in list.size -1 downTo 0){ //when going from low to high we have the .. to represent range. here we are going from high to low
        //we use the down to keyword. just using the two dots wont work when going from high to low. reverse for loop
        result.add(list[i])
    }
    return result
}