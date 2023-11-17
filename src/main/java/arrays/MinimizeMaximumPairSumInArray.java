package arrays;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {

    //1877. Minimize Maximum Pair Sum in Array
    //Medium
    //The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.
    //
    //    For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
    //
    //Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:
    //
    //    Each element of nums is in exactly one pair, and
    //    The maximum pair sum is minimized.
    //
    //Return the minimized maximum pair sum after optimally pairing up the elements.

    //Related Topics
    //Array
    //Two Pointers
    //Greedy
    //Sorting

    public int minPairSum(int[] nums) {


        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            max = Math.max(max, nums[left] + nums[right]);
            left++;
            right--;
        }


        return max;


    }


}
