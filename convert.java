// Java program to convert infix to prefix
import java.util.*;
class convert {
    // Check if character is an operator
    static boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || 
                ch == '*' || ch == '/' || ch == '^');
    }
    // Get precedence of operators
    static int operatorPrecedence(char a) {
        if (a == '^') return 3;
        if (a == '*' || a == '/') return 2;
        if (a == '+' || a == '-') return 1;
        return -1;
    }
    // Convert infix expression to postfix notation
    static String convertInfixToPostfix(String s) {
        Stack<Character> b = new Stack<>();
        StringBuilder res = new StringBuilder();
        int c = s.length();
        for (int i = 0; i < c; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                res.append(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                b.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!b.isEmpty() && b.peek() != '(') {
                    res.append(b.pop());
                }
                b.pop();
            } else {
                while (!b.isEmpty() && operatorPrecedence(s.charAt(i)) <= 
                operatorPrecedence(b.peek())) {
                    res.append(b.pop());
                }
                b.push(s.charAt(i));
            }
        }
        while (!b.isEmpty()) {
            res.append(b.pop());
        }
        return res.toString();
    }
    // Convert infix expression to prefix notation
    static String convertToPrefix(String infix) {
        StringBuilder h = new StringBuilder(infix);
        h.reverse(); 
        infix = h.toString();

        char[] chars = infix.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
            } else if (chars[i] == ')') {
                chars[i] = '(';
            }
        }

        String postfix = convertInfixToPostfix(new String(chars));
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "(a-b/c)*(a/e-f)";
        System.out.println(convertToPrefix(s));
    }
}