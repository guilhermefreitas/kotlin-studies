import kotlinx.coroutines.*

fun main(){
    println("program execution will now block")
    runBlocking {
        launch {
            delay(1000L)
            println("task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("task from globalScope")
        }

        coroutineScope {
            launch {
                delay(1000L)
                println("task from coroutineScope")
            }
        }
    }
    println("program execution will now continue")

}