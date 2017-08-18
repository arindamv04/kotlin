package challenges

class book(var title: String, var author: String, var year: Int, var out: Boolean){
// define variables in () right next to the class name in case you dont want to initialise values with default values
    fun details(){ //challenges.book details printing method
        println("title: $title")
        println("author: $author")
        println("date of publication: $year")
        if (out == true){
            println("the challenges.book is out")
        }else{
            println("the challenges.book is available")
        }

    }

    fun borrow(s: String){ //method to update challenges.book status when challenges.book is borrowed or returned
        when(s){
            "borrow","Borrow" -> {
                if (out){
                    println("this challenges.book is already borrowed")
                }else{
                    out = true
                    println("your transaction has been processed")
                }
            }
            "return", "Return" -> {
                if (!out){
                    println("the challenges.book is already here. what's to return?")
                }else{
                    out = false
                    println("your transaction has been processed")
                }
            }
            else -> {
                println("type borrow or return to make a valid transaction")
            }
        }


    }
}

fun main(args: Array<String>) {
    var potterbook = book("harry potter challenges.book one", "j.k. Rowling", 1997, false)
    //making an object with all the information passed as arguments.

    potterbook.details()
    potterbook.borrow("borrow")
    println()
    potterbook.details()
}