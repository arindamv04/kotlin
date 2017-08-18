package Oo

class house(val colour: String, val hight: Double, var price: Int = 10){ //we set a default value for price.
    //when a value for price is not passed in the constructor wile object creation, the default value is assumed
    //this means we can set default values for optional values that can be ommited in the constructor while object creation
    //this means different constructor structers are possible for the same class (omiting the mention of default values)
    //this is called constructor overloading. for this to work in java, one had to define multiple constructors.
    fun details(){
        println("This house [colour = $colour , hight = $hight , price = $price]")
    }
}

fun main(args: Array<String>) {
    val bighous = house("blue", 4.3 , 400000) //this is the usual wau of feeding a constructor
    val redhouse = house(hight = 6.3, price = 7830845, colour = "red")//we can also use the names given in the class
    //this way of feeding a constructor lets us avoid confusion about which value is for what
    //it also lest us mix up the order of the valuse in the constructor. very useful
    val greenhouse = house(hight = 9.9, colour = "green") //here we skipped the price so the default value will show up
    //this is constructor overloading.

    bighous.details()
    redhouse.details()
    greenhouse.details()

}