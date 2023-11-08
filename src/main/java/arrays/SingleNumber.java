package arrays;

import java.util.HashMap;

public class SingleNumber {

    //136. Single Number
    //Easy
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //
    //You must implement a solution with a linear runtime complexity and use only constant extra space.

    //Related Topics
    //Array
    //Bit Manipulation

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (map.get(nums[left]) == 1) {
                return nums[left];
            }
            if (map.get(nums[right]) == 1) {
                return nums[right];
            }
            left++;
            right--;
        }

        return -1;
    }
}
