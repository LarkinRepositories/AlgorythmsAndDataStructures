package Lesson_5.HomeWork.KnapSack_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
            items.add(new Item((int) (Math.random() * itemMaxPrice) + 1, (int) (Math.random() * itemMaxWeight)+ 1));
        }
        return items;
    }

    public List solve(List<Item> items, int knapSackWeight) {
        items.sort(Item::compareTo);
        if (calculateWeight(items) <= knapSackWeight) return items;
        return solve(items.subList(1, items.size()), knapSackWeight);
    }

    private int calculateWeight(List<Item> items) {
        AtomicInteger totalWeight = new AtomicInteger();
        items.forEach(item -> totalWeight.addAndGet(item.getWeight()));
        return totalWeight.intValue();
    }

}
