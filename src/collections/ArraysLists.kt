package collections

fun main(args: Array<String>) {
    val array = arrayOf("stateone","statetwo","statethree")
    val mixed = arrayOf("item", 34, false, 3.45) //arrays by default can have mixed elements
    val intarray = intArrayOf(1,2,3,4,5) //we can force arrays to be of one data type only
//    elements cannot be added to the array. use this only when you have a fixed number of elements that wont change
    val list = listOf("food one","food tow","food three") //this creates a immutable list. cant change the contents

    val arraylist = arrayListOf("item one","item two","item three")
//    this is a list that internally stores items in an array and resizes the array if necessary. not very clear

    println(array) //cant print arrays like lists. you have to index them as below
    println(mixed[0])
    mixed[0]= "new item" //use intexing to change values also.
    println(mixed[0])
    println(list)
    println(arraylist)

    var st = "arind"
    println(st[0]) //strings are nothing but arrays of char's so you can index refer them the same way

    arraylist.add("item four") //we can add values to the arrayList
    println("the new arrya list with the added item is $arraylist")

//    we can make an array that contains all the elements of two other arrays. can concatnate two arrays in one.
//    all the arrays in this function should be of the same type. the two original and the final single array
    //lets make a new array
    var array2 = arrayOf("state four","state five")
    var newarray = array + array2 //the first and the second array are put in the new array
    println(newarray[3])
    println("the new array is of the size " + newarray.size) //array.size will give you the number of elements in an array
    var state: Boolean = newarray.isEmpty() //this will  tell if an array is empty. would return a boolean value.
    println(state)

//    to check if an array contains an element we can use the contains() function
    var contain = newarray.contains("state four")
    println(contain)//again the return is a boolean. we can also use this in an if statement. do something if it contains...


}