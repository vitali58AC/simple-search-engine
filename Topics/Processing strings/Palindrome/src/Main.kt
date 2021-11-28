fun main() {
    val text = readLine()!!.toLowerCase()
    var txet = ""
    for (ch in text.length - 1 downTo 0) {
        txet += text[ch]
    }
    println(if (text == txet) {
        "yes"
    } else {
        "no"
    })    
}
