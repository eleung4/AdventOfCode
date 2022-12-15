fun main() {

    val input = readInput("Day03")

    println(rucksack(input))

}


private fun getCharForNumber(i: Int): Int? {
    return if (i in 1..26) (i + 64).toChar().toString() else null
}

fun rucksack(input: List<String>) : Int {
    var total = 0
    var let = ""
    for(line in input) {
        val str1 = line.substring(0, line.length-1)
        val str2 = line.substring(line.length-1)
        for(letter in str1) {
            if(str2.contains(letter)) {
                let = letter.toString()
                total+= getCharForNumber(let)
            }


        }
    }
    return total
}




//
//        val length = (readLine()?.length)?.div(2)
//        val str1 = line.substring(0, length)
//        val str2 = line.substring(length)
