fun main() {
    val list = List(readLine()!!.toInt()) {
        readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    println(if (list.contains(m)) {
        "YES"
    } else {
        "NO"
    })
}
