package com.palgogo.ex51_ex99;

import com.palgogo.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateBinaryTree {

    public boolean isValidTree(TreeNode root) {
        if (root == null) return true;
        return dfs(root, null, null);

    }

    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }

    public boolean isValidTreeInOrderTraversal(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && pre.val > root.val) {
                return false;
            }
            pre = root;
            root = root.right;
        }
        return true;
    }
}
