fun main() {
    var max = ""
    val text = readLine()!!.split(" ").map {
        if (it.length > max.length) {
            max = it
        }
    }
    println(max)
}
