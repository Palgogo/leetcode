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