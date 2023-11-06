package task1

fun main() {
    println("Введите два числа: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    for (i in num1..num2) {
        println(i)
    }
}