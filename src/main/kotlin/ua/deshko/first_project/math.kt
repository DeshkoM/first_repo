
fun summ (a:Int, b:Int):Int = a + b
fun difference (a:Int,b:Int):Int = a - b
fun multipl (a:Int, b: Int) :Int = a * b
fun segmentation (numerator:Int, denominator: Int):Float{
    val a2 = numerator.toFloat()
    val b2 = denominator.toFloat()
    if (b2 > 0F){
        return a2/b2
    }
return a2/b2
}
fun exponentiate (baseOfDegree: Int, degree: Int): Float {
    var stepen = baseOfDegree.toFloat()
    var x = 1
        while (x < degree) {
            stepen = stepen * baseOfDegree
            x++
        }
    if (degree>0){
        return stepen
    }
    else if(degree<0){
        return 1/stepen
    }
    else return 1.0F
}

fun factorial (base:Int):Int{
    var x = 1
    var factorial = 1
    while (base < 0 ){
        break
    }
    while (0 < base && x <= base){
        factorial = factorial * x
        x = x + 1
    }
    while (base == 0) {
        return 0
    }
    return factorial
}


fun isTriangle (a:Int, b: Int, c:Int):Boolean{
    if (summ(a,b)>c && summ(a,c)>b && summ(b,c)>a){
    return true
    }
    return false
}
fun maxOfThree (a: Int, b: Int, c: Int):Int {
    val arr = arrayOf(a,b,c)
    var smalest = arr[0]
    for (index in arr.indices){
        if (smalest < arr[index]){
            smalest = arr[index]
        }
    }
    return smalest
}
fun chooseMax(arr:Array<Int>):Int{
    var largest_elem = arr[0]
    for (index in arr.indices){
        if (largest_elem < arr[index]){
            largest_elem = arr[index]
        }
    }
    return largest_elem
}
fun minOfTrhree (a: Int, b: Int, c: Int):Int {
    val arr = arrayOf(a,b,c)
    var smalest = arr[0]
    for (index in arr.indices){
        if (smalest > arr[index]){
            smalest = arr[index]
        }
    }
    return smalest
}
fun chooseMin(arr: Array<Int>):Int{
    var smalest = arr[0]
    for (index in arr.indices){
        if (smalest > arr[index]){
            smalest = arr[index]
        }
    }
    return smalest
}

fun middleOfThree (a: Int, b: Int, c: Int):Int {
    val arr = arrayOf(a,b,c)
    val max = maxOfThree(a,b,c)
    val min = minOfTrhree(a,b,c)
    var middle = arr[0]
    for (index in arr.indices){
        if (arr[index] != max && arr[index] != min){
            middle = arr[index]
            return middle
        }
    }
    return middle
}
fun isTriangleRectangular (a: Int,b: Int, c: Int):String{
    val triangle = isTriangle(a, b, c)
    val hipotenus = maxOfThree(a, b, c)
    val min = minOfTrhree(a, b, c)
    val middle = middleOfThree(a, b, c)
    if (triangle == true && exponentiate(min,2) + exponentiate(middle,2) == exponentiate(hipotenus,2)){
        return "Треугольник существует, треугольник прямоугольный"
    } else if (triangle == false){
       return "Не треугольник"
    } else {
        return "Другой треугольник"
    }
}
/*fun choose_type_triangle (a: Int,b: Int, c: Int): String{
    val triangle = isTriangle(a, b, c)
    val hipotenus = chooseMax(a, b, c)
    val min = chooseMin(a, b, c)
    val middle = chooseMiddle(a, b, c)
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
fun main (){
    val arr = arrayOf(1,2,3)
    var elem = arr[0]
    for (index in arr.indices){
        if (elem < arr[index]){
            elem = arr[index]
        }
    }
}*/



