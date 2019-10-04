package Lesson_3.WebinarCodeSamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MyQueue<T> {
    private List<T> list = null;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity = DEFAULT_CAPACITY;

    public MyQueue() {
        this.list = new ArrayList<>(DEFAULT_CAPACITY);
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

    public T pop() {
        if (list !=null) {
            T temp = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return temp;
        }
        else throw new NullPointerException();
    }

    public void push(T element) {
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
