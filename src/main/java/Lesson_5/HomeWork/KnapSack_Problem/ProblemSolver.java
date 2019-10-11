package Lesson_5.HomeWork.KnapSack_Problem;

import java.util.ArrayList;
import java.util.List;

public class ProblemSolver {
    private static volatile ProblemSolver instance;

    private ProblemSolver() {}

    public static ProblemSolver getInstance() {
        ProblemSolver localinstance = instance;
        if (localinstance == null) {
            synchronized (ProblemSolver.class) {
                localinstance = instance;
                if (localinstance == null) {
                    instance = localinstance = new ProblemSolver();
                }
            }
        }
        return localinstance;
    }

    public List generateItemList(int itemsCount, double itemMaxPrice, int itemMaxWeight) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < itemsCount; i++) {
            items.add(new Item(Math.random() * itemMaxPrice, (int) (Math.random() * itemMaxWeight)));
        }
        return items;
    }

}
