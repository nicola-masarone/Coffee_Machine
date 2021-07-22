class Car(val make: String, val year: Int) {
    var speed: Int = 0
    fun accelerate() {
        speed += 5
    }
    fun decelerate() {
        speed -= 5
        if (speed < 0) {
            speed = 0
        }
    }
}
