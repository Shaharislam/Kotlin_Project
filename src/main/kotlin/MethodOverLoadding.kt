fun main(){
    val max = getMax(12,45)
    val max2 = getMax(32.5,34.6)
    val max3 = getMax(32,34,31)
    println("Method Overload Max value:= $max")
    println("Method Overload Max2 value:= $max2")
    println("Method Overload Max3 value:= $max3")
}

fun getMax(a:Int, b:Int) = if (a>b) a else b
fun getMax(a:Double, b:Double) = if (a>b) a else b

fun getMax(a:Int, b:Int , c:Int):Int {
    if (a>=b && a>=c){
        return a
    }else if (b>=a && b>=c){
        return  b
    }else{
        return c
    }
}