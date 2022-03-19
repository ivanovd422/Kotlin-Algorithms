package other

class Solution258 {
    fun addDigits(num: Int): Int {
        var result = num

        while (result.toString().length > 1) {
            result = result.toString().sumBy { it.toString().toInt() }
        }
        return result

    }
}

fun main() {
    val task = Solution258()

    val number = 38

    val result = task.addDigits(number)

    println("result: $result")





    val testNum = 100
    val testChar: String = testNum.toString()
}