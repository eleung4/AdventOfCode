fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }
//
//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    println(part1(testInput))
//// println((part1(testInput)


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
        val s = line.substring(2)
        val opp = line.substring(0, 1)

        if(s == "X")
            total+=0
        if(s == "Y")
            total+=3
        if(s == "Z")
            total+=6
        if(opp =="A" && s== "X")
            total+=3
        if(opp =="A" && s== "Y")
            total+=1
        if(opp =="A" && s== "Z")
            total+=2
        if(opp =="B" && s== "X")
            total+=1
        if(opp =="B" && s== "Y")
            total+=2
        if(opp =="B" && s== "Z")
            total+=3
        if(opp =="C" && s== "X")
            total+=2
        if(opp =="C" && s== "Y")
            total+=3
        if(opp =="C" && s== "Z")
            total+=1
    }
    return total



}

// x is loss, a rock 1
//y is draw, b paper 2
// z is win, c scissors 3


//        if(you == "X") //rock, a
//            total += 1
//        if(you==("Y")) //paper, b
//            total+=2
//        if(you==("Z")) //scissors, c
//            total+=3
//
//        if(you=="X" && opp=="A")
//            total+=3
//        if(you=="X" && opp=="B")
//            total+=0
//        if(you=="X" && opp=="C")
//            total+=6
//        if(you=="Y" && opp=="A")
//            total+=6
//        if(you=="Y" && opp=="B")
//            total+=3
//        if(you=="Y" && opp=="C")
//            total+=0
//        if(you=="Z" && opp=="A")
//            total+=0
//        if(you=="Z" && opp=="B")
//            total+=6
//        if(you=="Z" && opp=="C")
//            total+=3


//4 8 3   1 5 9  7 2 6
// 3 4 8   1 5 9   2 6 7