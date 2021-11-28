fun main() {
    val i = readLine()!!
    if (i[0].toInt() + i[1].toInt() + i[2].toInt() == i[3].toInt() + i[4].toInt() + i[5].toInt()) {
        println("Lucky") 
    } else {
        println("Regular")
    }     
}
