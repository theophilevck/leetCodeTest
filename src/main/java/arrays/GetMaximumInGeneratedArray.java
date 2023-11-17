package arrays;

public class GetMaximumInGeneratedArray {


    //1646. Get Maximum in Generated Array
    //Easy
    //You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
    //
    //    nums[0] = 0
    //    nums[1] = 1
    //    nums[2 * i] = nums[i] when 2 <= 2 * i <= n
    //    nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    //
    //Return the maximum integer in the array nums.

    //Related Topics
    //Array
    //Dynamic Programming
    //Simulation

    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int max = 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2];
            } else {
                dp[i] = dp[i / 2] + dp[i / 2 + 1];
                max = Math.max(dp[i], max);
            }
        }
        return max;
    }


}
