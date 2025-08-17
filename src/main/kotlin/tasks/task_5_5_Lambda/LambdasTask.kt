package org.example.tasks.task_5_5_Lambda

import java.io.PrintStream



/** TODO: Определить функцию высшего порядка processNumbers
1. Функция должна принимать:
- Список чисел для обработки.
- Лямбда-выражение для фильтрации чисел (возвращает Boolean).
- Лямбда-выражение для преобразования чисел (возвращает Int).
2. Реализовать логику фильтрации чисел на основе переданного лямбда-выражения.
3. Преобразовать отфильтрованные числа с помощью второго лямбда-выражения.
4. Вернуть новый список с преобразованными числами.
TODO: Определить функцию startProcessing
1. Вывести сообщение: "Введите числа, разделенные пробелами:".
2. Считать строку чисел, введённую пользователем.
3. Преобразовать строку в список чисел.
4. Вызвать функцию processNumbers с:
- Условием: числа больше 10.
- Преобразованием: умножение числа на 3.
5. Вывести результат обработки в формате: "Результат обработки: [<результат>]".
 **/
fun main() {
    System.setOut(PrintStream(System.out, true, "UTF-8"))
startProcessing()
}

fun processNumbers(list: List<Int>, filter: (Int) -> Boolean, transNum: (Int) -> Int): List<Int> {
    val newList = mutableListOf<Int>()
    for (num in list) {
        if (filter(num)) {
            newList.add(transNum(num))
        }
    }
    return newList
}

fun startProcessing() {
    val numList = mutableListOf<Int>()
    println("Введите числа, разделенные пробелами:")
    val numbers = readln()
    for (s in numbers.split(" ").toList()) {
        numList.add(s.toInt())
    }

    val filterTransList = processNumbers(numList, { x: Int -> x > 10 }, { x -> x * 3 })


     println("Результат обработки: $filterTransList")
}

