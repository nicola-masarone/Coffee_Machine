enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet");

    companion object {
        fun isInRainbow(color: String): Boolean {
            for (clr in Rainbow.values()) {
                if (clr.name.uppercase() == color.uppercase()) {
                    return true
                }
            }
            return false
        }
    }
}

fun main() {
    println(Rainbow.isInRainbow(readLine()!!))
}