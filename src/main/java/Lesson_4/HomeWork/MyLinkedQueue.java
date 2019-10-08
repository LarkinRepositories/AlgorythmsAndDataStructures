package Lesson_4.HomeWork;

import lombok.ToString;

@ToString
public class MyLinkedQueue<T> {
    private final int DEFAULT_CAPACITY = 10;
    private MyLinkedList<T> myLinkedQueue;
    private int capacity;

    public MyLinkedQueue() {
        myLinkedQueue = new MyLinkedList<>();
        capacity = DEFAULT_CAPACITY;
    }

    public int size() {
        return myLinkedQueue.getSize();
    }
    public boolean isFull() {
        return capacity == myLinkedQueue.getSize();
    }
    public T remove() {
        return myLinkedQueue.removeFirst();
    }

    public void insert(T element) {
        myLinkedQueue.addFirst(element);
    }

    public T peekfront() {
        return myLinkedQueue.getFirst().getValue();
    }
}
