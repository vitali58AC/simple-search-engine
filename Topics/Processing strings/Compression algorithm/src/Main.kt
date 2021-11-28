fun isPrime(number: Int): Boolean {
    for (i in 2..(number / 2)) {
        if (number % i != 0)
            continue
        else
            return false
    }
    return true
}

fun main() {
    var greatestPrimeInRange = 2
    for (number in 2..1000) {
        if (isPrime(number) && number > greatestPrimeInRange)
            greatestPrimeInRange = number
    }
}