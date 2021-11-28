fun main() {
    val list = List(readLine()!!.toInt()) {
        readLine()!!.toInt()
    }
    var num = 0
    for (index in 0..list.size - 3) {
        if (list[index + 1] - list[index] in 0..1 && list[index + 2] - list[index] in 0..2) {
            ++num
        }
    }
    println(num)
}
