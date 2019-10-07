package GrokkingAlgorithms.Chapter_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DivideAndConquer {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTheList(list);
        sum(list);
        System.out.println(sum(list));
        System.out.println(fact(5 ));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(500, 0,500,1,200,10));
        System.out.println(sum(list1));
        System.out.println(getElementsCount(list));
        System.out.println(findTheBiggestElement(list1));
    }

    private static List fillTheList(List<Integer> list) {
        final int LIST_SIZE = 100;
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(new Random().nextInt(100));
        }
        return list;
    }
    //напишите рекурсивную функцию для суммы элементов списка
    private static int sum(List<Integer> list) {
       if (list.size() == 0) return 0;
       return list.get(0) + sum(list.subList(1, list.size()));
    }

    //напишите рекурсивную функцию для подсчета элементов в списке
    private static int getElementsCount(List<?> list) {
        if (list.size() == 0) return  0;
        return  1 + getElementsCount(list.subList(1, list.size()));
    }

    //найдите наибольшее число в списке
    private static int findTheBiggestElement(List<Integer> list) {
        if (list.size() == 0) return 0;
        return Math.max(list.get(0), findTheBiggestElement(list.subList(1, list.size())));
    }

    //факториал, просто так
    private static int fact(int x) {
        if (x == 1 || x == 0) return 1;
        return x * fact(x-1);
    }

}
