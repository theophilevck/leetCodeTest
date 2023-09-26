package arrays;

public class MinimumOperationsToReduceXtoZero {

    //1658. Minimum Operations to Reduce X to Zero
    //You are given an integer array nums and an integer x.
    // In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x.
    // Note that this modifies the array for future operations.
    //
    //Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.

    public static int minOperations(int[] nums, int x) {
        int current = 0;
        for (int num : nums) {
            current += num;
        }
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        for (; right < n; right++) {
            current -= nums[right];
            while (current < x && left <= right) {
                current += nums[left];
                left += 1;
            }
            if (current == x) {
                mini = Math.min(mini, (n - 1 - right) + left);
            }
        }
        return mini != Integer.MAX_VALUE ? mini : -1;
    }
}
