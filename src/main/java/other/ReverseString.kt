package other

class ReverseString {

    fun reverseString(s: CharArray): CharArray {
        var left = 0
        var right = s.size - 1
        var temp: Char

        while (left < right) {
            temp = s[right]
            s[right] = s[left]
            s[left] = temp

            left++
            right--
        }

        return s
    }
}

fun main() {
    val task = ReverseString()

    val s: CharArray = "hello".toCharArray()

    val result = task.reverseString(s)


    result.forEach {
        print(it)
    }
    // println("result: ${result[0]} and ${result[1]}")
}
