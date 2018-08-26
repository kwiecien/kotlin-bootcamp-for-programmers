package aquarium

fun main(args: Array<String>) {
    buildAquarium()
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
