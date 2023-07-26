fun main(){
    val maxValue = getMaxValue(200,350)
    println("Return MaxValue:= $maxValue")
    val singleMax = singleLineMethod(250,150)
    println("I am from Single Line Method Max Value: $singleMax")
}

fun getMaxValue(a:Int,b:Int):Int{
//    val max = if(a>b) a else b
//    println("Max value:= $max")
//    return max
    if (a>b){
        return a
    }else{
        return b
    }
}

fun singleLineMethod(a:Int, b:Int) = if (a>b) a else b