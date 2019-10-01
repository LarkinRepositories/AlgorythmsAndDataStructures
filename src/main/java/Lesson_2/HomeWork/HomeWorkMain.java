package Lesson_2.HomeWork;
/*
Создать массив большого размера (миллион элементов). DONE
Написать методы удаления, добавления, поиска элемента массива. DONE
Заполнить массив случайными числами. DONE
Написать методы, реализующие рассмотренные виды сортировок и проверить скорость выполнения каждой. DONE

 */
public class HomeWorkMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(1000000);
        for (int i = 0; i < list.size(); i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list.toString());
        long t = System.currentTimeMillis();
        list.selectionSort();
        System.out.println(System.currentTimeMillis() - t);
        long t1 = System.currentTimeMillis();
        list.insertionSort();
        System.out.println(System.currentTimeMillis() - t1);
        long t3 = System.currentTimeMillis();
        list.bubbleSort();
        System.out.println(System.currentTimeMillis() - t3);

    }

}
