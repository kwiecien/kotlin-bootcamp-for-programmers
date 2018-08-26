package aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

private fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Len: ${myAquarium.length} " +
            "Wid: ${myAquarium.width} " +
            "Hei: ${myAquarium.height}")
    myAquarium.height = 100
    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 10)
    println("Volume: ${myAquarium.volume}")

    val myAquarium2 = Aquarium(9)
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()
    println("Shark: ${shark.color}\n pleco: ${plecostomus.color}")
    shark.eat()
    plecostomus.eat()
}
