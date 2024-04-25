package com.palgogo.ex200_ex250.ex211;

public class WordDictionary {

    Node root;

    public WordDictionary() {
        root = new Node('\0'); //stub
    }

    public void addWord(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (curr.children[ch - 'a'] == null) {
                curr.children[ch - 'a'] = new Node(ch);
            }

            curr = curr.children[ch - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {

        return searchHelper(word, root, 0);
    }

    boolean searchHelper(String word, Node curr, int index) {
        for (int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == '.') {
                for (Node child : curr.children) {
                    if (child != null && searchHelper(word, child, i + 1)) {
                        return true;
                    }
                }
                return false;
            }

            if (curr.children[ch - 'a'] == null) {
                return false;
            }

            curr = curr.children[ch - 'a'];
        }
        return curr.isWord;
    }
}

class Node {
    char value;
    boolean isWord;
    Node[] children;

    Node(char value) {
        this.value = value;
        this.isWord = false;
        this.children = new Node[26];
    }
}
