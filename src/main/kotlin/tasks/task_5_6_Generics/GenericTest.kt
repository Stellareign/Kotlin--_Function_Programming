package org.example.tasks.task_5_6_Generics

/** TODO: Определить универсальную функцию transform
 * 1. Использовать дженерики `<T, R>` для параметризации типов.
 * 2. Принимать коллекцию элементов типа `T`.
 * 3. Принимать лямбда-выражение, преобразующее элемент типа `T` в элемент типа `R`.
 * 4. Преобразовать каждый элемент коллекции с помощью переданного лямбда-выражения.
 * 5. Вернуть новую коллекцию с элементами типа `R`.
 */
fun main() {

}

fun <T, R> transform(list: List<T>, operation: (T) -> R): List <R> {
    val resultList = mutableListOf<R>()
    for (elemelt in list) {
        resultList.add(operation(elemelt))
    }
    return resultList
}