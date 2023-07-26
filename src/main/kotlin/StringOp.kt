fun main(){
    val text: String? = "Name"
    var text2:String?= "Rakibul"
    text2 = null // val variable change this value

    println("First Print:= "+text?.length)
    if (text !=null){
        println(text.length)
    }else{
        println("The variable is null")
    }

    if (text2 !=null){
        println(text2.length)
    }else{
        println("The variable is null")
    }
}