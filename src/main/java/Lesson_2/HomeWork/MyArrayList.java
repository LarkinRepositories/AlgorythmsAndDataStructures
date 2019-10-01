package Lesson_2.HomeWork;

import java.util.Comparator;

public class MyArrayList<T extends Comparable> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] list = null;
    private int position = 0;

    public MyArrayList() {
        this.list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) throw new ArithmeticException("capacity <= 0");
        this.list = (T[]) new Comparable[capacity];
    }

    public void add(T item) {
       list[position] = item;
       position++;
    }

    public void add(int index, T item) {
        if (index < 0) index = 0;
        if (index > position) index = position;
        for (int i = position; i > index; i++) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        position++;
    }

    public boolean remove(T item) {
       int i = 0;
       while (i < position && !list[i].equals(item)) {
           i++;
       }
       if (i == position) {
           return false;
       }
       for (int j = i; j < position - 1; j++) {
           list[j] = list[j+1];
       }
       position--;
       list[position] = null;
       return true;
    }

    public boolean find(T item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) return true;
        }
        return false;
    }

    public int size() {
        return list.length;
    }



    public void bubbleSort() {
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length-1; j > i; j--) {

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            s.append(list[i]+" ");
        }
        return s.toString();
    }

    private boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        int iMin;
        for (int i  = 0; i < position-1; i++) {
            iMin = i;
            for (int j = i + 1; j < position; j++) {
                if (less(list[j], list[iMin])) {
                    iMin = j;
                }
            }
            swap(i, iMin);
        }
    }

    public void insertionSort() {
        T key;
        for (int i = 1; i < position; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && less(key, list[j-1])) {
                list[j] = list[j-1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort(Comparator comparator) {
        boolean isSwap;
        for (int i = position -1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (comparator.compare(list[j+1], list[j]) < 0) {
                    swap(j+1,j);
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

}
