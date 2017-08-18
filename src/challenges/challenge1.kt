package challenges

import java.util.*

fun main(args: Array<String>) {
    val ran = Random().nextInt(50) + 1  //this function will generate from 0 to 49 so the +1
    when (ran) {
        in 1..10 -> println("1 to 10 is the range of " + ran)
        in 11..20 -> println("11 to 20 is the range of " + ran)
        in 21..30 -> println("21 to 30 is the range of " + ran)
        in 31..40 -> println("31 to 40 is the range of " + ran)
        else -> println("its beyond 40 and the value is $ran") //this can also be a way of printing multiple stuff in on line

    }
}