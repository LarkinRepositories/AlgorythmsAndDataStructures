package Lesson_3.HomeWork;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack<T> {
    private ArrayList<T> list = null;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        this.list = new ArrayList<>(DEFAULT_CAPACITY);
        this.capacity = DEFAULT_CAPACITY;
    }

    public MyStack(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("bad size: "+capacity);
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
           list.trimToSize();
           return temp;
       }
       else throw new NullPointerException();
    }

    public void push(T element) {
        if (list !=null && !this.isFull()) this.list.add(element);
        else throw new StackOverflowError();
    }

    public T peek() {
        if (list != null)  return list.get(list.size()-1);
        else throw new NullPointerException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack<?> myStack = (MyStack<?>) o;
        return capacity == myStack.capacity && Objects.equals(list, myStack.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, capacity, DEFAULT_CAPACITY);
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
