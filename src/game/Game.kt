package game

class Game {
    var path = mutableListOf(Direction.START)

    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }

    val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }

}

fun main(args: Array<String>) {
    val game = Game()
    printPath(game)
    play(game)
    printPath(game)
}

fun printPath(game: Game) {
    println(game.path)
}

fun play(game: Game) {
    game.north()
    game.south()
    game.west()
    game.end()
}