enum class Currencies(val countryName: String, val countryCurrency: String) {
    GER("Germany", "Euro"),
    MAL("Mali", "CFA franc"),
    DOM("Dominica", "Eastern Caribbean dollar"),
    CAN("Canada", "Canadian dollar"),
    SPA("Spain", "Euro"),
    AUS("Australia", "Australian dollar"),
    BRA("Brazil", "Brazilian real"),
    SEN("Senegal", "CFA franc"),
    FRA("France", "Euro"),
    GRE("Grenada", "Eastern Caribbean dollar"),
    KIR("Kiribati", "Australian dollar");

    companion object {
        var firstCurr = ""
        var secondCurr = ""
        private fun bothCountryIn(first: String, second: String): Boolean {
            var firstIn = false
            var secondIn = false
            for (country in Currencies.values()) {
                if (country.countryName.uppercase() == first.uppercase()) {
                    firstIn = true
                    firstCurr = country.countryCurrency
                }
                if (country.countryName.uppercase() == second.uppercase()) {
                    secondIn = true
                    secondCurr = country.countryCurrency
                }
            }
            return firstIn && secondIn
        }
        fun sameCurrency(first: String, second: String): Boolean {
            return if (bothCountryIn(first, second)) {
                firstCurr == secondCurr
            } else {
                false
            }
        }
    }
}

fun main() {
    val (firstCountry, secondCountry) = readLine()!!.split(" ")
    println(Currencies.sameCurrency(firstCountry, secondCountry))
}