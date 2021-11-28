package search

import java.io.File

var invertIndexMap = mutableMapOf<String, MutableList<Int>>()
private lateinit var strategy: SearchStrategies

fun main(args: Array<String>) {
    val addresses = checkArgs(args)
    program@ while (true) {
        menu()
        when (readLine()?.toIntOrNull()) {
            1 -> searchQueries(addresses)
            2 -> println(addresses.joinToString("\n"))
            0 -> break@program
            else -> println("Incorrect option! Try again.")
        }
    }
    println("Bye! ")
}

fun menu() {
    println("=== Menu ===")
    println("1. Find an address")
    println("2. Print all addresses")
    println("0. Exit")
}

fun invertIndexSearch(input: List<String>, target: String) {
    var resultList = mutableSetOf<String>()
    val targetList = target.lowercase().split(" ")
    targetList.map { s ->
        if (invertIndexMap.containsKey(s)) {
            val index = invertIndexMap.getOrDefault(s, emptyList())
            if (index.isNotEmpty()) {
                for (i in index) {
                    resultList.add(input[i])
                }
            }
        }
    }
    when (strategy) {
        SearchStrategies.ALL -> {
            resultList.map {
                for (word in targetList) {
                    if (!it.contains(word)) {
                        resultList.remove(it)
                    }
                }
            }
        }
        SearchStrategies.NONE -> {
            resultList = (input.toMutableSet() intersect resultList) as MutableSet<String>
        }
    }
    if (resultList.size == 0) {
        println("Not found.")
    } else {
        println("Addresses found:")
        println(resultList.joinToString("\n"))
    }
}

fun searchQueries(addresses: List<String>) {
    chooseStrategy()
    println("Enter address to search:")
    val queries = readLine()!!
    invertIndexSearch(addresses, queries)
}

fun checkArgs(args: Array<String>) = if (args.size >= 2) {
    val file = File(args[1]).readLines()
    toInvertedIndex(file)
    file
} else {
    println("Incorrect arguments in file")
    emptyList()
}

fun toInvertedIndex(args: List<String>) {
    args.map {
        for (s in it.split(" ")) {
            val value = s.lowercase()
            if (invertIndexMap.containsKey(value)) {
                invertIndexMap.getValue(value).add(args.indexOf(it))
            } else {
                invertIndexMap[value] = mutableListOf(args.indexOf(it))
            }
        }
    }
}

fun chooseStrategy() {
    println("Select a matching strategy: ALL, ANY, NONE")
    while (true) {
        when (readLine()?.uppercase()) {
            "ALL" -> {
                strategy = SearchStrategies.ALL
                break
            }
            "ANY" -> {
                strategy = SearchStrategies.ANY
                break
            }
            "NONE" -> {
                strategy = SearchStrategies.NONE
                break
            }
            else -> println("Incorrect strategy!")
        }
    }
}