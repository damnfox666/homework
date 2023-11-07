package task1

fun main() {
    println("Введите Ваше имя: ")
    val name = readln()
    println("Привет $name")
    println("Введите число от 1 до 3: ")
    var number = 0
    number = readln().toInt()
    if (number != 1 && number != 2 && number != 3) {
        while (number != 1 && number != 2 && number != 3) {
            println("Некоретное число, введите еще раз:")
            number = readln().toInt()
        }
    }
    println("Введите ставку: ")
    val stavka = readln().toInt()
    val numb = (1..3).random()

    if (numb == number)
        println("Вы выиграли " + stavka * 3)
    else println("Вы проиграли, лох ")
}