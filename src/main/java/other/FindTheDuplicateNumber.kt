package other

class Solution287 {
    fun findDuplicate(nums: IntArray): Int {
        var slow = nums[0]
        var fast = nums[0]
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        // locate entrace of cycle
        fast = nums[0]
        while (fast != slow) {
            fast = nums[fast]
            slow = nums[slow]
        }
        return slow
        // var left = 0
        // var right = 1
        // var value = 0
        //
        // while (left < nums.size) {
        //     val leftValue = nums[left]
        //     val rightValue = nums[right]
        //
        //     if (leftValue != rightValue) {
        //         right++
        //
        //         if (right == nums.size) {
        //             left++
        //             right = left + 1
        //         }
        //     } else {
        //         value = leftValue
        //         break
        //     }
        // }
        //
        // return value
    }
}

fun main() {
    val task = Solution287()

    val array = intArrayOf(2,1,2)

    val result = task.findDuplicate(array)

    println("result: $result")
}