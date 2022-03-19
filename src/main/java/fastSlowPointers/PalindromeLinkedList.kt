package fastSlowPointers

class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {

        var fast = head
        var slow = head

        //find middle
        //reverse second part
        //compare with first part


        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        val reversedHead: ListNode? = reverseNode(slow)

        while (head != null && reversedHead != null) {

            if (head?.`val` != reversedHead?.`val`) {
                return false
            }
        }

        return true

    }

    private fun reverseNode(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head

        while (current != null) {
            var next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }
}

fun main() {
    val task = PalindromeLinkedList()

    val head = ListNode(2)
    head.next = ListNode(4)
    head.next?.next = ListNode(6)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(2)


    // val result = task.hasCycle(head)
    val result = task.isPalindrome(head)

    println("result: $result")
}