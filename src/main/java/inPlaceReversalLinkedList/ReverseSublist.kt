package inPlaceReversalLinkedList

import fastSlowPointers.ListNode


class ReverseSublist {

    fun reverseBetween(node: ListNode, left: Int, right: Int): ListNode? {
        var head: ListNode? = node

        if (left == right) {
            return node
        }

        var current: ListNode? = node
        var previous: ListNode? = null

        var index = 0

        while (current != null && index < left - 1) {
            previous = current
            current = current.next
            index++
        }

        val lastNodeOfFirstPart: ListNode? = previous
        var lastNodeOfSublist: ListNode? = current
        var next: ListNode? = null

        index = 0

        while (current != null && index < right - left + 1) {
            next = current.next
            current.next = previous
            previous = current
            current = next
            index++
        }

        if (lastNodeOfFirstPart != null) {
            lastNodeOfFirstPart.next = previous
        } else {
            head = previous
        }

        lastNodeOfSublist?.next = current

        return head
    }
}

fun main() {
    val task = ReverseSublist()

    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    var result: ListNode? = task.reverseBetween(head, 2, 4)


    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}
