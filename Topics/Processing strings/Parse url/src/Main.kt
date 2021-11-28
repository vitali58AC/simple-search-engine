fun main() {
    val url = readLine()!! 
    val tagPart = url.substringAfter('?').split('&')
    var password = ""
    for (tag in tagPart) {
        val temp = tag.split('=')
        if (temp[1].length > 0) {
            if (temp[0] == "pass") {
                password = temp[1]
            }
            println("${temp[0]} : ${temp[1]}")
        } else {
            println("${temp[0]} : not found")
        }
    }
    if (password.isNotEmpty()) println("password : $password")
}
