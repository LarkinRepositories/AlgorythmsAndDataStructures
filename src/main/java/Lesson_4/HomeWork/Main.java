package Lesson_4.HomeWork;

//аннотация логгера, просто для теста
//@Slf4j
public class Main {
    public static void main(String[] args) {
//        MyOneSidedLinkedList<String> myOneSidedLinkedList = new MyOneSidedLinkedList<>();
//        myOneSidedLinkedList.add("First");
//        myOneSidedLinkedList.add("Second");
//        System.out.println(myOneSidedLinkedList.getFirstElement());
//        System.out.println(myOneSidedLinkedList.toString());
//        try {
//            myOneSidedLinkedList.remove();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(myOneSidedLinkedList.toString());
//        myOneSidedLinkedList.add(1, "new Second");
//        System.out.println(myOneSidedLinkedList.toString());
//        myOneSidedLinkedList.add(0, "new First");
//        System.out.println(myOneSidedLinkedList.toString());
//        try {
//            myOneSidedLinkedList.remove("Second");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(myOneSidedLinkedList.contains("new First"));
//        System.out.println(myOneSidedLinkedList.toString());
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("First");
        myLinkedList.addLast("Second");
        myLinkedList.addLast("Third");
//        myLinkedList.removeFirst();
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        System.out.println(myLinkedList.toString());
//        myLinkedList.removeLast();
        myLinkedList.add(2, "new Second");
        myLinkedList.remove("Second");
        System.out.println(myLinkedList.toString());
    }

}
