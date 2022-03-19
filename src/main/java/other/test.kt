package other

class Solution {
    fun fib(n: Int): Int {
        var a = 0
        var b = 1
        var c = 0

        for (i in 0 until n) {
            c = kotlin.math.abs(a + b)
            a = b
            b = c
        }

        return a

    }
}

fun main() {
    val task = Solution()

    val result = task.fib(1)

    println("result: $result")
}