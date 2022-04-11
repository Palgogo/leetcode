package postorder

import TreeNode

class Postorder {

    fun traversalTree(root: TreeNode?): List<Int>{
        val result: MutableList<Int> = ArrayList()
        traversePostorder(root, result)
        return result
    }

    private fun traversePostorder(root: TreeNode?, result: MutableList<Int>) {
        if (root != null){
             traversePostorder(root.left, result)
            traversePostorder(root.right, result)
            result.add(root.value)
        }
    }


}