fun main(){
    val alarm =28
    val alarm2 = 51

    when(alarm){

        12 -> println("Now 12")
        4 -> println("Now 4")
        2 -> println("Now 2")
        3 -> println("Now 3")
        20 -> println("Now 20")
        1,5,6,7 -> println("Now $alarm")
        in 30..50 -> println("Now $alarm is 30 -- 50")
        !in 1..10 -> println("Now $alarm is not 1 -- 10")
        else -> println("Now $alarm")
    }
// Variable value assign from a while loop
    val text = when(alarm2){

        12 -> "Now 12"
        4 -> "Now 4"
        2 -> "Now 2"
        3 -> "Now 3"
        20 -> "Now 20"
        1,5,6,7 -> "Now $alarm2"
        in 30..50 -> "Now $alarm2 is 30 -- 50"
        !in 1..10 -> "Now $alarm2 is not 1 -- 10"
        else -> "Now $alarm2"
    }
    println("Text:= $text")

    // Variable value assign from a while loop
    val text2 = when{
        alarm2 >= 10 -> "Now $alarm2 is 10 -- &"
        alarm2 ==8 || alarm2 ==10 -> "Now $alarm2 is 1 -- 10"
        else -> "Now $alarm2"
    }
    println("Text2:= $text2")
}