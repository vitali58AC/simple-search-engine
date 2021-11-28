fun main() {
    val (s, n) = readLine()!!.split(" ")
    if (n.toInt() <= s.length) {
        val subPart = s.substring(0, n.toInt())
        println(s.removeRange(0, n.toInt()) + subPart)
    } else {
        println(s)
    }

}