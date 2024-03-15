package com.palgogo.ex550_ex599.ex572;

import com.palgogo.common.TreeNode;

public class IsSubtree {
    public boolean isSubtree(TreeNode root, TreeNode subTree) {
        if (root == null) return false;
        if (dfs(root, subTree)) return true;
        return isSubtree(root.left, subTree) && isSubtree(root.right, subTree);
    }

    private boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val) return dfs(p.left, q.left) && dfs(p.right, q.right);
        return false;
    }
}
