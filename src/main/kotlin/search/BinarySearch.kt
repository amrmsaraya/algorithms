package search

/**
 * Binary search is an algorithm which finds the position of a target value within an array (Sorted)
 *
 * * Worst-case performance	O(log(n))
 * * Best-case performance	O(1)
 * * Average performance	O(log(n))
 *
 * @param list is an array where the element should be found
 * @param key is the element which should be found
 * @return index of element if found or -1 if not found
 */

fun <T : Comparable<T>> binarySearch(list: List<T>, key: T): Int {
    return binarySearchImpl(list, key)
}

private tailrec fun <T : Comparable<T>> binarySearchImpl(
    list: List<T>,
    key: T,
    start: Int = 0,
    end: Int = list.size - 1
): Int {
    val mid = start + (end - start) / 2

    return when {
        start > end -> -1
        list[mid] == key -> mid
        list[mid] > key -> binarySearchImpl(list = list, key = key, end = mid - 1)
        else -> binarySearchImpl(list = list, key = key, start = mid + 1)
    }
}
