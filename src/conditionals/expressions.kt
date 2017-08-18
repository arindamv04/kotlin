package conditionals

fun main(args: Array<String>) {
    val mode = 1
//    previously we were using the if and wehn conditions as statements. we can make them return values like expressions too
    var wresult = when(mode){
        1 -> {
            println("this is mode one")
            "this string is assigned to wresult"

        }
        2 -> {
            println("second mode")
            "some string val for mode two"
            43
//            the last expression is the value that gets returned by the conditional statement. in this case its 43
        }
        3 -> "the third case"
        else -> "case not known"
    }

    println(wresult)

   var ifresult = if (mode<3){
       println("same concept being tested on if statements")
       20
   }else {
       50
   }
    println(ifresult)
}

//big takeaway here is that the value of the expression is defined in the last line of each block. no need to use "return"