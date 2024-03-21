package com.palgogo.ex200_ex250.ex235;

import com.palgogo.common.TreeNode;
import com.sun.source.tree.Tree;

public class LowestCommonAncestorOfBinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode q, TreeNode p) {
        while (root != null){
           if ((root == p || root == q)
           || (root.val > p.val && root.val < q.val)
           || (root.val < p.val && root.val > q.val)){
               return root;
           }
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            }
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            }
        }
        return root;
    }
}
