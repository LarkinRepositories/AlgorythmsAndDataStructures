package Lesson_3.WebinarCodeSamples;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>(4);
        myStack.push(10);
        myStack.push(15);
        System.out.println(myStack.toString());
        System.out.println(myStack.pop(10));
        System.out.println(myStack.toString());
    }
}
