package Lesson_5.HomeWork.KnapSack_Problem;

import lombok.Data;

@Data
public class Item implements Comparable<Item> {
    private Integer price;
    private Integer weight;

    public Item(Integer price, Integer weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int compareTo(Item item) {
        Integer currentDelta = this.price / this.weight;
        Integer itemDelta = item.price / item.weight;
        return currentDelta.compareTo(itemDelta);
    }
}
