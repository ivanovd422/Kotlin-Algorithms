// package fastSlowPointers
//
// class RemoveLinkedListElements {
//
//     fun removeElements(head: ListNode, value: Int): ListNode? {
//         var current: ListNode? = head
//         var previous: ListNode? = null
//         var trav = ListNode(-1)
//
//         while (current != null) {
//
//             if (current.value == value) {
//                 previous?.next = current.next
//             } else {
//                 previous = current
//             }
//
//             current = current.next
//         }
//
//         return head
//     }
// }
//
// fun main() {
//     val task = RemoveLinkedListElements()
//
//     val head = ListNode(5)
//     head.next = ListNode(5)
//     head.next?.next = ListNode(5)
//     head.next?.next?.next = ListNode(5)
//     head.next?.next?.next?.next = ListNode(5)
//     head.next?.next?.next?.next?.next = ListNode(5)
//
//     val value = 5
//
//     // val result = task.hasCycle(head)
//     val node = task.removeElements(head, value)
//
//     // println("has cycle: $result")
//     node?.print()
//     // println("length: ${}")
// }