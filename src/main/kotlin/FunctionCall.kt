fun main(){
firstMethod("Rakib",23)
    val hasInternetConnection = false
    if (hasInternetConnection){
        getData("Bristy")
    }else{
        showMessage()
    }
}

fun firstMethod(name:String, age:Int){
    println("Hello ,$name Hi I have Called from FirstMethod I am $age years old")
}

fun getData(data:String){
    println("Hello $data I am from getData Method")
}

fun showMessage(){
    println("I am from ShowMessage method")
}