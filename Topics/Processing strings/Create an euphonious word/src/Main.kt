fun main() {
    val input = readLine()!!
    val vowels = "aeiouy"
    var countVowels = 0
    var countConsonants = 0
    var count = 0
    for (i in input) {
        if (vowels.contains(i)) {
            countConsonants = 0
            ++countVowels
        } else {
            countVowels = 0
            ++countConsonants
        }
        if (countVowels == 3 || countConsonants == 3) {
            ++count
            countConsonants = 1
            countVowels = 1
        }
    }
    println(count)
}