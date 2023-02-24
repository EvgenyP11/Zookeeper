fun main() {
    val message = readln()
    val substring = readln()
    var sum = 0

    if (substring.length == 6){
        for (i in message.indices) {
            try {
                if (message[i] == substring[0] && message[i + 1] == substring[1] && message[i + 2] == substring[2] && message[i + 3] == substring[3] && message[i + 4] == substring[4] && message[i + 5] == substring[5]) sum += 1
//            if (message[i] == substring[0] && message[i + 1] == substring[1]) sum += 1
            } catch (e: Exception) {
                continue
            }
        }
    }
    if (substring.length == 5){
        for (i in message.indices) {
            try {
                if (message[i] == substring[0] && message[i + 1] == substring[1] && message[i + 2] == substring[2] && message[i + 3] == substring[3] && message[i + 4] == substring[4]) sum += 1
//            if (message[i] == substring[0] && message[i + 1] == substring[1]) sum += 1
            } catch (e: Exception) {
                continue
            }
        }
    }
    if (substring.length == 4){
        for (i in message.indices) {
            try {
                if (message[i] == substring[0] && message[i + 1] == substring[1] && message[i + 2] == substring[2] && message[i + 3] == substring[3]) sum += 1
//            if (message[i] == substring[0] && message[i + 1] == substring[1]) sum += 1
            } catch (e: Exception) {
                continue
            }
        }
    }
    if (substring.length == 3){
        for (i in message.indices) {
            try {
                if (message[i] == substring[0] && message[i + 1] == substring[1] && message[i + 2] == substring[2]) sum += 1
//            if (message[i] == substring[0] && message[i + 1] == substring[1]) sum += 1
            } catch (e: Exception) {
                continue
            }
        }
    }
    if (substring.length == 2) {
        for (i in message.indices) {
            try {
//            if (message[i] == substring[0] && message[i + 1] == substring[1] && message[i + 2] == substring[2]) sum += 1
                if (message[i] == substring[0] && message[i + 1] == substring[1]) sum += 1
            } catch (e: Exception) {
                continue
            }
        }
    }

    println(sum)
}