fun main() {
    val list = List(readLine()!!.toInt()) {
        readLine()!!.toInt()
    }
    val nums = readLine()!!.split(" ")
    if (list.contains(nums[0].toInt()) && list.contains(nums[1].toInt())) {
        println("YES")
    } else {
        println("NO")
    }
}
