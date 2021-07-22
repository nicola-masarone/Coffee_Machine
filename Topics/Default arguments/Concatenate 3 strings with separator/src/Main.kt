
fun concatenate(first: String, second: String, third: String, sep: String = " "): String {
    return first + sep + second + sep + third
}

fun main() {
    val firstLine = readLine()!!
    val secondLine = readLine()!!
    val thirdLine = readLine()!!
    val separator = readLine()!!
    if (separator != "NO SEPARATOR") {
        println(concatenate(firstLine, secondLine, thirdLine, separator))
    } else {
        println(concatenate(firstLine, secondLine, thirdLine))
    }
}