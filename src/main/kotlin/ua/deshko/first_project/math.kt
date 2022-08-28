val scan = java.util.Scanner(System.`in`)
val a:Int = scan.nextInt()
val b:Int = scan.nextInt()
val c:Int = scan.nextInt()


fun main(args: Array<String>) {
    var summ = a + b
    println("$a + $b = $summ")  //сумма двух чисел

    var raznost = a - b
    println("$a - $b = $raznost")   //разница двух чисел

    var delenie = a / b
    println("$a / $b = $delenie")   //делени двух чисел

    var stepen = a
    for (x in 1..b-1){
        stepen = stepen * a
    }
    println("$a v stepeni $b = $stepen ") //число в степени х

    var mass:Array<Int> = arrayOf(a,b,c)
    var summ_2 = mass[0] + mass[1] + mass[2]
    println("$a + $b + $c = $summ_2")   //сумма чисел в диапазоне

    var factorial = 1
    print("$a! -> ")
    for (x in 1..a){
        factorial = factorial * x
        print("$x * ")
    }
    print("ravno $factorial")       //факториал числа
    println()

    if (a*a+b*b == c*c){
        println("a = $a, b = $b , c (catet) = $c -> Treugolnik pryamougolniy")
    }
    else {
    println("a = $a, b = $b , c (catet)= $c -> Treugolnik ne pryamougolniy")
    }
}



