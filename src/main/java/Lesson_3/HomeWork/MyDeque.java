package Lesson_3.HomeWork;

import java.util.ArrayList;

public class MyDeque<T> extends MyQueue {
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private ArrayList<T> list;

    public MyDeque() {
        list = super.getList();
    }

    public MyDeque(int capacity) {
        super(capacity);
        this.list = super.getList();
    }

    public T peekLast() {
        if (this.list != null) return this.list.get(list.size()-1);
        else throw new NullPointerException();
    }

    public void insertFront(T item) {
        if (isFull()) throw new StackOverflowError();
        list.add(item);
    }

    public void removeFront() {
        if (this.list !=null) this.list.remove(this.list.get(0));
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

}
