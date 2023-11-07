package arrays;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    //1679. Max Number of K-Sum Pairs
    //Medium
    //You are given an integer array nums and an integer k.
    //
    //In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
    //
    //Return the maximum number of operations you can perform on the array.

    //Related Topics
    //Array
    //Hash Table
    //Two Pointers
    //Sorting

    public int maxOperations(int[] nums, int k) {

        int result = 0;
        int left = 0;
        int right = nums.length - 1;

        Arrays.sort(nums);

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == k) {
                result++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }

        }
        return result;
    }

}
