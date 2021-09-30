package search

/**
 * Linear search is an algorithm which finds the position of a target value within an array (Sorted)
 *
 * * Worst-case performance	O(n)
 * * Best-case performance	O(1)
 * * Average performance	O(n)
 *
 * @param list is an array where the element should be found
 * @param key is the element which should be found
 * @return index of element if found or -1 if not found
 */

fun <T : Comparable<T>> linearSearch(list: List<T>, key: T): Int {
    return linearSearchImpl(list, key)
}

private fun <T> linearSearchImpl(list: List<T>, key: T): Int {
    list.forEachIndexed { index, element ->
        if (element == key) return index
    }
    return -1
}
