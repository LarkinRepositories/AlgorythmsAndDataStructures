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
            items.add(new Item((int) (Math.random() * itemMaxPrice) , (int) (Math.random() * itemMaxWeight)));
        }
        return items;
    }

    public List solveKnapSackProblem(List<Item> items, int knapSackWeight) {
        List<Item> itemsToGrab = new ArrayList<>();
//        for (int i = 0; i < items.size(); i++) {
//            if (calculateWeight(items) <= knapSackWeight) {
//                itemsToGrab.add(items.get(i));
//            }
        if (items.size() == 0) return itemsToGrab;
        if (calculateWeight(itemsToGrab) <= knapSackWeight && calculatePrice(itemsToGrab) > calculatePrice(items)) itemsToGrab = items;
        solveKnapSackProblem(items.subList(0, items.size()-1), knapSackWeight);
        return itemsToGrab;
    }


    private int calculateWeight(List<Item> items) {
        AtomicInteger totalWeight = new AtomicInteger();
        items.forEach(item -> totalWeight.addAndGet(item.getWeight()));
        return totalWeight.intValue();
    }

    private int calculatePrice(List<Item> items) {
        AtomicInteger totalPrice = new AtomicInteger();
        items.forEach(item -> totalPrice.addAndGet((int) item.getPrice()));
        return totalPrice.intValue();
    }


}
