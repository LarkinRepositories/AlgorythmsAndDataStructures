package Lesson_3.HomeWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//thread-safe singleton pattern

public class ExpressionWorker {
    //thread-safe singleton pattern
    private static volatile ExpressionWorker instance;

    private ExpressionWorker() {}

    public static ExpressionWorker getInstance() {
        ExpressionWorker localinstance = instance;
        if (localinstance == null) {
            synchronized (ExpressionWorker.class) {
                localinstance = instance;
                if (localinstance == null) {
                    instance = localinstance = new ExpressionWorker();
                }
            }
        }
        return localinstance;
    }

    public boolean checkBrackets(String expression) {
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('[', ']');
        bracketMap.put('(', ')');
        bracketMap.put('{', '}');
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (bracketMap.containsKey(expression.charAt(i))) {
                stack.push(expression.charAt(i));
            }
            else if (bracketMap.containsValue(expression.charAt(i))) {
                if (!stack.isEmpty() && bracketMap.get(stack.peek()) == expression.charAt(i)) {
                    stack.pop();
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public String reverseExpression(String expression) {
        return String.valueOf(new StringBuffer(expression).reverse());
    }

    public void reverseExpressionReadFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expressionRead = reader.readLine();
        while(true) {
            System.out.println(reverseExpression(expressionRead));
            expressionRead = reader.readLine();
            if (expressionRead.equalsIgnoreCase("end")) {
                System.out.println(reverseExpression(expressionRead));
                break;
            }
        }
    }
}
