package aquarium5

interface Runnable {
    fun run()
}

interface Callable<T> {
    fun call(): T
}


fun example() {
    val runnable = object : Runnable {
        override fun run() {
            println("I'm a runnable")
        }
    }
    JavaRun.runNow(runnable)
}

fun runNow(runnable: Runnable) {
    runnable.run()
}

//fun example2() {
//    runNow {
//        println("SAM as lambda")
//    }
//}