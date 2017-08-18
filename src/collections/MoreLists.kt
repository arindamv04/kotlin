package collections

fun main(args: Array<String>) {
    var arraylist = arrayListOf("arindama","rama","krishna")
    println(arraylist[0]) //can access elements in a array list just like arrays
    var arraylist2 = arrayListOf("vennelakanti")
    var fullname = arraylist + arraylist2 //concatnation of array lists works the same way as arrays. simple + will do
    println(fullname)
    println("array size is " + fullname.size) //finding size is also the same. simple .size function

    // is empty and contains functions also work the same way as arrays.



    //now let us look at the differences when looking at the lists.
    arraylist.add("v") //this adds the element at the end of the list
    println(arraylist)
    arraylist.add(1,"sharma") //this will add the element to the second place in the list
    println(arraylist)

    var arraybool:Boolean = arraylist.remove("sharma")
    println(arraylist)
    println(arraybool) //this would be true of the element was removed. false otherwise.

//    both arrarylist.add and .remove return a boolean value. true if they could do it.
//    this feature becomes important in .remove because this tells you if the element was there to begin with



    //    sublists allows us to pick some elements in a list from start index to an end index
    val sublist = arraylist.subList(1,3) //the second index (ending index) is not inclusive
    println(sublist)
}