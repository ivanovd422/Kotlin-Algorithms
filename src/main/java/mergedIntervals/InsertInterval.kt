package mergedIntervals

import kotlin.math.max
import kotlin.math.min

class InsertInterval {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val mergedIntervals: MutableList<IntArray> = mutableListOf()

        var counter = 0

        while (counter < intervals.size && intervals[counter][1] < newInterval[0]) {
            mergedIntervals.add(intervals[counter++])
        }


        while (counter < intervals.size && intervals[counter][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[counter][0], newInterval[0])
            newInterval[1] = Math.max(intervals[counter][1], newInterval[1])
            counter++
        }

        mergedIntervals.add(newInterval)

        while (counter < intervals.size) {
            mergedIntervals.add(intervals[counter++])
        }

        return mergedIntervals.toTypedArray()
    }
}

fun main() {
    val task = InsertInterval()

    //[[1,3],[2,6],[8,10],[15,18]]
    // result - [[1,6],[8,10],[15,18]]
    val invervals: Array<IntArray> = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 5),
        intArrayOf(6, 7),
        intArrayOf(8, 10),
        intArrayOf(12, 16),
    )

    val newInterval = intArrayOf(4, 8)

    val result = task.insert(invervals, newInterval)

    result.forEach {
        it.forEach { inner ->
            print(inner)
            print(",")
        }
        println()
    }
}