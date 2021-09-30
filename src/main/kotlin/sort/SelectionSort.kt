package sort

/**
 * Selection sort is a sort algorithm that sorts a list
 *
 * * Worst-case performance O(n^2)
 * * Best-case performance O(n^2)
 * * Average-case performance O(n^2)
 *
 * @param list is a list that contains all the element which should be sorted
 * @return a sorted list
 */

fun <T : Comparable<T>> selectionSort(list: List<T>): List<T> {
    val sortedList = mutableListOf<T>()
    list.forEach { _ ->
        val smallest = getSmallest(list.filterNot { sortedList.contains(it) })
        sortedList.add(smallest)
    }
    return sortedList
}

private tailrec fun <T : Comparable<T>> getSmallest(list: List<T>, smallest: T = list[0]): T {
    list.forEach { element ->
        return when {
            list.isEmpty() -> smallest
            element < smallest -> getSmallest(list.dropLastWhile { it == smallest }, element)
            else -> return@forEach
        }
    }
    return smallest
}