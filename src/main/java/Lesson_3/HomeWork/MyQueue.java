package Lesson_3.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MyQueue<T> {
    private ArrayList<T> list = null;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public ArrayList<T> getList() {
        return list;
    }

    public MyQueue() {
        this.list = new ArrayList<>(DEFAULT_CAPACITY);
        this.capacity = DEFAULT_CAPACITY;
    }

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>(capacity);
    }

    public int size() {
        return this.list.size();
    }

    public boolean isFull() {
        return this.list.size() == capacity;
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public T remove() {
        if (list !=null) {
            T temp = list.get(0);
            list.remove(list.get(0));
            list.trimToSize();
            return temp;
        }
        else throw new NullPointerException();
    }

    public void insert(T element) {
        if (list !=null && !this.isFull()) this.list.add(element);
        else throw new StackOverflowError();
    }

    public T peekFront() {
        if (list != null)  return list.get(0);
        else throw new NullPointerException();
    }


    @Override
    public String toString() {
        return this.list.toString();
    }

}
