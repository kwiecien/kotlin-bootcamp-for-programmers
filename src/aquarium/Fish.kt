package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("1st init")
    }

    constructor() : this(true, 9) {
        println("Runnung 2nd constructor...")
    }

    init {
        size = if (friendly) {
            volumeNeeded
        } else {
            volumeNeeded * 2
        }
    }

    init {
        println("3rd init: $volumeNeeded")
    }

    fun fishExample() {
        val fish = Fish(true, 20)
        println("Is the fish friendly? ${friendly}. It needs volume ${fish.size}")
    }

    fun makeDefaultFish() = Fish(true, 50)

}