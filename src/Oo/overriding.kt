package Oo

abstract class course(val topic: String, val price: Double){
    open fun learn(){
        println("learning a $topic course")
    }
}

interface learnable {
    fun learn(){ //observe here that this interface and the class above have the same method name.
        println("learning...")
    }
}

//now, for the child class below, we will be inheriting the method learn from both the abstract class and the interface learnable
//the compiler wont know which one are we trying to use so overriding is absolutly necessary to make sure the compiler knows what to do with this function
open class kotlincourse(): course("kotlin", 999.99), learnable{
    override final fun learn() {//the method from the parent class got overriden.
        //by puting final here, we make sure that no child class of this class can further override the method
        println("i am one of the first people to learn kotlin")
        //if we want the funcationality of the method in the parent class along with what we have mentioned in the overriding
        //we use the keyword super. this allows us to refer to the function in the parent class
        super<course>.learn() //this calls for the original functionality of the learn method from the class course
    }

}

class specialkotlincourse():kotlincourse(){
   // override fun learn() { //an already overriden method can be again overriden in a grand child class.
        //over riden functions are by default open. to prevent further overriding use 'final'
        //println("this is the special kotlin course and you are the first few to learn it")
    }


fun main(args: Array<String>) {
    val course= kotlincourse()
    course.learn()
    val special = specialkotlincourse()
    special.learn()
}