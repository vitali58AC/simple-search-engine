fun main() {
    val regex = "[Tt]he".toRegex()
    val input = readLine()!!
    val test = regex.find(input)
    println(test?.range?.first ?: -1)

}