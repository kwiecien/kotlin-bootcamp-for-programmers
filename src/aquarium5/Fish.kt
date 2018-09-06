package aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExamples()
    practiceTime()
}

fun practiceTime() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisibleBy {
        it.rem(3)
    })
}

private fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun fishExamples() {
    val fish = Fish("splashy")

    with(fish.name) { println(capitalize()) }
    println(fish.run { name })
    println(fish.apply { name })

    val fish2 = Fish("splashy").apply { name = "shark" }
    println(fish2)

    println(fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 })

    myWith(fish.name) {
        println(capitalize())
    }

    // without inline an object is created every call to myWith
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

    // with inline no object is created, and lambda body is inlined here
    fish.name.capitalize()
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
