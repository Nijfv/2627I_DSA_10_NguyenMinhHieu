import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        if (s == null || s.isEmpty()) {
            return "YES";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char opening = stack.pop();

                boolean isMatch = (c == ')' && opening == '(')
                               || (c == ']' && opening == '[')
                               || (c == '}' && opening == '{');

                if (!isMatch) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}