import search.binarySearch
import search.linearSearch
import sort.selectionSort

fun main(args: Array<String>) {
    val list = listOf(2, 4, 6, 8, 10, 0, 21, 53, 1, 95)
    val binarySearch = binarySearch(list, 95)
    val linearSearch = linearSearch(list, 95)
    val selectionSort = selectionSort(list)

    println(selectionSort)
}
