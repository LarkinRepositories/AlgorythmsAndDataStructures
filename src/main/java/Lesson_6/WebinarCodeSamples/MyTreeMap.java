package Lesson_6.WebinarCodeSamples;

import lombok.Getter;
import lombok.Setter;

public class MyTreeMap<Key extends Comparable<Key>, Value> {
    Node root;


    @Getter
    private class Node {
        private Key key;
        @Setter
        private Value value;
        private Node left;
        private Node right;
        @Setter
        private  int size;

        Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            size = 1;
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
        if (value == null) //remove(key);
        root = put(root, key, value);
    }


}
