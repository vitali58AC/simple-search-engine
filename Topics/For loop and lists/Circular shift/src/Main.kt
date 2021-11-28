fun main() {
    val list = mutableListOf<Int>()
    repeat(readLine()!!.toInt()) {
        list.add(readLine()!!.toInt())
    }
    val newList = listOf(list.removeAt(list.size - 1))
    println((newList + list).joinToString(" "))
}
