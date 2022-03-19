// package fastSlowPointers
//
// class Example {
//
//     fun hasCycle(node: ListNode): Boolean {
//
//         var fast: ListNode? = node
//         var slow: ListNode? = node
//
//         while (fast?.next != null) {
//             slow = slow?.next
//             fast = fast.next?.next
//
//             if (slow != null && slow == fast) {
//                 return true
//             }
//         }
//
//
//         return false
//     }
//
//     fun findCycleLength(node: ListNode): Int {
//
//         var fast: ListNode? = node
//         var slow: ListNode? = node
//
//         while (fast?.next != null) {
//             slow = slow?.next
//             fast = fast.next?.next
//
//             if (slow != null && slow == fast) {
//                 return calculateLength(slow)
//             }
//         }
//
//
//         return 0
//     }
//
//     private fun calculateLength(slow: ListNode): Int {
//         var current = slow.next
//         var counter = 1
//
//         while (true) {
//
//             if (current == slow) {
//                 return counter
//             }
//
//             current = current?.next
//             counter++
//         }
//     }
// }
//
// fun main() {
//     val task = Example()
//
//     val head = ListNode(1)
//     head.next = ListNode(2)
//     head.next?.next = ListNode(3)
//     head.next?.next?.next = ListNode(4)
//     head.next?.next?.next?.next = ListNode(5)
//     head.next?.next?.next?.next?.next = ListNode(6)
//     head.next?.next?.next?.next?.next?.next = head.next?.next?.next
//
//     // val result = task.hasCycle(head)
//     val length = task.findCycleLength(head)
//
//     // println("has cycle: $result")
//     println("length: $length")
// }