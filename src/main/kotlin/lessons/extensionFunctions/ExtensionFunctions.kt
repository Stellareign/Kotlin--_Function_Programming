package org.example.lessons.extensionFunctions

/**
 * Функции вынесены в отдельный файл; добавлено ключевое слово inline (для опыта)
 */
inline fun <T, R> Iterable<T>.transformElement(operation: (T) -> R): List<R> { // более универсальный метод, принимающий на вход любые коллекции
    val result = mutableListOf<R>()
    for (element in this) {
        result.add(operation(element))
    }
    return result
}

inline fun <T> Iterable<T>.filterList(isSuitable: (T) -> Boolean): List<T> {
    val filterList = mutableListOf<T>()
    for (element in this) {
        if (isSuitable(element)) {
            filterList.add(element)
        }
    }
    return filterList
}
