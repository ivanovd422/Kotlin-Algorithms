package inPlaceReversalLinkedList

import fastSlowPointers.ListNode

class ReverseALinkedList {

    fun reverseList(node: ListNode): ListNode? {
        var current: ListNode? = node
        var previous: ListNode? = null
        var next: ListNode? = null

        while (current != null) {
            next = current.next // Сохраняем след элемент, чтобы не потерять
            current.next = previous // Меняем ссылку на след элемент у текущего НА предыдущий (в первой случае это будет null)
            previous = current // сохраняем ссылку на текущий (в след итерации будет как "предыдущий")
            current = next // переходим на следующий элемент
        }

        return previous
    }
}

fun main() {
    val task = ReverseALinkedList()

    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    var result: ListNode? = task.reverseList(head)


    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}
