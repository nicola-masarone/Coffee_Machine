data class Block(val color: String) {
    object BlockProperties {
        var length = 6
        var width = 6
        fun blocksInBox(boxLength: Int, boxWidth: Int) =
            (boxLength / length) * (boxWidth / width)
    }
}
