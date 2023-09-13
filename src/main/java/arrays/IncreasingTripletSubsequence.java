package arrays;

public class IncreasingTripletSubsequence {

    //334. Increasing Triplet Subsequence

    //Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.


    public boolean increasingTriplet(int[] nums) {

        int min = Integer.MAX_VALUE;
        int middleValue = Integer.MAX_VALUE;


        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num < middleValue) {
                middleValue = num;
            } else if (num > middleValue) {
                return true;
            }
        }
        return false;
    }
}
