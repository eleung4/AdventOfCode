fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    // println((part1(testInput)


//    val input = readInput("Day01")
//    println(part1(input))
    // println(part2(input))

    val input = readInput("Day01")

    println(calsPerElf(input))

}

fun calsPerElf(input: List<String>) : Int {
    var now= 0
    var greatest = 0
    val array = ArrayList<Int>()
    for(line in input) {
        if(line!="") {
            now +=line.toInt()
            array.add(now)


        }
        else {
            if(now>greatest) {
                greatest = now
                now = 0
            }
            now = 0
        }
    }
    if(now > greatest) {
        greatest = now
    }
    return array.map {it }.sortedDescending().take(3).sum()


}
