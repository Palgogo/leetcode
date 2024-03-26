package com.palgogo.ex1400_ex1449.ex1448;

import com.palgogo.common.TreeNode;

public class GoodNodesTree {
    public int goodNodes(TreeNode root) {
//        int max = root.val;
        return helper(root, -9999);
    }

    private int helper(TreeNode node, Integer max) {
        if (node == null) return 0;
        int res = node.val >= max ? 1 : 0;

        res += helper(node.left, Math.max(node.val, max));
        res += helper(node.right, Math.max(node.val, max));
        return res;
    }


}
