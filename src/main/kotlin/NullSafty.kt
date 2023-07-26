fun main(){
    var text:String? =null
    text = "Rakibul Shahar"
    println("value:= "+text!!.length)
    println("First Print:= "+text?.length)

    val text2:String? ="Rakib"
    //text2 = "Rakibul"
    println("val value:= "+text2!!.length)
    println("val First Print:= "+text2?.length)

    var text3:String? =null
    text3 = "This variable is not null.."
    var text4 =" "

    if (text3 != null) {
        text4 = text3
    }else{
        text4 = "This variavle is null"
    }

    println("Text4:= "+text4)

}