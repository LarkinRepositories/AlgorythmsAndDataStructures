package Lesson_8.WebinarCodeSamples;

import lombok.Getter;

import java.util.LinkedList;
import java.util.ListIterator;


public class ChainingHashMap<Key, Value> {
    private int capacity = 97;
    private int size = 0;

    private LinkedList<Node>[] nodes;

    public ChainingHashMap() {
        nodes = new LinkedList[capacity];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList<>();
        }
    }

    private class Node {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) throw new  IllegalArgumentException("key == null");
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        int i = hash(key);
        nodes[i].forEach( e -> { if (e.key.equals(key)) e.value = value; return;});
        nodes[i].addLast(new Node(key, value));
        size++;
    }

//    public void remove(Key key) {
//        isKeyNotNull(key);
//        int i = hash(key);
//        ListIterator<Key> iterator = nodes[i].listIterator()
//    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node: nodes[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }


    public boolean contains(Key key) {
        return get(key) == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            nodes[i].forEach(e -> sb.append(e.key).append("=").append(e.value));
            sb.append("\n");
        }
        return sb.toString();
    }
}
