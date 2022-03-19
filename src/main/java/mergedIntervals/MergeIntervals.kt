package mergedIntervals

import java.util.Collections
import kotlin.math.max
import kotlin.math.min

class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val mergedIntervals: MutableList<IntArray> = mutableListOf()

        val sortedIntervals = intervals.sortedBy { it[0] }

        mergedIntervals.add(sortedIntervals[0])

        for (counter in 1..sortedIntervals.size - 1) {
            val curInterval = sortedIntervals[counter]
            val lastInterval = mergedIntervals.get(mergedIntervals.size-1)

            if (isOverlap(curInterval, lastInterval)) {
                mergedIntervals[mergedIntervals.size-1] = intArrayOf(
                    min(lastInterval[0], curInterval[0]),
                    max(lastInterval[1], curInterval[1]),
                )
            } else {
                mergedIntervals.add(curInterval)
            }
        }

        return mergedIntervals.toTypedArray()
    }

    private fun isOverlap(first: IntArray, second: IntArray): Boolean {
        val start = max(first[0], second[0])
        val end = min(first[1], second[1])
        return end - start >= 0
    }
}

fun main() {
    val task = MergeIntervals()

    //[[1,3],[2,6],[8,10],[15,18]]
    // result - [[1,6],[8,10],[15,18]]
    val invervals: Array<IntArray> = arrayOf(
        intArrayOf(1, 4),
        intArrayOf(2, 3),
        // intArrayOf(30, 45),
        // intArrayOf(8, 10),
        // intArrayOf(15, 18),
    )

    val result = task.merge(invervals)

    result.forEach {
        it.forEach { inner ->
            print(inner)
            print(",")
        }
        println()
    }
}