data class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var uniqueId = 0
        fun create(name: String): Player {
            uniqueId++
            return Player(id = uniqueId, name = name, hp = 100)
        }
    }
}
