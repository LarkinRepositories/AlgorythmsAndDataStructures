package Lesson_3.HomeWork;
import java.io.IOException;
// Создать программу, которая переворачивает вводимые строки (читает справа налево).
public class ExpressionWorkerMain {
    public static void main(String[] args) {
        try {
            ExpressionWorker.getInstance().reverseExpressionReadFromConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
