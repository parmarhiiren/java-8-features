package com.example.programs;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 */
public class ValidParenthesis {

    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String inputStr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(getEquivalentClosingBracket(ch));
                System.out.println(stack);
            } else if (stack.isEmpty() || stack.pop() != ch) {
                System.out.println("here");
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static char getEquivalentClosingBracket(char ch) {
        if (ch == '(') {
            return ')';
        }
        if (ch == '[') {
            return ']';
        }
        return '}';
    }
}
