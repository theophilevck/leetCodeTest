package arrays;

import java.util.Stack;

public class OneThreeTwoPattern {

    //456. 132 Pattern
    //Medium
    //Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
    //
    //Return true if there is a 132 pattern in nums, otherwise, return false.


    //Related Topics
    //Array
    //Binary Search
    //Stack
    //Monotonic Stack
    //Ordered Set


    //Monotonic Stack
    public static boolean find132pattern(int[] nums) {

        int len = nums.length;
        if (len < 3) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k > Integer.MIN_VALUE && k > nums[i]) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                k = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {-1, 3, 2, 0};
        int[] input1 = {1, 2, 2, 3};
        System.out.println(find132pattern(input));
    }


}
