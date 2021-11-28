fun main() {
    val input = readLine()!!
    if (input.length % 2 == 0) {
        println(input.removeRange(input.length / 2 - 1..input.length / 2 ))
    } else {
        val oddInput = input.replaceFirst("${input[input.length / 2]}","")
        println(oddInput)
    }
}