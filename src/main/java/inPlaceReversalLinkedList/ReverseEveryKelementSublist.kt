package inPlaceReversalLinkedList

import fastSlowPointers.ListNode

class ReverseEveryKelementSublist {

    val a = 33  to 44


    fun reverseBetween(node: ListNode, k: Int): ListNode? {
        if (k <= 1) return node

        var mainIndex = 0

        a


        return node
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
