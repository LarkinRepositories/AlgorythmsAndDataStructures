package Lesson_5.WebinarCodeSamples;

import java.util.Arrays;
import java.util.Random;

public class RecursionMain<T> {
    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println(fibo(18));
        System.out.println(fiboRecurrent(18));
        System.out.println(triangleDigits(5));
        System.out.println(multiplication(5, 10));
        int[] arr = new int[new Random().nextInt(1000)];
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(arr));
        //System.out.println(binarySearchRecursive(arr,50));
        long t = System.currentTimeMillis();
        qSort(arr);
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(Arrays.toString(arr));

    }


    //факториал
    private static int fact(int x) {
        if (x == 0) return 1;
        return x * fact(x - 1);
    }

    //числа фибоначчи - цикл
    private static long fibo(int x) {
        int a = 1;
        int b = 1;
        for (int i = 3; i <= x; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    //числа фибоначии - рекурсия
    private static long fiboRecurrent(int x) {
        if (x < 3) return 1;
        return fiboRecurrent(x - 2) + fiboRecurrent(x - 1);
    }

    //треугольные числа
    private static int triangleDigits(int x) {
        if (x == 1) return 1;
        return x + triangleDigits(x - 1);
    }

    //умножение без умножения
    private static int multiplication(int digit, int multiplier) {
        if (multiplier == 0) return 0;
        return digit + multiplication(digit, multiplier - 1);
    }

//    private static void qSort(int[] array) {
//        if (array.length < 2) return;
//        int mid = array.length/2;
//        int[] firstArray = Arrays.copyOfRange(array, 0, mid);
//        int[] secondArray = Arrays.copyOfRange(array, mid, array.length);
//        int[] arr = new int[array.length];
//        qSort(firstArray);
//        qSort(secondArray);
//    }

    //бинарный поиск
    private static boolean binarySearchRecursive(int[] items, int item) {
        //Arrays.sort(items);
        qSort(items);
        int mid = items.length / 2;
        if (item == items[mid]) return true;
        else if (items.length == 1) return false;
        else if (item < items[mid]) return binarySearchRecursive(Arrays.copyOfRange(items, 0, mid - 1), item);
        else return binarySearchRecursive(Arrays.copyOfRange(items, mid, items.length - 1), item);
    }

    //быстрая сортировка
    private static <T> void qSort(T[] arr) {

    }

    private static void qSort(int[] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
//        int[] firstArray = Arrays.copyOfRange(array, 0, mid);
//        int[] secondArray = Arrays.copyOfRange(array, mid, array.length - 1);
//        qSort(firstArray);
//        qSort(secondArray);
    }
}
