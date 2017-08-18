package challenges


interface lendable {
    fun borrow()

}

abstract class inventoryitem(open val title: String,
                             open val genera: String,
                             open val year: Int,
                             open var avail: Boolean = true): lendable{
    init {
        println("library item was created")
    }
    open fun info() {
        println("title: $title, genera: $genera, year: $year, available: $avail")
    }

    override fun borrow() {
        if (avail){
            println("you have successfully borrowed $title")
            avail = false
        }else{
            println("this item is not available")
        }
    }



}

class libbook(override val title: String,
              override val genera: String,
              override val year: Int,
              val author: String): inventoryitem(title,genera,year){

    override fun info(){
        super<inventoryitem>.info()
        println("the author is $author")
    }


}

class libdvd(override val title: String,
             override val genera: String,
             override val year: Int,
             val length: Int): inventoryitem(title,genera,year){


    override fun info() {
        super<inventoryitem>.info()
        println("the length: $length")
    }
    //super<inventoryitem>.info()
}

fun main(args: Array<String>) {
    val book1 = libbook("harry1,","kids",1997,"jkr")
    val dvd1 =  libdvd("conair", "action", 1993, 143)
    book1.info()
    dvd1.info()
    book1.borrow()
    dvd1.borrow()
    book1.borrow()
}