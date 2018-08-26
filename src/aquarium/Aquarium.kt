package aquarium

class Aquarium(
        var length: Int = 100,
        var width: Int = 20,
        var height: Int = 40) {

    var volume: Int
        get() = width * height * length
        set(value) {
            height = value / (width * height)
        }

    var water = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }


}