fun main() {
    val string = readln().split(" ").toList()
    val word = string[0]
    val number = string[1].toInt()
    val newWord = if(number < word.length) {
        word.substring(number, word.length) + word.substring(0, number)
    } else {
        word
    }
    println(newWord)
}