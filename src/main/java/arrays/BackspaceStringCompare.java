package arrays;

import java.util.Stack;

public class BackspaceStringCompare {

    //844. Backspace String Compare
    //Easy
    //Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
    //
    //Note that after backspacing an empty text, the text will continue empty.

    //Related Topics
    //Two Pointers
    //String
    //Stack
    //Simulation


    public boolean backspaceCompare(String s, String t) {

        int n = s.length();
        int m = t.length();

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for (int i = 0; i < m; i++) {
            char c = t.charAt(i);
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }

        if (stack1.size() != stack2.size()) {
            return false;
        } else {
            for (int i = 0; i < stack1.size(); i++) {
                if (stack1.get(i) != stack2.get(i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
