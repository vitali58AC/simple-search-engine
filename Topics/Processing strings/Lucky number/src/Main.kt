fun main() {
val num = readLine()!!
    val div = num.length / 2
    val (a, b) = List(2) {
        mutableListOf<Int>()
    }
    val startList = num.substring(0 until div)
    val endList = num.substring(div..num.lastIndex)
    for (d in startList) {
        a.add(d.toInt())
    }
    for (d in endList) {
        b.add(d.toInt())
    }
    println(if (a.sum() == b.sum()) "YES" else "NO")
}
