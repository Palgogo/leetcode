import com.palgogo.RunningSumof1dArray
import org.junit.jupiter.api.Test

class `Running sum of 1d Array` {

    @Test
    fun `Running sum of 1d Array`() {
        val runningSumof1dArray = RunningSumof1dArray()
        val runningSum = runningSumof1dArray.runningSum(intArrayOf(1, 2, 3, 4))
        println(runningSum)
    }
}