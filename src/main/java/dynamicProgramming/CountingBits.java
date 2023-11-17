package dynamicProgramming;

public class CountingBits {

    //338. Counting Bits
    //Easy
    //Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

    //Related Topics
    //Dynamic Programming
    //Bit Manipulation

    public int[] countBits(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 0;


        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1); //i >> 1 is i/2, i & 1 is i%2
        }
        return dp;
    }

    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int[] result = countingBits.countBits(20);
        System.out.println(result);
    }


}
