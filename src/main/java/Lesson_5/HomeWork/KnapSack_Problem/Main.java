package Lesson_5.HomeWork.KnapSack_Problem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        KnapSack knapSack = new KnapSack(80);
        List<Item> items = ProblemSolver.getInstance().generateItemList(5, 90, 70);
        List<Item> itemsPut = ProblemSolver.getInstance().solveKnapSackProblem(items, knapSack.getCapacity());
        System.out.println(items.toString());
        System.out.println(itemsPut.toString());

    }
}
