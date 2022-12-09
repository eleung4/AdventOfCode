fun main() {
    val input = readInput("numbers")
    println("Sum: ${sumAllNums(input)}")
    println("Min: ${findMin(input)}")
    println("Sum two smallest nums: ${findTwoSmallest(input)}")
    println("Number of words: ${countWords(wordInput)}")

}

fun sumAllNums(input: List<String>) : Int {
//    var total = 0
//    for(x in input) {
//        total += x.toInt()
//    }
//    return total
    return input.map { it.toInt() }.sum()
}

fun findMin(input : List<String>) : Int {
    var min = Integer.MAX_VALUE
    for(x in input) {
        if(x.toInt()<min) {
            min = x.toInt()
        }
    }
    return min
    // return input.map { it.toInt() }.min()
}

fun findTwoSmallest(input : List<String>) : Int {
    val sorted = input.map { it.toInt() }.sorted()
    println(sorted.take(2))
    return input.map {it.toInt() }.sorted().take(2).sum()
    // return sorted[0] + sorted[1]
}

val wordInput = readInput("sentences")


// a word is any string that doesn't contain a space
fun countWords(input : List<String>) : Int {
    var count = 0
    for(i in input.indices) {
        val words = input[0].split( " ")
        println(words)

        count += words.size
    }
    return count
}

fun countHWords(input : List < String>) : Int {
    var count = 0
    for (line in input) {
        val words = line.split(" ")
        for(i in words.indices) {
            if(words[i].startsWith("h"))

            count++
        }
    }
    return count
}
//
//fun countHWords(input : List<String>) : Int {
//    var count = 0
//    for(line in input) {
//        count+=line.split(" ").count {
//            it.startsWith(" h", ignoreCase = true)
//        }
//    }
//    return count
//}



// for (i in 0<...<input.size-1)
// for (i in 0 < until <input.size)
// for (i in input.indices)