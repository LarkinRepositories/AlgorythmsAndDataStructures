package Lesson_4.HomeWork;

import lombok.*;

//использован lombok, краткий FAQ: https://habr.com/ru/post/438870/

@Getter @EqualsAndHashCode @ToString
public class MyOneSidedLinkedList<T> {
    @Setter
    private Node firstElement = null;
    private int size = 0;


    public boolean isEmpty() {
        return this.firstElement == null;
    }

    public T getFirstElementValue() {
        return this.firstElement.getValue();
    }

    public void add(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) this.firstElement = newNode;
        firstElement.setNextElement(newNode);
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) add(item);
        if (index == 0) addFirst(item);
        else {
            Node current = firstElement;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNextElement();
            }
            Node newNode = new Node(item);
            newNode.setNextElement(current.getNextElement());
            current.setNextElement(newNode);
            size++;
        }
    }



    public void remove() throws Exception {
        if (isEmpty()) throw new Exception("The list is empty");
        Node oldFirst = firstElement;
        firstElement = firstElement.getNextElement();
        size--;
    }

    public boolean remove(T item) throws Exception {
        if (isEmpty()) throw new Exception("The list is empty");
        if (getFirstElement().getValue().equals(item)) { remove(); return true; }
        Node current = firstElement;
        while (current.getNextElement() != null && !current.getNextElement().getValue().equals(item)) {
            current = current.getNextElement();
        }
        if (current.getNextElement() == null) return false;
        current.setNextElement(current.getNextElement().getNextElement());
        size--;
        return true;
    }

    public int indexOf(T item) {
        Node current = firstElement;
        int index = 0;
        while (current != null) {
            if (current.getValue().equals(item)) return index;
            current = current.getNextElement();
            index++;
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }


    private void addFirst(T item) {
        Node newNode = new Node(item);
        newNode.setNextElement(this.getFirstElement());
        this.setFirstElement(newNode);
        size++;
    }

    @Data
    private class Node {

        private T value;
        private Node nextElement;

        Node(T value) {
            this.value = value;
        }

    }
}
