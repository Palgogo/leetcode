package com.palgogo.ex200_ex250.ex226;

import java.util.LinkedList;

public class InvertBinaryTree {

    public TreeNode invertBinaryTree(TreeNode root) {
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.right = invertBinaryTree(root.left);
        node.left = invertBinaryTree(root.right);
        return node;
    }

    public TreeNode invertBinaryTreeIterative(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

            TreeNode curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
        }
        return root;
    }

}
