package level_traversal

import TreeNode
import java.util.LinkedList
import java.util.Queue

class LevelTraversal {
    fun traversalLevel(root:TreeNode?):List<List<Int>>{
        val result :MutableList<MutableList<Int>> = ArrayList()
        val level: Queue<TreeNode> = LinkedList()
        if (root != null){
            level.offer(root)
        }
        var curr: TreeNode?
        while (level.isNotEmpty()){
            val size = level.size
            val temp: MutableList<Int> = LinkedList()
            for (i in 0 until size){
                curr = level.poll()
                temp.add(curr.value)
                if (curr.left != null){
                    level.offer(curr.left)
                }
                if (curr.right != null){
                    level.offer(curr.right)
                }
            }
            result.add(temp)
        }
        return result
    }
}