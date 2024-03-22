package com.palgogo.ex150_ex200.ex199;

import com.palgogo.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 */
public class RightSideView {

    public List<Integer> rightSide(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res, int depth) {
        if (root != null) {
            if (depth == res.size()) {
                res.add(root.val);
            }
            //the order is essential
            dfs(root.right, res, depth + 1); //the +1 is essential, I don't know why
            dfs(root.left, res, depth + 1);
        }
    }
}
