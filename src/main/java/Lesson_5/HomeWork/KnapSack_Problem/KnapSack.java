package Lesson_5.HomeWork.KnapSack_Problem;

import lombok.Getter;

@Getter
public class KnapSack {
    private final int DEFAULT_CAPACITY = 150;
    private int capacity;

    public KnapSack() {
        this.capacity = DEFAULT_CAPACITY;
    }

    public KnapSack(int capacity) {
        this.capacity = capacity;
    }
}
