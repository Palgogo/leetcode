package com.palgogo.ex100_ex149.ex102;

import com.palgogo.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelTraversal {

    public List<List<Integer>> levelTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return res;

        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int len = q.size();
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            res.add(level);
        }
        return res;
    }

}
