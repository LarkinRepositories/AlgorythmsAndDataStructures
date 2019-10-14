package Lesson_6.WebinarCodeSamples.HomeWork;

/*Создать и запустить программу для построения двоичного дерева.
В цикле построить двадцать деревьев с глубиной в 6 уровней. //DONE
 Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int. //DONE
 Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100. //NOT DONE
Проанализировать, какой процент созданных деревьев являются несбалансированными
 */

import Lesson_6.WebinarCodeSamples.MyTreeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWorkMain {
    private static final int DEPTH = 6;
    private static final int TREES_COUNT = 20;

    public static void main(String[] args) {
        List<MyTreeMap> myTreeMapList = new ArrayList<>(TREES_COUNT);

        for (int i = 0; i < TREES_COUNT; i++ ) {
            myTreeMapList.add(new MyTreeMap<Integer, Integer>());
            for (int j = 0; myTreeMapList.get(i).getDepth() < DEPTH; j++ ) {
                myTreeMapList.get(i).put(new Random().nextInt(100), new Random().nextInt(100));
            }
        }
//        myTreeMapList.forEach(e -> System.out.println(e.getDepth()));
//        myTreeMapList.forEach(e -> System.out.println(e.toString()));

    }
}
