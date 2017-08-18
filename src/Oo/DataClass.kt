package Oo

class book (val title: String, val auth: String, val year: Int, var price: Double){
    override fun toString(): String {//this is the default tostring method that will return when you print an obkect
        //generally it would return package information by default. here we made it return some property values.
        //in data classes this is already take care of for us.
        return "challenges.book: $title, author: $auth, year of print: $year, price $price"
    }

}

//A data class is used to just hold values or properties without any methods. data classes are better than classes just without methods
data class databook (val title: String, val auth: String, val year: Int, var price: Double){
//data classes can have methods too but are not of much use to put here. also, there cannot be abstract dataclasses.
}

fun main(args: Array<String>) {
    val book = book("crazy", "john", 1992, 88.88)
    val databook = databook("sane", "kane", 2002, 55.55)
    val databook2 = databook("sane", "kane", 2002, 55.55)//same as the about except for the name.

    println(book)//printing this will return some internal information about the package. this internal information is defined by a default tostring function that every class has.
    println(databook)//data class has a default tostring function that actually prints out the properties of the object. like lists vs arrays.
    println(databook.equals(databook2))//data class objects can be compared directly using this equals method.
    //this method will check if all the properties of these two objects match. we cant do this with regular objects from class.

    val databook3 = databook.copy(price = 22.22) //we can copy data class objects easily and also mention different values to the properties in that same copy function
    //this  a super easy way of creating objects with an already existing object.

    println(databook3)

    //we can also decompose an object of the data class into its own individual properties.
    val (title, author, year, price) = databook3 //we created variables and fed the properties value from dataclass object into the variables.
    println("data challenges.book 3 had this info $title $author $year $price")
    //observe that the new values used to decompose the object need not match the property name given in the class. order matters. thats it

//    we can create a set of objects using hashSetOf() comand. we can make sets of objects from both class and dataclass
    //when we print a set of dataclass objects, the properties are first compared and only unique objects are printed
    //when we print class objects set, the default tostring info of the objects are printed one after the other.
    //so we can avoid duplicates when making a set of dataclass objects. mostly because the propery values are accessable unline classes

    val set = hashSetOf(databook,databook2,databook3)//since databook and databook2 are the same they will be printed only once
    println(set)

}