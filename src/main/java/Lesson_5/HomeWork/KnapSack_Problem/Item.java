package Lesson_5.HomeWork.KnapSack_Problem;

import lombok.Getter;

@Getter
public class Item {
    private double price;
    private int weight;

    public Item(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }
}
