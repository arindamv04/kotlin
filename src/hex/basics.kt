package hex

fun main(args: Array<String>) {
    // hexa decimals are from 1...9,A,B,C,D,E,F
    //totally there are 16 digits so they are base 16
    //F in hex is 15 and 10 in hex is 16
    //hex is shown as 0x1F this is 16+15

    println(0x1F) //this is 16 + 15
    println(0x2F)
    println(0xFF)//FF is the largest two digit hex number which is 255. also the largest value for rgb

    //for colours red is a two digit, green is the next two and finally blue the smallest two digits

    println(0x000000)// this is 0 red 0 green and 0 blue that is black
    println(0xFFFFFF)// this is colour white
    println(0xFF0000)//this is red
    println(0b1001 and 0b1000) //this should return 8 as 2^3 is 8
    println(0b01)
}

//we can use this to define the properties of the colour enum

//binary numbers are base to and you already know hw to read them.

//and is a bit wise operator that goes bit by bit giving back the result of an and gate\