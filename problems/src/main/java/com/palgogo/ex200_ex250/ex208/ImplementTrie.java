package com.palgogo.ex200_ex250.ex208;

public class ImplementTrie {

    Node root;

    ImplementTrie() {
        root = new Node('\0');
    }

    private void insert(String word) {
        Node curr = root;
        for (char x : word.toCharArray()) {
            if (curr.children[x - 'a'] == null) {
                curr.children[x - 'a'] = new Node(x);
            }
            curr = curr.children[x - 'a'];
        }
        curr.isWord = true;
    }

    private boolean search(String word) {
        Node res = getLast(word);
        return (res != null && res.isWord);
    }

    private boolean startsWith(String prefix) {
        Node res = getLast(prefix);
        if (res == null) return false;
        return true;
    }

    private Node getLast(String word) {
        Node curr = root;
        for (char x : word.toCharArray()) {
            if (curr.children[x - 'a'] == null) {
                return null;
            }
            curr = curr.children[x - 'a'];
        }
        return curr;
    }

    private class Node {
        private char value;
        private boolean isWord;
        private Node[] children;

        Node(char value) {
            this.value = value;
            this.isWord = false;
            this.children = new Node[26];
        }
    }
}
