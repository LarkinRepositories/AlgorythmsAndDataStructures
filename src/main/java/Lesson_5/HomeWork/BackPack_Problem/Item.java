package Lesson_5.HomeWork.Backpack_Problem;

import lombok.Data;
import lombok.RequiredArgsConstructor;


public class Item {
    private double price;
    private int weight;

    Item(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }
}
