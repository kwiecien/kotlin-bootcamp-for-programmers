import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    dayOfTheWeek()
    expression()
    ifExpression(10)
    greetings()
    greetings(args[1])
    greetings(args[1].toInt())
    feedTheFish()
    println(shouldChangeWater(""))
    //println(getFortuneCookie())
    tryFilter()
}

fun tryFilter() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val lazySpices = spices.asSequence().filter { it.contains("curry") }.sortedBy { it.length }
    val eagerSpices = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(lazySpices)
    println(eagerSpices)
    println(spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' })
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })
    println(spices.subList(0, 3).filter { it[0] == 'c' })
    println(spices.take(3).filter { it.startsWith('c') })
}

fun greetings(time: String = "11") {
    println(when (time) {
        in "1".."11" -> "Good morning!"
        else -> "Good afternoon!"
    })
}

fun greetings(time: Int) {
    repeat(2) {
        println(if (time < 12) "Good morning!" else "Good afternoon!")
    }
}

fun dayOfTheWeek() {
    println("What day is today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "???"
    })
}

fun expression() {
    val unit = println("This is an expression")
    println(unit)
}

fun ifExpression(temperature: Int) {
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return week[Random().nextInt(week.size)]
}

fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.")
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}

fun getDirtySensorReading() = 42

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = getDirtySensorReading()): Boolean {
    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


