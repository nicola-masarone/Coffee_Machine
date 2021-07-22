import kotlin.math.pow

fun compoundInterest(startingAmount: Int = 1000, yearlyPercent: Int = 5, years: Int = 10): Int {
    val finalAmount: Double = startingAmount.toDouble() *
            (1.0 + yearlyPercent.toDouble() / 100.0).pow(years.toDouble())
    return finalAmount.toInt()
}

fun main() {
    val parName = readLine()!!
    val parValue = readLine()!!.toInt()
    println(
        when (parName) {
            "amount" -> compoundInterest(startingAmount = parValue)
            "percent" -> compoundInterest(yearlyPercent = parValue)
            else -> compoundInterest(years = parValue)
        })
}