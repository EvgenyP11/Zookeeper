fun main() {
    val ticketNumber = readln().split("").toMutableList()
    ticketNumber.remove(ticketNumber[0])
    ticketNumber.remove(ticketNumber[ticketNumber.size - 1])
    val number = ticketNumber.map { it.toInt() }
    var firstSum: MutableList<Int> = mutableListOf()
    var secondSum: MutableList<Int> = mutableListOf()
    for (index in 0 until number.size / 2) {
        firstSum.add(number[index])
    }
    for (index in number.size / 2 until number.size) {
        secondSum.add(number[index])
    }
    val answer = if(firstSum.sum() == secondSum.sum()) "Lucky" else "Regular"
    println(answer)
}