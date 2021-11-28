fun main() {
    val sizeList = readLine()!!.toInt()
    val list = List(sizeList) {
        readLine()!!.toInt()
    }
    val target = readLine()!!.split(" ")
    var counter = 0
    for (i in 0 until list.lastIndex) {
        if (
            (list[i] == target[0].toInt() || list[i] == target[1].toInt()) && 
            (list[i + 1] == target[1].toInt() || list[i + 1] == target[0].toInt())
        ) {
            ++counter
        }
    }
    if (counter > 0) println("NO") else println("YES")
}
