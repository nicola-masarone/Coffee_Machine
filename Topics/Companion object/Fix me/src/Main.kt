data class Player(val id: Int, val name: String) {
    companion object {
        const val defaultSpeed = 8
        const val maxSpeed = 13

        fun calcMovePenalty(cell: Int): Int {
            return defaultSpeed - cell % 3
        }
    }
}

fun calculatePlayerSpeed(cell: Int): Int {
    return Player.calcMovePenalty(cell)
}