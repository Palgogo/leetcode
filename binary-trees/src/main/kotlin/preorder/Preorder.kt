package preorder

import java.util.Deque
import java.util.LinkedList

//todo reformat project ot gradle multimodule
open class TreeNode {
    var left: TreeNode? = null
    var right: TreeNode? = null
    var value: Int = 0

    constructor()
    constructor(value: Int) {this.value = value}
    constructor(value: Int, left: TreeNode, right: TreeNode){
        this.value = value
        this.left = left
        this.right = right
    }
}


//recursion
fun preorderTraversal(root: TreeNode?) : List<Int>{
    val result : MutableList<Int> = ArrayList()

    if (root == null){
        return result;
    }

    result.add(root.value)
    result.addAll(preorderTraversal(root.left))
    result.addAll(preorderTraversal(root.right))
    return result
}

// stack
fun preorderTraversalStack(root: TreeNode?) : MutableList<Int>{
    val result: MutableList<Int> = ArrayList()
    if (root == null){
        return result;
    }

    var stack: Deque<TreeNode> = java.util.ArrayDeque()
    stack.push(root)

    while (stack.isNotEmpty()){
        val node = stack.pop()
        result.add(node.value)
        //check right WHY?
        if (node.right != null){
            stack.push(node.right)
        }
        if (node.left != null){
            stack.push(node.left)
        }
    }
    return result
}


//morris
fun preorderTraversalMorris(root: TreeNode?) : List<Int>{
    val output : MutableList<Int> = LinkedList()
    var node: TreeNode? = root

    while (node != null) {
        output.add(node.value)

        if (node.left == null) {
            node = node.right
        } else {
            val left = node.left
            val right = node.right
            node = node.left

            var rightMostOfLeft = left
            while (rightMostOfLeft!!.right != null) {
                rightMostOfLeft = rightMostOfLeft.right
            }
            rightMostOfLeft.right = right
        }
    }
    return output

}
