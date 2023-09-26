package string;

public class IsSubsequence {

    //392. Is Subsequence
    //Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    //
    //A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
    // of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    public boolean isSubsequence(String s, String t) {

        int j = 0;
        if (s.isEmpty()) return true;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }

}
