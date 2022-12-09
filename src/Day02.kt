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

    val input = readInput("Day02")

    //x / a is rock 1
    // y / b is scissors 2
    // z / c is paper 3

    // 0 for loss
    // 3 for draw
    // 6 for win
    println(rockPaperScissors(input))




}

fun rockPaperScissors(input: List<String>) : Int {
    var total = 0
    for(line in input) {
        val you = line.substring(0, 1)
        val opp = line.substring(2)
        if(you == "A")
            total += 1
        if(you==("B"))
            total+=2
        if(you==("C"))
            total+=3

        if(you=="A" && opp=="X")
            total+=3
        if(you=="A" && opp=="Y")
            total+=6
        if(you=="A" && opp=="Z")
            total+=0
        if(you=="B" && opp=="X")
            total+=0
        if(you=="B" && opp=="Y")
            total+=3
        if(you=="B" && opp=="Z")
            total+=6
        if(you=="C" && opp=="X")
            total+=6
        if(you=="C" && opp=="Y")
            total+=0
        if(you=="C" && opp=="Z")
            total+=3
    }
    return total

}