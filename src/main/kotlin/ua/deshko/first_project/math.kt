
fun summ (a:Int, b:Int):Int {
    var summ = a + b
    return summ
}
fun difference (a:Int,b:Int):Int{
    var raznost = a - b
    return raznost
}

fun segmentation (a:Float,b: Float):Float{
    var delenie = a / b
    return delenie
}
fun exponentiate (a: Int, b: Int):Int{
    var stepen = a
    for (x in 1..b-1){
        stepen = stepen * a
    }
    return stepen
}

fun factorial (a:Int):Int{
    var factorial = 1
    print("$a! -> ")
    for (x in 1..a){
        factorial = factorial * x
        print("$x * ")
    }
    return factorial
}

fun triangle (a:Int, b: Int): Boolean {
    if (a != b) {
        return false
    } else {return true}
}

