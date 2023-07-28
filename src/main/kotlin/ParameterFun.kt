fun main(){
    getValue(value = 23) // Name have a default parameter
    getValue(message = "Hi")// Name have a default parameter
    getValue("Rakib",23)
    getValue("New User","Hi")
}

// User is a default parameter
fun getValue(name:String="User", value:Int){
     println("Value:= $value Name:= $name")
}

fun getValue(name: String="User", message:String =" "){
   println("Message:= $message Name:= $name")
}