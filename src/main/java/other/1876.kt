package other

open class Solution1876 {

    fun countGoodSubstrings(s: String): Int {
        var count = 0
        val slideCount = 3
        var left = 0

        for (right in s.indices) {

            if (right >= slideCount - 1) {

                val isUnique = s[left] != s[left + 1] && s[right] != s[left + 1] && s[left] != s[right]

                if (isUnique) {
                    count++
                }

                left++
            }
        }

        return count
    }
}

fun main() {
    val task = Solution1876()

    val s = "aababcabc"

    val result = task.countGoodSubstrings(s)

    println("result: $result")
}