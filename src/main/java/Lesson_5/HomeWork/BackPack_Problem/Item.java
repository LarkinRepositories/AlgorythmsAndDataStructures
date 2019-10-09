package Lesson_5.HomeWork.BackPack_Problem;

public class Item implements Comparable<Item> {
    private Double price;
    private Integer weight;

    Item(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int compareTo(Item item) {
        return this.price.compareTo(item.price);
    }
}
