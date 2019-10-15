package Lesson_4.HomeWork;



public class MyLinkedStack<T> {
    private final int DEFAULT_CAPACITY = 10;

    private MyLinkedList<T> linkedStackList;
    private int capacity;

    public MyLinkedStack() {
        this.linkedStackList = new MyLinkedList<>();
        this.capacity = DEFAULT_CAPACITY;
    }


    public void push(T item) {
        linkedStackList.addLast(item);
    }

    public T pop() {
        return linkedStackList.removeFirst();
    }

    public T peek() {
        return linkedStackList.getLast().getValue();
    }

    public int size() {
        return linkedStackList.getSize();
    }

    public boolean isEmpty() {
        return linkedStackList.getFirst() == null;
    }

    public boolean isFull() {
        return size() == capacity;
    }
}
