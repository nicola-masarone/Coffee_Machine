
fun greeting(name: String = "secret user"): String {
    return name + "!"
}

fun main() {
    val name = readLine()!!
    println("Hello, " + if (name != "HIDDEN") { greeting(name) } else { greeting() })
}
