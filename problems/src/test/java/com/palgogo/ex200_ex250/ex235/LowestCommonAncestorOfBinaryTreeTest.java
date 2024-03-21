package com.palgogo.ex200_ex250.ex235;

import com.palgogo.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfBinaryTreeTest {

    @Test
    void lowestCommonAncestor() {
        //given
        List<Integer> input = new ArrayList<>(Arrays.asList(6,2,8,0,4,7,9, null, null, 3,5));
        TreeNode root = TreeNode.createBinaryTree(input);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        LowestCommonAncestorOfBinaryTree lowestCommonAncestorOfBinaryTree = new LowestCommonAncestorOfBinaryTree();
        TreeNode expected = new TreeNode(6);
        //when
        TreeNode result = lowestCommonAncestorOfBinaryTree.lowestCommonAncestor(root, p, q);

        //then
        Assertions.assertEquals(expected.val, result.val);
    }
}