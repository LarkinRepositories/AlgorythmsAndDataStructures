package Lesson_5.HomeWork.KnapSack_Problem;

import lombok.Data;

@Data
public class Item {
    private int price;
    private int weight;

    public Item(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }
}
