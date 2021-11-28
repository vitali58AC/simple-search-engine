fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    var max = 0
    repeat(n) {
        val currentNum = readLine()!!.toInt()
        list.add(currentNum)
        if (currentNum > max) {
            max = currentNum
        }
    }
    for (index in list.indices) {
        if (list[index] >= max) {
            println(index)
            ++max
        }
    }
}
