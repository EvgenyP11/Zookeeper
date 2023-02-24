fun main() {
    val str = readln().split(" ").toMutableList()
    val lengthWord = mutableListOf<Int>()
    for (index in str.indices){
        val numWord = str[index].length
        lengthWord.add(numWord)
    }
    val i = lengthWord.indexOf(lengthWord.maxOrNull())

    println(str[i])
}