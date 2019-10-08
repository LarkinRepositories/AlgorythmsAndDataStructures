package Lesson_5.HomeWork.BackPack_Problem;



import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

    public List generateItemList() {
        final int ITEMS_COUNT = (int) (Math.random() * 100);
        Item[] items = IntStream.range(0, ITEMS_COUNT)
                .mapToObj(obj -> new Item(Math.random() * 1500, (int) (Math.random() * 80)))
                .toArray(Item[]::new);
        return Arrays.asList(items);
    }
}
