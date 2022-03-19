package other

class Solution75 {

    fun sortColors(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1
        var temp: Int

        var i = 0
        while (i <= right) {
            if (nums[i] == 0) {
                temp = nums[left]
                nums[left] = nums[i]
                nums[i] = temp

                i++
                left++
            } else if (nums[i] == 1) {
                i++
            } else {
                temp = nums[right]
                nums[right] = nums[i]
                nums[i] = temp

                right--
            }
        }


        return nums
    }
}

fun main() {
    val task = Solution75()
    val array = intArrayOf(2, 0, 2, 1, 1, 0)
    val result = task.sortColors(array)

    result.forEach {
        print(it)
    }
}