fun main() {
    val abc = ('a'..'z').joinToString("")
    val str = readLine()!!
    println(abc.contains(str, ignoreCase = true))
}
