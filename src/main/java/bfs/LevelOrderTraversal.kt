package bfs

import patternTreeBreadthFirstSearch.TreeNode
import java.util.LinkedList
import java.util.Queue

class LevelOrderTraversal {

    companion object {
        fun traverse(root: TreeNode?): MutableList<MutableList<Int>> {
            val result: MutableList<MutableList<Int>> = mutableListOf()
            if (root == null) {
                return result
            }

            val queue: Queue<TreeNode> = LinkedList()
            queue.offer(root)

            while (!queue.isEmpty()) {
                var levelSize = queue.size
                val currentLevel: MutableList<Int> = mutableListOf()

                for (i in 0 until levelSize) {
                    val currentNode: TreeNode = queue.poll()
                    // add the node to the current level
                    currentLevel.add(currentNode.value)
                    // insert the children of current node in the queue

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left)
                    }

                    if (currentNode.right != null) {
                        queue.offer(currentNode.right)
                    }
                }
                result.add(currentLevel)
            }

            return result
        }
    }
}

fun main() {
    val root = TreeNode(12)
    root.left = TreeNode(7)
    root.right = TreeNode(1)
    root.left?.left = TreeNode(9)
    root.right?.left = TreeNode(10)
    root.right?.right = TreeNode(5)

    val result = LevelOrderTraversal.traverse(root)


    println(result)
    // result.forEach {
    //     print("$it")
    // }
    // println()
    println("---------")
}