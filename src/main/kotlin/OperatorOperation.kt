fun main(){
    val x = 34
    val y = 5f

    println("X + Y := ${x + y}")
    println("X - Y := ${x - y}")
    println("X * Y := ${x * y}")
    println("X / Y := ${x / y}")
    println("X % Y := ${x % y}")

    println("3 * 3 + 4:= ${3 * 3 + 4}")

    var result = x + y
    result = result + 2
    println("Result + 2:= $result")

    result = result - 2
    println("Result - 2:= $result")

    result = result * 2
    println("Result * 2:= $result")

    result = result / 2
    println("Result / 2:= $result")

    result = result % 2
    println("Result % 2:= $result")

    result += 2
    println("Result +=  $result")

    result -= 2
    println("Result -=  $result")

    result *= 2
    println("Result *= $result")

    result /= 2
    println("Result /= $result")

    result %= 2
    println("Result %= $result")

    // ++ , --
    var a = 0
    println("A++ := ${a++}")
    println("After Increment A: $a and Now  ++A:= ${++a}")
    var b =0
    println("++B:= ${++b}")

    println("A--:= ${a--} Now A= $a")
    println("--A:= ${--a}")

}