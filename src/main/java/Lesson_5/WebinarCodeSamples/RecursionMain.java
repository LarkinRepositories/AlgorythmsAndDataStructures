package Lesson_5.WebinarCodeSamples;

import java.util.Arrays;

public class RecursionMain<T> {
    public static void main(String[] args) {
//        System.out.println(fact(10));
//        System.out.println(fibo(18));
        System.out.println(triangleDigits(5));
        System.out.println(multiplication(5,10));
        int[] arr = new int[10];
        arr[2] = 10;
//        System.out.println(binarySearchRecursive(arr, 10));
        //qSort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));

    }


    //факториал
    private static int fact(int x) {
        if (x == 0) return 1;
        return x * fact(x-1);
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
        return fiboRecurrent(x-2) + fiboRecurrent(x-1);
    }

    //треугольные числа
    private static int triangleDigits(int x) {
        if (x == 1) return 1;
        return x + triangleDigits(x-1);
    }

    //умножение без умножения
    private static int multiplication(int digit, int multiplier) {
        if (multiplier == 0) return  0;
        return digit + multiplication(digit, multiplier-1);
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
    private static <T> boolean binarySearchRecursive(int[] items, int item) {
        Arrays.sort(items);
        int mid = items.length/2;
        if (mid == items[mid]) return true;
        else if (items[mid] < item) return binarySearchRecursive(Arrays.copyOfRange(items, 0, mid), item);
        else return binarySearchRecursive(Arrays.copyOfRange(items,mid+1, items.length-1), item);
    }

}
