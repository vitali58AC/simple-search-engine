private const val THREE = 3

fun main() {
    var n = readLine()!!.toInt()
    print("$n ")
    if (n == 1) return
    do {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * THREE + 1
        }
        print("$n ")
    } while (n != 1)
}