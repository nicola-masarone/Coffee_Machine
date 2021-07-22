enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}

fun main() {
    val color = readLine()!!
    for (rbColor in Rainbow.values()) {
        if (rbColor.name.uppercase() == color.uppercase()) {
            println(rbColor.ordinal + 1)
        }
    }
}