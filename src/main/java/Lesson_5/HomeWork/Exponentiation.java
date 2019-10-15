package Lesson_5.HomeWork;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(exponentiation(3,3));
    }

    private static int exponentiation(int digit, int exponent) {
        if (exponent == 0) return 1;
        return digit * exponentiation(digit, exponent-1);
    }
}

