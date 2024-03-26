package com.palgogo.ex1400_ex1449.ex1448;

import com.palgogo.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GoodNodesTreeTest {

    @Test
    void goodNodes() {
        //given
        int expected = 4;
        Integer[] inputArr = {3, 1, 4, 3, null, 1, 5};
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < inputArr.length; i++) {
            integerArrayList.add(inputArr[i]);
        }
        List<Integer> inputList = Arrays.asList(3, 1, 4, 3, null, 1, 5);
        var root = TreeNode.createBinaryTree(inputList);
        var goodNodesTree = new GoodNodesTree();
        //when
        int result = goodNodesTree.goodNodes(root);

        //then
        Assertions.assertEquals(4, result);
    }
}