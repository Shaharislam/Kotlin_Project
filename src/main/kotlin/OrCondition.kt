fun main(){
    val num1 = -5
    val num2 = -6

    val text = if (num1 == num2){
        "Text = 1"
    }else if (num1 > num2){
        "Text1 > Text2"
    }else if (num1 < num2){
        "Text1 < Text2"
    }
    else
        "Text = 3"

    println("$text")

    if (num1>0 || num2 >0)
    {
        println("This is true")
        println("This is same text")
    }else
        println("This value is not greater than zero")
}