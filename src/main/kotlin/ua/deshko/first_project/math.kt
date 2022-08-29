val scan = java.util.Scanner(System.`in`)
val a:Int = scan.nextInt()
val b:Int = scan.nextInt()
val c:Int = scan.nextInt()


fun summ (a:Int, b:Int) {
    var summ = a + b
    println("$a + $b = $summ")
}
fun raznost (a:Int,b:Int){
    var raznost = a - b
    println("$a - $b = $raznost")
}

fun delenie (a:Int,b: Int){
    var delenie = a / b
    println("$a / $b = $delenie")
}
fun stepen (a: Int, b: Int){
    var stepen = a
    for (x in 1..b-1){
        stepen = stepen * a
    }
    println("$a v stepeni $b = $stepen")
}

fun factorial (a:Int){
    var factorial = 1
    print("$a! -> ")
    for (x in 1..a){
        factorial = factorial * x
        print("$x * ")
    }
    println("ravno $factorial")
}

fun treug (a:Int, b: Int, c:Int) {
    if (a*a+b*b == c*c) {
        println("a = $a, b = $b , c (catet) = $c -> Treugolnik pryamougolniy")
    }
    else {
        println("a = $a, b = $b , c (catet)= $c -> Treugolnik ne pryamougolniy")
    }
}

fun main(args: Array<String>) {
    summ(a, b)
    raznost(a,b)
    delenie(a,b)
    stepen(a,b)
    factorial(a)
    treug(a,b,c)

}