package dynamicProgramming;

public class LongestPalindromicSubstring {

    //5. Longest Palindromic Substring
    //Medium
    //Given a string s, return the longest palindromic substring in s.

    //Related Topics
    //String
    //Dynamic Programming


    //Two pointers
    public String longestPalindrome1(String s) {

        if (s == null || s.isEmpty()) return "";

        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String sub = s.substring(j, j + i);
                if (test(sub)) {
                    return sub;
                }
            }
        }


        return "";
    }

    public boolean test(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (right > left) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }


    //Dynamic programming

    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] ans = new int[]{0, 0};

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                ans[0] = i;
                ans[1] = i + 1;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 2; j < n; j++) {
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (j - i > ans[1] - ans[0]) {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
        }
        int i = ans[0];
        int j = ans[1];
        return s.substring(i, j + 1);
    }


}
