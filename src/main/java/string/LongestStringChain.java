package string;

import java.util.Arrays;
import java.util.HashMap;

public class LongestStringChain {

    //1048. Longest String Chain

    //Medium
    //You are given an array of words where each word consists of lowercase English letters.
    //
    //wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA
    // without changing the order of the other characters to make it equal to wordB.
    //
    //For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
    //
    //A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2,
    // word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
    //
    //Return the length of the longest possible word chain with words chosen from the given list of words.

    //Related Topics
    //Array
    //Hash Table
    //Two Pointers
    //String
    //Dynamic Programming

    public int longestStrChain(String[] arr) {
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        HashMap<String, Integer> hp = new HashMap<>();

        int ans = 0;

        for (String s : arr) {
            hp.put(s, 1);
            for (int i = 0; i < s.length(); i++) {
                String str = s.substring(0, i) + s.substring(i + 1);// with sub string we remove the curent element to form a string without i and try to figure it out if this substring is already in the map, with the increment call

                if (hp.containsKey(str)) {
                    hp.put(s, Math.max(hp.get(s), hp.get(str) + 1));
                }
            }
            ans = Math.max(ans, hp.get(s));
        }
        return ans;
    }


    //Two pointer todo
}
