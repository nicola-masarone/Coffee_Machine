fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

data class ByteTimer(var time: Int) {
    init {
        time = when {
            time < -128 -> -128
            time > 127 -> 127
            else -> time
        }
    }
}
