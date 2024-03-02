package com.palgogo.ex500_ex549.ex543;

import com.palgogo.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiameterBinaryTreeTest {

    @Test
    void diameterOfBinaryTree() {
        int[] treeArr = {1, 2, 3, 4, 5};
        TreeNode root = TreeNode.createBinaryTree(treeArr);
        int expected = 3;
        //when
        DiameterBinaryTree diameterBinaryTree = new DiameterBinaryTree();
        int result = diameterBinaryTree.diameterOfBinaryTree(root);
        //then
        Assertions.assertEquals(expected, result);

    }
}