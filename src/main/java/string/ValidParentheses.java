package string;

import java.util.ArrayList;
import java.util.List;


public class ValidParentheses {




//    20. Valid Parentheses
//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//  Every close bracket has a corresponding open bracket of the same type.


    public static boolean isValid(String s) {
        final List<Character> openingChars = List.of('(', '[', '{');
        final List<Character> closingChars = List.of(')', ']', '}');
        final List<Character> pile = new ArrayList<>(s.length() / 2);

        for (char c : s.toCharArray()) {
            final int openingIndex = openingChars.indexOf(c);
            final int closingIndex = closingChars.indexOf(c);

            if (openingIndex == -1 && closingIndex == -1) {
                return false;
            }
            if (openingIndex != -1) {
                pile.add(c);
            }
            if (closingIndex != -1) {
                if (pile.isEmpty()) {
                    return false;
                }
                final char openingChar = pile.remove(pile.size() - 1);
                final int openingCharIndex = openingChars.indexOf(openingChar);

                if (openingCharIndex != closingIndex) {
                    return false;
                }
            }
        }

        return pile.isEmpty();
    }

    public static void main(String[] args) {
        String input = "()[]{}";

        System.out.println(isValid(input));
    }
}
