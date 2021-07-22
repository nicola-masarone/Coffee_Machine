data class Player(val id: Int, val name: String, val speed: Int, val health: Int, val armor: Int) {
    companion object {
        const val baseSpeed = 7
        const val baseHealth = 100
        const val baseArmor = 100
        const val maxSpeed = 13
        const val maxHealth = 140
        const val maxArmor = 100
    }
}