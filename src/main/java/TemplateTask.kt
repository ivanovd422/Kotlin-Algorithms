class TemplateTask {

    fun search(nums: IntArray): IntArray {

        return nums
    }
}

fun main() {
    val task = TemplateTask()
    val array: IntArray = intArrayOf(0, 1, 0, 3, 9)
    val result = task.search(array)
    result.forEach {
        print("$it")
    }
    println()
    println("---------")
}