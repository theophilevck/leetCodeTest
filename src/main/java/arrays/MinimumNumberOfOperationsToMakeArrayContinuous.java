package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MinimumNumberOfOperationsToMakeArrayContinuous {

    //2009. Minimum Number of Operations to Make Array Continuous
    //Hard

    //You are given an integer array nums. In one operation, you can replace any element in nums with any integer.
    //
    //nums is considered continuous if both of the following conditions are fulfilled:
    //
    //    All elements in nums are unique.
    //    The difference between the maximum element and the minimum element in nums equals nums.length - 1.
    //
    //For example, nums = [4, 2, 5, 3] is continuous, but nums = [1, 2, 3, 5, 6] is not continuous.
    //
    //Return the minimum number of operations to make nums continuous.

    //Related Topics
    //Array
    //Binary Search


    //brute force TLE
    public int minOperations1(int[] nums) {

        int result = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> number = new HashSet<>();

        for (int num : nums) {
            number.add(num);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        for (int i = min; i < max; i++) {
            if (number.contains(i)) {
                int count = 0;
                for (int j = i; j < i + nums.length; j++) {
                    if (!number.contains(j)) {
                        count++;
                    }
                }
                if (result == -1 || count < result) {
                    result = count;
                }
            }
        }
        if (result == -1) return 0;
        return result;
    }


    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int uniqueLen = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueLen++] = nums[i];
            }
        }

        int ans = nums.length;
        for (int i = 0, j = 0; i < uniqueLen; ++i) {
            while (j < uniqueLen && nums[j] - nums[i] <= nums.length - 1) {
                ++j;
            }
            ans = Math.min(ans, nums.length - (j - i));
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] input = {8, 5, 9, 9, 8, 4};
        System.out.println(minOperations(input));
    }

}
