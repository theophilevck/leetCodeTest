package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


    //3. Longest Substring Without Repeating Characters
    //Medium
    //Given a string s, find the length of the longest
    //substring
    //without repeating characters.

    //Related Topics
    //Hash Table
    //String
    //Sliding Window


    //First
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 1;
        if (s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            String substring = String.valueOf(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                System.out.println(s.charAt(j));
                if (!substring.contains(String.valueOf(s.charAt(j)))) {
                    substring = substring + s.charAt(j);
                    maxLen = Math.max(maxLen, substring.length());
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    //Second
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";

        System.out.println(lengthOfLongestSubstring2(input));
    }
}
