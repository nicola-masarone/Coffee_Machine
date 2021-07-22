fun carPrice(
    years: Int = 5, 
    km: Int = 100_000, 
    maxSpeed: Int = 120,
    auto: Int = 0
    ): Int {
    var price = 20_000
    price -= years * 2000
    price += (maxSpeed - 120) * 100
    price -= km / 10_000 * 200
    price += auto * 1500
    return price
}

fun main(args: Array<String>) {
    val parName = readLine()!!
    val parValue = readLine()!!.toInt()
    println(
        when (parName) {
            "old" -> carPrice(years = parValue)
            "passed" -> carPrice(km = parValue)
            "speed" -> carPrice(maxSpeed = parValue)
            else -> carPrice(auto = parValue)
        }
    )
}
