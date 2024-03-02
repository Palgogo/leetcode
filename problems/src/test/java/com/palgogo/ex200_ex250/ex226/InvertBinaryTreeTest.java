package com.palgogo.ex200_ex250.ex226;

import com.palgogo.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

    @Test
    void invertBinaryTree() {
        //given
        int[] root = {4, 2, 7, 1, 3, 6, 9};
        int[] expected = {4, 7, 2, 9, 6, 3, 1};
        TreeNode node = TreeNode.createBinaryTree(root);
        //when
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.invertBinaryTree(node);
        int[] resultArr = TreeNode.toArray(result);
        //then
        Assertions.assertArrayEquals(resultArr, expected);
    }

    @Test
    void invertBinaryTreeIteractive() {
        //given
        int[] root = {4, 2, 7, 1, 3, 6, 9};
        int[] expected = {4, 7, 2, 9, 6, 3, 1};
        TreeNode node = TreeNode.createBinaryTree(root);
        //when
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.invertBinaryTreeIterative(node);
        //then
        Assertions.assertArrayEquals(expected, TreeNode.toArray(result));

    }

}