fun main(){
    getFun("Rakib") // Name have a default parameter
}

// message is a function  parameter

fun getFun(name: String="User", message:String =functionParameter()){
    println("Message:= $message Name:= $name")
}

fun functionParameter():String{
    var name:String=" "
    name =test()
    return name
}

fun test()="I am from Test Method" // single line parameter method without return type

//fun test(test:String):String{
//    return test
//}

