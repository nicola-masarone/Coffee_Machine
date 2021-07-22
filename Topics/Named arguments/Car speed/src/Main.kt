fun checkSpeed(carSpeed: Int, speedLimit: Int = 60) {
    println(
        if (carSpeed > speedLimit) {
            "Exceeds the limit by ${carSpeed - speedLimit} kilometers per hour"
        } else {
            "Within the limit"
        }
    )
}

fun main(args: Array<String>) {
    val speed = readLine()!!.toInt()
    val limit = readLine()!!

    if (limit == "no limit") {
        checkSpeed(carSpeed = speed)
    } else {
        checkSpeed(carSpeed = speed, speedLimit = limit.toInt())
    }
}