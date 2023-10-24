package arrays;

public class MaximumScoreOfAGoodSubarray {
    //1793. Maximum Score of a Good Subarray
    //Hard
    //You are given an array of integers nums (0-indexed) and an integer k.
    //
    //The score of a subarray (i, j) is defined as min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1). A good subarray is a subarray where i <= k <= j.
    //
    //Return the maximum possible score of a good subarray.

    //Related Topics
    //Array
    //Two Pointers
    //Binary Search
    //Stack
    //Monotonic Stack


    public int maximumScore(int[] nums, int k) {

        int n = nums.length;
        int right = k;
        int left = k;
        int maxScore = 0;
        int min = nums[k];

    while (left >= 0 && right < n) {
        min = Math.min(min, Math.min(nums[left], nums[right]));
        maxScore = Math.max(maxScore, min * (right - left + 1));

        if (left == 0) {
            right++;
        } else if (right == n - 1) {
            left--;
        } else if (nums[left - 1] > nums[right + 1]) {
            left--;
        } else {
            right++;
        }
    }
        return maxScore;
    }

}
