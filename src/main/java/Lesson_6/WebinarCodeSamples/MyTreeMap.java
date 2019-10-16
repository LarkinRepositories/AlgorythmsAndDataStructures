package Lesson_6.WebinarCodeSamples;

import lombok.Getter;
import lombok.Setter;

public class MyTreeMap<Key extends Comparable<Key>, Value> {
    private Node root;


    @Getter
    private class Node {
        private Key key;
        @Setter
        private Value value;
        private Node left;
        private Node right;
        @Setter
        private  int size;
        private int depth;

        Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            size = 1;
            depth = 0;
        }



    }

    private int internalSize(Node node) {
        if (node == null) return 0;
        return node.getSize();
    }

    private void notNull(Key key) {
        if (key == null) throw new IllegalArgumentException("key == null");
    }

    private Value get(Node node, Key key) {
        notNull(key);
        if (node == null) return null;
        int compare = key.compareTo(node.key);
        if (compare == 0) return node.value;
        else if (compare < 0) return get(node.left, key);
        else return get(node.right, key);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) return new Node(key, value);
        int compare = key.compareTo(node.getKey());
        if (compare == 0) node.setValue(value);
        else if (compare < 0 ) node.left = put(node.left, key, value);
        else node.right = put(node.right, key, value);
        node.setSize(internalSize(node.left) + internalSize(node.right) + 1);
        return node;
    }

    private String toString(Node node) {
        if (node == null) return " ";
        return toString(node.left) +" "+ node.key.toString() + "="+node.value.toString() + " " +toString(node.right);
    }

    private Node min(Node node) {
        if (node == null) return node;
        return min(node.left);
    }

    private Node max(Node node) {
        if (node == null) return node;
        return max(node.right);
    }

    private Node removeMin(Node node) {
        if (node.left == null) return node.right;
        node.left = removeMin(node.left);
        node.setSize(internalSize(node.left) + internalSize(node.right) + 1);
        return node;
    }

    private Node remove(Node node, Key key) {
        if (node == null) return null;
        int compare = key.compareTo(node.key);
        if (compare < 0) node.left = remove(node.left, key);
        else if (compare > 0) node.right = remove(node.right, key);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            Node temp = node;
            node = min(node.right);
            node.left = temp.left;
            node.right = removeMin(temp.right);
        }
        node.setSize(internalSize(node.left) + internalSize(node.right) + 1);
        return  node;
    }

    private int getDepth(Node node) {
        if (node == null) return 0;
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }

    public int size() {
        return internalSize(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    public boolean contains(Key key) {
        return get(root, key) != null;
    }

    public void put(Key key, Value value) {
        notNull(key);
        if (value == null) { remove(key); }
        root = put(root, key, value);
    }

    public Key minKey() {
        return min(root).getKey();
    }

    public void remove(Key key) {
        notNull(key);
        remove(root, key);
    }

    public int getDepth() {
        return getDepth(root);
    }

    public boolean isBalanced() {
        return false;
    }

    @Override
    public String toString() {
        return toString(root);
    }
}
