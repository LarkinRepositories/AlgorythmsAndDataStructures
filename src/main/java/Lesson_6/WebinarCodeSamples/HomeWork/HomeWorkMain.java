package Lesson_6.WebinarCodeSamples.HomeWork;

/*Создать и запустить программу для построения двоичного дерева.
В цикле построить двадцать деревьев с глубиной в 6 уровней. //DONE
 Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int. //DONE
 Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100. //NOT DONE
Проанализировать, какой процент созданных деревьев являются несбалансированными
 */

import Lesson_6.WebinarCodeSamples.MyTreeMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class HomeWorkMain {
    private static final int DEPTH = 6;
    private static final int TREES_COUNT = 20;

    public static void main(String[] args) {
        List<MyTreeMap> myTreeMapList = new ArrayList<>(TREES_COUNT);

        for (int i = 0; i < TREES_COUNT; i++ ) {
            myTreeMapList.add(new MyTreeMap<Integer, Integer>());
            while (myTreeMapList.get(i).getDepth() < DEPTH) {
                myTreeMapList.get(i).put(new Random().nextInt(100), new Random().nextInt(100));
            }
        }

        System.out.printf("Percentage of balanced trees is: %s", calculateUnbalancedTreesPercentage(myTreeMapList));

    }

    private static int calculateUnbalancedTreesPercentage(List<MyTreeMap> list) {
        AtomicInteger counter = new AtomicInteger();
        list.forEach(e -> { if (!e.isBalanced()) counter.incrementAndGet(); });
        if (counter.intValue() == 0) return 0;
        return list.size() / counter.intValue() * 100;
    }
}
