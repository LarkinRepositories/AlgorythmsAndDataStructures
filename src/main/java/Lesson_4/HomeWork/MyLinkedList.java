package Lesson_4.HomeWork;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Iterator;
import java.util.ListIterator;

@ToString @Getter
public class MyLinkedList<T> implements Iterable<T> {
    private Node first = null;
    private Node last = null;
    private int size = 0;

    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }


    public void addFirst(T item) {
        Node newNode = new Node(item);
        newNode.setNext(first);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrevious(newNode);
        }
        first = newNode;
        size++;
    }

    public void addLast(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) first = newNode;
        else {
            newNode.setPrevious(last);
            last.setNext(newNode);
        }
        last = newNode;
        size++;
    }

    public void add(int index, T item) {
        if (index < 0) addFirst(item);
        if (index > size) addLast(item);
        else {
            Node current = first;
            for (int i = 0; i < index -1; i++) {
                current = current.getNext();
            }
            Node newNode = new Node(item);
            newNode.setNext(current.getNext());
            newNode.setPrevious(current);
            current.setNext(newNode);
            newNode.getNext().setPrevious(newNode);
            size++;
        }
    }

    public T removeFirst() {
        if (isEmpty()) return  null;
        Node oldFirst = first;
        first = first.getNext();
        size--;
        if (isEmpty()) last = null;
        return oldFirst.getValue();
    }

    public T removeLast() {
        if (isEmpty()) return  null;
        Node oldLast = last;
        if (last.getPrevious() != null) last.getPrevious().setNext(null);
        else first = null;
        size--;
        last = last.getPrevious();
        return oldLast.getValue();
    }

    public boolean remove(T item) {
        if (isEmpty()) return  false;
        assert first != null;
        if (first.getValue().equals(item)) {
            removeFirst();
            return true;
        }
        Node current = first;
        while (current.getNext() != null && !current.getValue().equals(item)) {
            current = current.getNext();
        }
        if (current == last) {
            removeLast();
            return true;
        }
        assert current.getNext() != null;
        current.getNext().setPrevious(current.getPrevious());
        current.getPrevious().setNext(current.getNext());
        size--;
        return true;
    }

    public ListIterator<T> listIterator() {
        return new ListIteratorImpl();
    }
    private boolean isEmpty() {
        return (first == null) && (last == null);
    }


    @Getter @Setter
    class Node {
        private T value;
        private Node next = null;
        private Node previous = null;

        Node(T item) {
            this.value = item;
        }

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            Node current = first;
            StringBuilder sb = new StringBuilder();
            while (current != null) {
                sb.append(current.getValue()).append(", ");
                current = current.next;
            }
            return sb.toString();
        }
    }

    private class IteratorImpl implements Iterator<T> {
        private Node current;

        IteratorImpl() {
            current = new Node(null, getFirst());
        }

        @Override
        public boolean hasNext() {
            return current.getNext() == null;
        }

        @Override
        public T next() {
            return current.getNext().getValue();
        }
    }

    private class ListIteratorImpl implements ListIterator<T> {
        private Node current;

        ListIteratorImpl() {
            this.current = new Node(null, getFirst());
        }


        @Override
        public boolean hasNext() {
            return current.getNext() == null;
        }

        @Override
        public T next() {
            return current.getNext().getValue();
        }

        @Override
        public boolean hasPrevious() {
            return current.getPrevious() == null;
        }

        @Override
        public T previous() {
            return current.getPrevious().getValue();
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }
    }
}
