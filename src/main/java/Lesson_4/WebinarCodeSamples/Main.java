package Lesson_4.WebinarCodeSamples;


public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("First");
        myLinkedList.add("Second");
        System.out.println(myLinkedList.getFirstElement());
        System.out.println(myLinkedList.toString());
        try {
            myLinkedList.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(myLinkedList.toString());
        myLinkedList.add(1, "new Second");
        System.out.println(myLinkedList.toString());
        myLinkedList.add(0, "new First");
        System.out.println(myLinkedList.toString());
    }

}
