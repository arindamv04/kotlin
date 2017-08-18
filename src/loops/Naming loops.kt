package loops

fun main(args: Array<String>) {
   outer@ for (i in 1..10){
        for (j in 1..10){
            if (i-j == 5){
                break@outer //this @outer is a way to tell the break command to break the outer loop and not the inner
                // of we dont have this naming and reference then the break comand will break the j loop and carry on with the i loop
            }
            println("$i - $j")
        }
    }
}