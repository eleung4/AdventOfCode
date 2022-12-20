fun main() {

    val names = listOf("Theo", "Ryan", "Ellen", "Victoria")


    println(giftExchange(names))
}
fun giftExchange(input: List<String>) : String {
    // 3 arrays, 2 with names, 1 empty
    // picks the first name on one side and matches it with a name on the other side, which is shuffled
    // once the second side name has been taken, move it to the other array
    // when choosing the name, it will loop through the 3rd array to make sure the name isn't picked twice
    var matches = ""
    var track = 0
    val new = input.toList() as ArrayList<String>
    new.shuffle()
    while(track <=input.size-1) {
        if(input[track] != new[track]) {
            matches += input.get(track) + " to " + new.get(track) + "\n"
            track+=1
        }
        else {
            new.shuffle()
            matches = ""
            track = 0
        }
    }
    return matches



}

