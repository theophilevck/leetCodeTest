package dynamicProgramming;

public class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {


    //1420. Build Array Where You Can Find The Maximum Exactly K Comparisons
    //Hard
    //You are given three integers n, m and k. Consider the following algorithm to find the maximum element of an array of positive integers:
    //
    //You should build the array arr which has the following properties:
    //
    //    arr has exactly n integers.
    //    1 <= arr[i] <= m where (0 <= i < n).
    //    After applying the mentioned algorithm to arr, the value search_cost is equal to k.
    //
    //Return the number of ways to build the array arr under the mentioned conditions. As the answer may grow large, the answer must be computed modulo 109 + 7.

    //Related Topics
    //Dynamic Programming
    //Prefix Sum


    public int numOfArrays(int n, int m, int k) {
        final int mod = 1000000007; //10^9 + 7

        int[][] dp = new int[m + 1][k + 1]; //dp[i][j] = number of ways to build an array of length i with max value j and k comparisons
        int[][] prefix = new int[m + 1][k + 1];//prefix[i][j] = sum of dp[i][0] + dp[i][1] + ... + dp[i][j]
        int[][] prevDp = new int[m + 1][k + 1];//prevDp[i][j] = dp[i-1][0] + dp[i-1][1] + ... + dp[i-1][j]
        int[][] prevPrefix = new int[m + 1][k + 1];//prevPrefix[i][j] = sum of prevDp[i][0] + prevDp[i][1] + ... + prevDp[i][j]

        //base case

        for (int j = 1; j <= m; j++) {
            prevDp[j][1] = 1;
            prevPrefix[j][1] = j;
        }

        for (int i = 2; i <= n; i++) {
            for (int maxNum = 1; maxNum <= m; maxNum++) {
                for (int cost = 1; cost <= k; cost++) {
                    dp[maxNum][cost] = (int) (((long) maxNum * prevDp[maxNum][cost]) % mod);

                    if (maxNum > 1 && cost > 1) {
                        dp[maxNum][cost] = (dp[maxNum][cost] + prevPrefix[maxNum - 1][cost - 1]) % mod;
                    }

                    prefix[maxNum][cost] = (prefix[maxNum - 1][cost] + dp[maxNum][cost]) % mod;
                }
            }


            for (int j = 1; j <= m; j++) {
                System.arraycopy(dp[j], 0, prevDp[j], 0, k + 1);
                System.arraycopy(prefix[j], 0, prevPrefix[j], 0, k + 1);
            }
        }

        return prefix[m][k];

    }

}
