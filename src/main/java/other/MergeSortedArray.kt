package other

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
        var firstPointer = m - 1
        var secondPointer = n - 1
        var thirdPointer = m + n -1

        while (secondPointer >= 0) {
            if (firstPointer < 0 || nums2[secondPointer] >= nums1[firstPointer]) {
                nums1[thirdPointer] = nums2[secondPointer]
                secondPointer--
            } else {
                nums1[thirdPointer] = nums1[firstPointer]
                firstPointer--
            }
            thirdPointer--

            println("first pointer - $firstPointer")
            println("secondPointer - $secondPointer")
            println("thirdPointer - $thirdPointer")
        }

        return nums1
    }
}

fun main() {
    val task = MergeSortedArray()

    val nums1 = intArrayOf(1,2,3,0,0,0)
    val m = 3
    val nums2 = intArrayOf(2,5,6)
    val n = 3

    val result = task.merge(nums1, m, nums2, n)

    result.forEach {
        print("$it")
    }
    println("---------")
    // println("result: ${result[0]} and ${result[1]}")
}
