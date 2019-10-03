package Lesson_3.WebinarCodeSamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>(4);
        myStack.push(10);
        myStack.push(15);
        System.out.println(myStack.toString());
        System.out.println(myStack.pop(10));
        System.out.println(myStack.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringBuffer s = new StringBuffer(reader.readLine());
            System.out.println(s.reverse());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
