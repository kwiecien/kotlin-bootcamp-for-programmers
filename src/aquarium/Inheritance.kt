package aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco1 = Pleco()
    println("Fish has color ${pleco1.color}")
    pleco1.eat()
    val pleco2 = Pleco(RedColor)
    println("Fish has color ${pleco2.color}")
    pleco2.eat()
}

interface FishAction1 {
    fun eat()
}

interface FishColor {
    val color: String
}

class Pleco(fishColor: FishColor = GoldColor) :
        FishAction1 by PrintingFishAction("a lot of algae"),
        FishColor by fishColor

object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(val food: String) : FishAction1 {
    override fun eat() {
        println(food)
    }
}