fun main() {
    val n = readLine()!!.toInt()
    printNumber(n)
    
}

fun printNumber(n: Int) {
    var count = 1
    var stopLoop = 0
    while (n > stopLoop) {
        repeat(count) {
            if (n <= stopLoop) {
                return 
            }
            print("$count  ") 
            ++stopLoop
        }
        ++count
    }
}
