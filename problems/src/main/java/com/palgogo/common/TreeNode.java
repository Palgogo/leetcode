package com.palgogo.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static int[] levelTraversal(TreeNode root) {
        if (root == null) return new int[0];
        var result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            result.add(currentNode.val);

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] toArray(TreeNode root) {
        var list = new ArrayList<Integer>();

        int[] result = levelTraversal(root);
        return result;
    }

    public static TreeNode createBinaryTree(int[] array) {
        if (array == null || array.length == 0) return null;
        TreeNode[] nodes = new TreeNode[array.length];

        // Create all nodes and store them in an array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != Integer.MIN_VALUE) { // Assuming Integer.MIN_VALUE represents null
                nodes[i] = new TreeNode(array[i]);
            }
        }

        assignChildrenFotEachNode(array, nodes);

        return nodes[0]; // The root of the binary tree
    }

    public static TreeNode createBinaryTree(List<Integer> list){
        if (list.isEmpty()) return null;
        TreeNode[] treeNodes = new TreeNode[list.size()];

        for (int i = 0; i < list.size(); i++) {
            treeNodes[i] = new TreeNode(list.get(i));
        }

        assignChildrenFotEachNode(list, treeNodes);

        return treeNodes[0];
    }

    private static void assignChildrenFotEachNode(List<Integer> list, TreeNode[] nodes) {
        //Assign children for each node
        for (Integer val : list) {
            if (val != null && nodes[val] != null) {

                int leftIndex = 2 * val + 1;
                int rightIndex = 2 * val + 2;
                if (leftIndex < list.size() && nodes[leftIndex] != null) {
                    nodes[val].left = nodes[leftIndex];
                }
                if (rightIndex < list.size() && nodes[rightIndex] != null) {
                    nodes[val].right = nodes[rightIndex];
                }
            }

        }
    }


    private static void assignChildrenFotEachNode(int[] array, TreeNode[] nodes) {
        // Assign children for each node
        for (int i = 0; i < array.length; i++) {
            if (nodes[i] != null) {
                int leftIndex = 2 * i + 1;
                int rightIndex = 2 * i + 2;
                if (leftIndex < array.length && nodes[leftIndex] != null) {
                    nodes[i].left = nodes[leftIndex];
                }
                if (rightIndex < array.length && nodes[rightIndex] != null) {
                    nodes[i].right = nodes[rightIndex];
                }
            }
        }
    }

    void inOrderTraversal(List<Integer> list) {
        if (this.left != null) {
            this.left.inOrderTraversal(list);
        }
        list.add(this.val);
        if (this.right != null) {
            this.right.inOrderTraversal(list);
        }
    }

    void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.val);
            inOrderRec(root.right);
        }
    }
}
