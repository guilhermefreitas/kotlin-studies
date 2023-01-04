import kotlinx.coroutines.*
import java.lang.IndexOutOfBoundsException

fun main(){
    runBlocking {
        val myHandler = CoroutineExceptionHandler{ _, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }
        val job = GlobalScope.launch(myHandler) {
            println("throwing exception from job")
            throw IndexOutOfBoundsException("My exception in coroutine")
        }

        job.join()


        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("My exception in async")
        }

        try {
            deferred.await()
        } catch(e: ArithmeticException){
            println("Caught ArithmeticException ${e.localizedMessage}")
        }

    }
}