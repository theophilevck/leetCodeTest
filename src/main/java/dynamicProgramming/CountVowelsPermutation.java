package dynamicProgramming;

public class CountVowelsPermutation {

    //1220. Count Vowels Permutation
    //Hard
    //Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
    //
    //    Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
    //    Each vowel 'a' may only be followed by an 'e'.
    //    Each vowel 'e' may only be followed by an 'a' or an 'i'.
    //    Each vowel 'i' may not be followed by another 'i'.
    //    Each vowel 'o' may only be followed by an 'i' or a 'u'.
    //    Each vowel 'u' may only be followed by an 'a'.
    //
    //Since the answer may be too large, return it modulo 10^9 + 7.

    //Related Topics
    //Dynamic Programming

    public int countVowelPermutation(int n) {

        int mod = 1000000007;
        long[][] dp = new long[n + 1][5]; //dp[i][j] = number of strings of length i ending with vowel j


        for (int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][1]) % mod; //a can only be followed by e
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod; //e can be followed by a or i
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][3] + dp[i - 1][4]) % mod; //i can be followed by a ,e , o and u
            dp[i][3] = (dp[i - 1][2] + dp[i - 1][4]) % mod; //o can be followed by i and u
            dp[i][4] = (dp[i - 1][0]) % mod; //u can only be followed by a
        }

        return (int) ((dp[n][0] + dp[n][1] + dp[n][2] + dp[n][3] + dp[n][4]) % mod);

    }

}
