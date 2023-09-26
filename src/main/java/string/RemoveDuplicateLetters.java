package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicateLetters {

    //316. Remove Duplicate Letters
    //Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
    //the smallest in lexicographical order
    //among all possible results.

    public static String removeDuplicateLetters(String s) {

        HashMap<Character, Integer> lastIndex = new HashMap<>();
        HashSet<Character> set = new HashSet();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!lastIndex.containsKey(s.charAt(i))) {
                lastIndex.put(s.charAt(i), i);
            }
        }
        Stack<Integer> st = new Stack();
        for (int j = 0; j < s.length(); j++) {
            if (set.contains(s.charAt(j))) {
                continue;
            }
            while (!st.isEmpty() && st.peek() > s.charAt(j) && j < lastIndex.get((char) st.peek().intValue())) {
                set.remove((char) st.pop().intValue());
            }
            st.push((int) s.charAt(j));
            set.add(s.charAt(j));
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            char test = (char) st.pop().intValue();
            sb.append(test);
        }

        return sb.reverse().toString();
    }


}
