package leetcode;

import java.util.Stack;

public class Problem20 {
    public static void main(String[] args) {
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([])";
        String str5 = "({[({[({[({[()]})]})]})]})]";

        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
        System.out.println(isValid(str5));
    }

    public static boolean isValid(String s) {
        if (s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        char currentCharacter, lastElement;
        for (int i = 0; i < s.length(); i++) {
            currentCharacter = s.charAt(i);
            if (currentCharacter == '{' || currentCharacter == '[' || currentCharacter == '(') {
                stack.push(currentCharacter);
            } else {
                if (stack.isEmpty()) return false;
                lastElement = stack.lastElement();
                if ((currentCharacter == '}' && lastElement != '{') || (currentCharacter == ']' && lastElement != '[') || (currentCharacter == ')' && lastElement != '('))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

// '(', ')', '{', '}', '[' and ']'
