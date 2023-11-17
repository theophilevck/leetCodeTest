package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueLengthThreePalindromicSubsequences {

    //1930. Unique Length-3 Palindromic Subsequences
    //Medium
    //Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
    //
    //Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
    //
    //A palindrome is a string that reads the same forwards and backwards.
    //
    //A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
    //
    //    For example, "ace" is a subsequence of "abcde".

    //Related Topics
    //String
    //Hash Table
    //Prefix Sum


    public int countPalindromicSubsequence(String s) {

        int length = s.length();

        if (length < 3) return 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            set.add(s.charAt(i));
        }

        int result = 0;

        for (Character c : set) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first != last) {
                Set<Character> set2 = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    set2.add(s.charAt(i));
                }
                result += set2.size();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UniqueLengthThreePalindromicSubsequences uniqueLengthThreePalindromicSubsequences = new UniqueLengthThreePalindromicSubsequences();
        int result = uniqueLengthThreePalindromicSubsequences.countPalindromicSubsequence("aabca");
        System.out.println(result);
    }

}
