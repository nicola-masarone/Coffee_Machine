package machine

var availWater = 400
var availMilk = 540
var availCoffee = 120
var availCups = 9
var money = 550

val espressoWater = 250
val espressoMilk = 0
val espressoCoffee = 16
val espressoPrice = 4

val latteWater = 350
val latteMilk = 75
val latteCoffee = 20
val lattePrice = 7

val cappuccinoWater = 200
val cappuccinoMilk = 100
val cappuccinoCoffee = 12
val cappuccinoPrice = 6


fun printStatus() {
    println("""
        
        The coffee machine has:
        $availWater of water
        $availMilk of milk
        $availCoffee of coffee beans
        $availCups of disposable cups
        $money of money
        
        """.trimIndent()
    )
}

fun buy() {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    var neededWater = 0
    var neededMilk = 0
    var neededCoffee = 0
    val neededCups = 1
    var neededMoney = 0

    when (readLine()!!) {
        "1" -> {
            neededWater = espressoWater
            neededMilk = espressoMilk
            neededCoffee = espressoCoffee
            neededMoney = espressoPrice
        }
        "2" -> {
            neededWater = latteWater
            neededMilk = latteMilk
            neededCoffee = latteCoffee
            neededMoney = lattePrice
        }
        "3" -> {
            neededWater = cappuccinoWater
            neededMilk = cappuccinoMilk
            neededCoffee = cappuccinoCoffee
            neededMoney = cappuccinoPrice
        }
        else -> return
    }
    when {
        neededWater > availWater -> println("Sorry, not enough water!")
        neededMilk > availMilk -> println("Sorry, not enough milk!")
        neededCoffee > availCoffee -> println("Sorry, not enough coffee!")
        neededCups > availCups -> println("Sorry, not enough cups!")
        else -> {
            println("I have enough resources, making you a coffee!")
            availWater -= neededWater
            availMilk -= neededMilk
            availCoffee -= neededCoffee
            availCups -= neededCups
            money += neededMoney
        }
    }
}

fun fill() {
    print("Write how many ml of water do you want to add: ")
    availWater += readLine()!!.toInt()
    print("Write how many ml of milk do you want to add: ")
    availMilk += readLine()!!.toInt()
    print("Write how many grams of coffee beans do you want to add: ")
    availCoffee += readLine()!!.toInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    availCups += readLine()!!.toInt()
}

fun take() {
    println("I gave you $$money")
    money = 0
}

fun main() {
    do {
        print("Write action (buy, fill, take, remaining, exit): ")
        when (readLine()!!) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> printStatus()
            "exit" -> return
        }
    } while (true)
}
