package Lesson_3.HomeWork;

public class Main {

    public static void main(String[] args) {
//        MyStack<Integer> myStack = new MyStack<>(4);
//        myStack.push(10);
//        myStack.push(15);
//        System.out.println(myStack.toString());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.toString());
//        MyQueue<Integer> myQueue = new MyQueue<>();
//        myQueue.insert(1);
//        myQueue.insert(2);
//        System.out.println(myQueue);
//        System.out.println(myQueue.remove());
//        System.out.println(myQueue);
//        MyDeque<Integer> myDeque = new MyDeque<>(15);
//        myDeque.insertFront(5);
//        myDeque.insertFront(19);
//        myDeque.insertFront(1);
//        System.out.println(myDeque.peekFront());
//        System.out.println(myDeque.peekLast());
//        System.out.println(myDeque.isFull());
//        System.out.println(myDeque);



        //скобочная последовательность
        System.out.println(ExpressionWorker.getInstance().checkBrackets("{}{P{P{}}}}[[[]"));
    }
}
