import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    dayOfTheWeek()
    expression()
    ifExpression(10)
    greetings(args[1])
    greetings(args[1].toInt())
}

fun greetings(time: String) {
    println(when (time) {
        in "1".."11" -> "Good morning!"
        else -> "Good morning!"
    })
}

fun greetings(time: Int) {
    println(if (time < 12) "Good morning!" else "Good morning!")
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