fun main() {
    val listLength = readLine()!!.toInt()
    val list = List(listLength) { readLine()!!.toInt() }
    var counter = 1
    var maxLength = 0
    for (i in 0 until list.lastIndex) {
        if (list[i] <= list[i + 1]) {
            ++counter
        } else {
            if (counter >= maxLength) maxLength = counter
            counter = 1
        }
    }
    if (maxLength < counter) maxLength = counter
    println(maxLength)
}