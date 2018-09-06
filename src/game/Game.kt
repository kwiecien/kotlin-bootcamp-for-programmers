package game

class Game {
    private var path = mutableListOf(Direction.START)

    private val north = { path.add(Direction.NORTH) }
    private val south = { path.add(Direction.SOUTH) }
    private val east = { path.add(Direction.EAST) }
    private val west = { path.add(Direction.WEST) }

    private val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "w" -> move(west)
            "e" -> move(east)
            else -> move(end)
        }

    }

    private fun move(where: () -> Boolean) {
        where.invoke()
    }

}

fun main(args: Array<String>) {
    val game = Game()
    println("Enter a direction: n/s/w/e: ")
    while (true) {
        game.makeMove(readLine())
    }
}