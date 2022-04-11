package inorder

import TreeNode
import java.util.Deque
import java.util.Stack

fun inorderTraversalRecursion(root: TreeNode?) : List<Int> {
    val res: MutableList<Int> = ArrayList()
    helper(root, res)
    return res
}

fun helper(root: TreeNode?, result: MutableList<Int>) {
    if (root != null){
        helper(root.left, result)
        result.add(root.value)
        helper(root.right, result)
    }
}

fun inorderTraversal(root: TreeNode?) : List<Int> {
    val result : MutableList<Int> = ArrayList()
    val stack : Deque<TreeNode> = java.util.ArrayDeque()
    var curr = root

    while (curr != null || stack.isNotEmpty()){
        while (curr != null){
            stack.push(curr)
            curr = curr.left
        }
        curr = stack.pop()
        result.add(curr.value)
        curr = curr.right
    }

    return result
}