package dynamicProgramming;

public class MaxDotProductOfTwoSubsequences {
    // 1458.Max Dot Product of Two Subsequences
    //hard

    //Related Topics
    //Dynamic Programming

    public static int maxDotProductOfTwoSubsequences(int[] nums1, int[] nums2) {
        final int n = nums1.length;
        final int m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = Integer.MIN_VALUE;
                } else {
                    dp[i][j] = Math.max(
                            nums1[i - 1] * nums2[j - 1] + Math.max(dp[i - 1][j - 1], 0),
                            Math.max(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }


        return dp[n][m];
    }


    public static void main(String[] args) {
        int[] input1 = {2, 1, -2, 5};
        int[] input2 = {3, 0, -6};
        int[] input3 = {3, -2};
        int[] input4 = {2, -6, 7};
        int target = 9;
        System.out.println(maxDotProductOfTwoSubsequences(input1, input2));
    }


}
