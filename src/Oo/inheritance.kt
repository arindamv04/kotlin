package Oo

open class human(open val name: String, open var age: Int){//to allow other classes inherit from this class, need to declare this class open
    //also, if the child class needs to take values for what were mentioned here in the parent, then these values should also be declared open
    //the valuse are open because we are passing new valuses for these variables through the child class constructor

    init {
        println("the object was created!")
    }

    fun speak(){
        println("Hello World! I am $name")//the reference to name here is from the class constructor. not the function below.

    }


    fun greet(name: String){
        println("Hello $name")//the reference to name here is the parameter of this method. not the name from the class constructor
        println("i am " + this.name)//this is how you refer to the challenges.main constructor variable
        println("my age is $age")
    }
}

class student(override val name: String,override var age: Int, val studentid: Long ): human(name, age){//the way to inherit is as shown
    // first, we need to 'override' the valuses of the parent class with the valuse we are initialising here.
    //next we need to pass this class's values to a constructor of the parent class shown after the':'
    //the child class can have unique properties different from parent. these can be initialised in the constructor as usual
    fun studentdetails(){//the child class can also have additional methods too
    println("student id given is $studentid")
}
    fun payfee(){
        println("the fees has been payed for the student $name")
    }

}

class studentage(override val name: String): human(name, 22){
    //here we decided that all objects of this child class will have the age of 22. we dont have to override the age. we dont even need to mention it
    //all we have to do is mention the default value in the constructor. also, we dont need to make this variable open since we are not overriding it.

}
fun main(args: Array<String>) {
    var person1 = human(name = "max", age = 39)
    person1.speak()
    person1.greet("john")
    var boy = student("roll1", 20,398485)//additional details (student id) passed in the constructor normally
    boy.speak()
    boy.greet("roll2")
    boy.studentdetails()//additional functions of the child class called as usual.
    boy.payfee()
    var boy2 = studentage("roll2")
    boy2.speak()
    boy2.greet("roll3")


}