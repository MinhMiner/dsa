public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                myStack.push(ch);;
            } else if (!myStack.isEmpty() &&
                       ((ch == '}' && myStack.peek() == '{') ||
                        (ch == ']' && myStack.peek() == '[') ||
                        (ch == ')' && myStack.peek() == '('))) 
            {
                myStack.pop();
            } else {
                return "NO";
            }
        }
    
        if (myStack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
