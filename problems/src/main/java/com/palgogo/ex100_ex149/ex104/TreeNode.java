package com.palgogo.ex100_ex149.ex104;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Method to create a tree from an array
    public static TreeNode createTreeFromArray(int[] array) {
        if (array == null || array.length == 0) return null;

        TreeNode root = new TreeNode(array[0]); // Initialize root with first element

        for (int i = 1; i < array.length; i++) {
            root.insert(array[i]); // Insert each element into the tree
        }

        return root;
    }

    static int[] levelTraversal(int[] arr) {
        TreeNode root = createTreeFromArray(arr);
        return levelTraversal(root);
    }

    static int[] levelTraversal(TreeNode root) {
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

    // Helper method to insert a value into the tree
    void insert(int val) {
        if (val < this.val) {
            if (this.left == null) {
                this.left = new TreeNode(val);
            } else {
                this.left.insert(val);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode(val);
            } else {
                this.right.insert(val);
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
}
