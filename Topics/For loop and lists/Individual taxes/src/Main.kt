private const val HUNDRED = 100

fun main() {
    val n = readLine()!!.toInt()
    val incomes = mutableListOf<Double>()
    val taxes = mutableListOf<Int>()
    repeat(n) {
        incomes.add(readLine()!!.toDouble())
    }
    repeat(n) {
        taxes.add(readLine()!!.toInt())
    }
    val sumMap = mutableMapOf<Double, Int>()
    var sum = 0.0
    for (i in 0 until n) {
        val maxTax = incomes[i] * taxes[i] / HUNDRED
        if (maxTax > sum) {
            sum = maxTax
        }
        sumMap[maxTax] = i + 1
    }
    println(sumMap[sum])
}