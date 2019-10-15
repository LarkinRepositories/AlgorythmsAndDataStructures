package Lesson_3.HomeWork;
import java.util.List;

public class MyPriorityQueue<T extends Comparable> extends MyQueue {
    List<T> list = super.getList();

    public void insert(int elementPriority, T element) {
       if (isFull()) throw new StackOverflowError();
       list.add(element);

    }


    private void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

}
