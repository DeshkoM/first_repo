
fun summ (a:Int, b:Int):Int = a + b
fun difference (a:Int,b:Int):Int = a - b
fun multipl (a:Int, b: Int) :Int = a * b
fun segmentation (a:Int,b: Int):Float{
    val a2 = a.toFloat()
    val b2 = b.toFloat()
    if (b2 == 0.0F){
        return 0.0F
    }
    else {
        return a2/b2
    }
}
fun exponentiate (a: Int, b: Int): Float {
    var stepen = a.toFloat()
    var x = 1
        while (x < b) {
            stepen = stepen * a
            x++
        }
    if (b>0) return stepen else if(b<0) return 1/stepen else return 1.0F
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

fun is_triangle (a:Int, b: Int, c:Int):Boolean{
    if (summ(a,b)>c && summ(a,c)>b && summ(b,c)>a){
    return true
    } else {
        return false
    }
}
fun choose_max (a: Int, b: Int, c: Int):Int {
    val arr = arrayOf(a,b,c)
    var max = if (arr[0]> arr[1] && arr[0]>arr[2]) {
        return arr[0].toInt()
    }
    else if (arr[1]> arr[2] && arr[1]>arr[0]){
        return arr[1].toInt()
    }
    else{
        return arr[2].toInt()
    }
}
fun choose_min (a: Int, b: Int, c: Int):Int {
    val arr = arrayOf(a,b,c)
    var min = if (arr[0]< arr[1] && arr[0]<arr[2]) {
        return arr[0].toInt()
    }
    else if (arr[1]< arr[2] && arr[1]<arr[0]){
        return arr[1].toInt()
    }
    else{
        return arr[2].toInt()
    }
}
fun choose_middle (a: Int, b: Int, c: Int):Int {
    val arr = arrayOf(a,b,c)
    var min = if (arr[0] > arr[1] && arr[0] < arr[2] || arr[0] < arr[1] && arr[0] > arr[2]) {
        return arr[0].toInt()
    }
    else if (arr[1]> arr[2] && arr[1] < arr[0] || arr[1]<arr[2] && arr[1]>arr[0]){
        return arr[1].toInt()
    }
    else if (arr[2]> arr[0] && arr[2] < arr[1] || arr[2] < arr[0] && arr[2] > arr[1]){
        return arr[2].toInt()
    }
    else if (arr[0]==arr[1] && arr[0] != arr[2]){
        return arr[0].toInt()
    }
    else if (arr[1]==arr[2] && arr[1] != arr[0]){
        return arr[1].toInt()
    }
    else if (arr[2]==arr[0] && arr[2] != arr[1]){
        return arr[2].toInt()
    }
    else return arr[0].toInt()

}
fun choose_type_triangle (a: Int,b: Int, c: Int): String{
    val triangle = is_triangle(a, b, c)
    val hipotenus = choose_max(a, b, c)
    val min = choose_min(a, b, c)
    val middle = choose_middle(a, b, c)
    if (triangle == true && exponentiate(min,2) + exponentiate(middle,2) == exponentiate(hipotenus,2)){
        return "Треугольник существует, треугольник прямоугольный"
    }
    else if (triangle == true && min == middle && min == hipotenus){
        return "Треугольник существует, треугольник равносторонний"
    }
    else if (triangle == true && multipl(a,b)+multipl(b,c) > multipl(a,c)){
        return "Треугольник существует, треугольник разносторонний"
    }
    else return "Другой треугольник"
}



