package aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    with(fish.name) { println(capitalize()) }
    println(fish.run { name })
    println(fish.apply { name })

    myWith(fish.name) {
        println(capitalize())
    }


    val fish2 = Fish("splashy").apply { name = "shark" }
    println(fish2)

    println(fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 })

}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
