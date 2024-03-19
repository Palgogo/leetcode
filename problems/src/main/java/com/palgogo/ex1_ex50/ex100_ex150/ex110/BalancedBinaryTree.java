package com.palgogo.ex1_ex50.ex100_ex150.ex110;


import com.palgogo.common.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
