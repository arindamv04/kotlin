package challenges

fun main(args: Array<String>) {

//    if the challenges.book name contains e, then print each alphabit in that challenges.book name on a new line
    var books = arrayListOf("rain maker", "harry potter", "gita", "kotlin")
    for (item in books){
        if (!item.contains('e')){ //this is checking if the challenges.book name doesnt contain e
            continue
        }
        for (e in item){
            println(e)
        }
        println("--")
    }

    for (ele in books){
        if (ele.contains('e')){ //and this checks if the item does contain
            for (al in ele){
                println(al)
            }
        }
        println("--")

    }
}