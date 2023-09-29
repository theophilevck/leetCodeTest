package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //1. Two Sum
    //Easy


    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // You can return the answer in any order.


    //Related Topics
    //Array
    //Hash Table

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int test = target - nums[i];
            if (map.containsKey(test) && map.get(test) != i) {
                return new int[]{i, map.get(test)};
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
