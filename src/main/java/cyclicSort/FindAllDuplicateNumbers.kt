package cyclicSort

class FindAllDuplicateNumbers {

    fun findDuplicates(nums: IntArray): List<Int> {
        val list: MutableList<Int> = mutableListOf()

        var index = 0

        while (index < nums.size) {

            val currentValue = nums[index]
            val secondValue = nums[nums[index] - 1]

            if (currentValue != secondValue) {
                swap(nums, index, nums[index] - 1)
            } else {
                index++
            }
        }

        for (i in nums.indices) {

            if (nums[i] != i + 1) {
                list.add(nums[i])
            }
        }

        return list
    }

    private fun swap(nums: IntArray, i: Int, j: Int ){
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}

fun main() {
    val task = FindAllDuplicateNumbers()
    val array: IntArray = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    val result = task.findDuplicates(array)
    result.forEach {
        print("$it")
    }
    println()
    println("---------")
}