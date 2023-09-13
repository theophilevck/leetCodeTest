package arrays;

import java.util.HashMap;

public class KthLargestElementInAnArray {


    //215. Kth Largest Element in an Array

    //Given an integer array nums and an integer k, return the kth largest element in the array.
    //
    //Note that it is the kth largest element in the sorted order, not the kth distinct element.
    //
    //Can you solve it without sorting?

    public static int findKthLargest(int[] nums, int k) {


        if (nums.length == 1) {
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i > 0; i--) {
            map.put(nums[i], i);
        }

        return nums.length - map.get(k);

    }

    public static void main(String[] args) {
        int[] input = {3,2,1,5,6,4};
        int k =4;
        System.out.println(findKthLargest(input,k));
    }

}
