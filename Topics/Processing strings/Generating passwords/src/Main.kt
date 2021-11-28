fun main() {
    val input = readLine()!!.split(" ")
    val smallChar = ('a'..'z').toMutableList()
    val bigChar = ('A'..'Z').toMutableList()
    val num = ('0'..'9').toMutableList()
    val output = mutableListOf<Char>()

    for (i in 0 until input[0].toInt()) {
        output.add(bigChar[i % bigChar.lastIndex])
    }

    for (i in 0 until input[1].toInt()) {
        output.add(smallChar[i % smallChar.lastIndex])
    }

    for (i in 0 until input[2].toInt()) {
        output.add(num[i % num.lastIndex])
    }

    repeat(input[3].toInt() - input[2].toInt() - input[1].toInt() - input[0].toInt()) {
        output.add('?' + it % 10)
    }

    println(output.joinToString(""))
}
