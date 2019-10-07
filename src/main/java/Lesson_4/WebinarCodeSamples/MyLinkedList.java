package Lesson_4.WebinarCodeSamples;

import lombok.Data;
import lombok.ToString;

@ToString
public class MyLinkedList<T> {
    private Node first = null;
    private Node last = null;
    private int size = 0;


    public void add(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) addFirst(newNode);
        first.setNext(newNode);
        size++;
    }

    public void add(int index, T item) {
        Node newNode = new Node(item);
        if (index < 0 || index > size) add(item);
        if (index == 0) addFirst(newNode);

    }

    public T removeFirst() {
        if (isEmpty()) return  null;
        Node oldFirst = first;
        first = first.next;
        size--;
        return oldFirst.value;
    }

    private void addFirst(Node node) {
        node.setNext(first);
        first = node;
        size++;
    }


    private boolean isEmpty() {
        return (first == null) && (last == null);
    }


    @Data
    private class Node {
        private T value;
        private Node next = null;
        private Node previous = null;

        Node(T item) {
            this.value = item;
        }

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "value=" + value +
//                    '}';
//        }
    }
}
