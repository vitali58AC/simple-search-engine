fun main() {
    val input = readLine()!!.lowercase()
    var count = 0
    for (ch in input) {
        if (ch == 'g' || ch == 'c') {
            ++count
        }    
    }
    val result = count.toDouble() / input.length * 100
    println(result)    
}
