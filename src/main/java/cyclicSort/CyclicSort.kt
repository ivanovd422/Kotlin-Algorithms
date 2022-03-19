package cyclicSort


class CyclicSort {

    fun sort(nums: IntArray): IntArray {

        var index = 0

        while (index < nums.size) {
            var j = nums[index] - 1 // т.к. элементы расположены от 1 до n, то элемент "n" должен находится на позиции n-1. j это позиция текущего элемента

            val var1 = nums[index] // значение по текущему индексу в рамках перебора
            val var2 = nums[j] // значение, которое должно быть по индексу J

            if (var1 != var2) {
                swap(nums, index, j)
            } else {
                index++
            }

        }

        return nums
    }

    // index = 0
    // value = 3
    // position to be = 2 (should calculate position by formula: value - 1)

    private fun swap(nums: IntArray, i: Int, j: Int) {
        var temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}

fun main() {
    val task = CyclicSort()
    val array: IntArray = intArrayOf(2, 6, 4, 3, 1, 5)
    val result = task.sort(array)

    result.forEach {
        print("$it")
    }
    println()
    println("---------")
}