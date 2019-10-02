package Lesson_3.WebinarCodeSamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyStack<T> {
    private List<T> list = null;
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

    public T pop(T element) {
        if (list != null && this.list.contains(element)) {
            T temp = list.get(list.indexOf(element));
            list.remove(element);
            return temp;
        }
        return null;
    }

    public void push(T element) {
        if (list !=null && !this.isFull()) this.list.add(element);
        else throw new StackOverflowError();
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
