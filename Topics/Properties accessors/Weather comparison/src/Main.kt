data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (!(value in -92..57)) {
                when (name) {
                    "Moscow" -> 5
                    "Hanoi" -> 20
                    else -> 30
                }
            } else { value }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    val cities = arrayOf(firstCity, secondCity, thirdCity)
    var coldestTemp = 60
    var coldestCity = ""
    for (city in cities) {
        if (city.degrees < coldestTemp) {
            coldestTemp = city.degrees
            coldestCity = city.name
        }
    }
    var coldestCounter = 0
    for (city in cities) {
        if (city.degrees == coldestTemp) { coldestCounter++ }
    }
    println(if (coldestCounter > 1) { "neither" } else { coldestCity })
}