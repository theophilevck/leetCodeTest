package arrays;

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearranging {

    //1846. Maximum Element After Decreasing and Rearranging
    //Medium
    //You are given an array of positive integers arr. Perform some operations (possibly none) on arr so that it satisfies these conditions:
    //
    //    The value of the first element in arr must be 1.
    //    The absolute difference between any 2 adjacent elements must be less than or equal to 1. In other words, abs(arr[i] - arr[i - 1]) <= 1 for each i where 1 <= i < arr.length (0-indexed). abs(x) is the absolute value of x.
    //
    //There are 2 types of operations that you can perform any number of times:
    //
    //    Decrease the value of any element of arr to a smaller positive integer.
    //    Rearrange the elements of arr to be in any order.
    //
    //Return the maximum possible value of an element in arr after performing the operations to satisfy the conditions.

    //Related Topics
    //Array
    //Greedy
    //Sorting

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        Arrays.sort(arr);
        int ans = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= ans + 1) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumElementAfterDecreasingAndRearranging maximumElementAfterDecreasingAndRearranging = new MaximumElementAfterDecreasingAndRearranging();
        int result = maximumElementAfterDecreasingAndRearranging.maximumElementAfterDecrementingAndRearranging(new int[]{2, 1, 73, 123, 43, 16, 7});
        System.out.println(result);
    }

}
