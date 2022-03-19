package other

class TwoPointersSolution {

    fun search(nums: IntArray): IntArray {
        var left = 0
        var right = 0
        var temp = 0
        while (right < nums.size) {
            if (nums[right] != 0) {
                temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
            }
            right++
        }

        return nums
    }
}

fun main() {
    val task = TwoPointersSolution()

    val array: IntArray = intArrayOf(0, 1, 0, 3, 9)
    // val target = 11

    val result = task.search(array/*, target*/)

    result.forEach {
        print("$it")
    }
    println("---------")
    // println("result: ${result[0]} and ${result[1]}")
}
