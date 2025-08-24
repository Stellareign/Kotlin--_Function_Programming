package org.example.tasks.task_5_7_ExtensionFunc

import java.io.PrintStream

/**TODO: Напишите extension-функцию для класса List<Int>
 * 1. Назовите её sumOfEvens.
 * 2. Подсчитайте сумму всех чётных чисел в списке.

 * TODO: Напишите функцию processList
 * 1. Считайте строку чисел, введённую пользователем.
 * 2. Преобразуйте строку в список целых чисел.
 * 3. Вызовите extension-функцию sumOfEvens для списка.
 * 4. Выведите результат вычисления.
 */
fun main() {
    processList()
}

fun List<Int>.sumOfEvens(): Int {
    var sum = 0
    for (item in this) if (item % 2 == 0) {
        sum += item
    }
    return sum
}

fun processList() {
    val listFromString = mutableListOf<Int>()
    println("Введите числа, разделённые пробелом")
    val numberString = readln()

    for (element in numberString.split(" ").toList()) {
        listFromString.add(element.toInt())
    }
    println("Сумма чётных чисел: ${listFromString.sumOfEvens()}")
}