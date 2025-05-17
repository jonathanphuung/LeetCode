

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets
            } else {
                if (stack.isEmpty()) return false; // No matching opening bracket
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched bracket
                }
            }
        }
        
        return stack.isEmpty(); // If stack is empty, it's valid
    }
}