package fastSlowPointers

class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)

fun ListNode.print() {
    var current: ListNode? = this
    while (current != null) {
        print(current.`val`)
        current = current.next

    }
}