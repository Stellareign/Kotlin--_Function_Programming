package org.example.lessons.extensionFunctions

    fun <T, R> List<T>.transformElement(operation: (T) -> R): List<R> {
        val result = mutableListOf<R>()
        for (element in this) {
            result.add(operation(element))
        }
        return result
    }

    fun <T> List<T>.filterList(isSuitable: (T) -> Boolean): List<T> {
        val filterList = mutableListOf<T>()
        for (element in this) {
            if (isSuitable(element)) {
                filterList.add(element)
            }
        }
        return filterList
    }
