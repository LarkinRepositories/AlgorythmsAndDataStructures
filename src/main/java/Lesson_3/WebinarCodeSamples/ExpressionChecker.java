package Lesson_3.WebinarCodeSamples;
import java.util.HashMap;


public class ExpressionChecker {

    public static boolean checkBrackets(String expression) {
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
}
