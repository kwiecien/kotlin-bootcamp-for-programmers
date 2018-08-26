package Aquarium

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
}
