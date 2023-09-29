package arrays;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

    //4. Median of Two Sorted Arrays
    //Hard
    //Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    //
    //The overall run time complexity should be O(log (m+n)).


    //Related Topics
    //Array
    //Binary Search
    //Divide and Conquer

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> nums = new ArrayList<>(nums2.length + nums1.length);

        if (nums1.length >= nums2.length) {
            nums = mergeArray(nums1, nums2);
        } else {
            nums = mergeArray(nums2, nums1);
        }

        final int mid = nums.size() / 2;
        if (nums.size() == 1) {
            return nums.get(0);
        }
        if (nums.size() % 2 == 0) {
            return (float) (nums.get(mid - 1) + nums.get(mid)) / 2;
        } else {
            return nums.get(mid);
        }
    }

    public static ArrayList<Integer> mergeArray(int[] nums1, int[] nums2) {
        int j = nums1.length - 1;
        int i = nums2.length - 1;
        ArrayList<Integer> nums = new ArrayList<>(nums2.length + nums1.length);
        while (j >= 0) {
            if (i >= 0 && nums2[i] > nums1[j]) {
                nums.add(nums2[i--]);
            } else {
                nums.add(nums1[j--]);
            }
        }
        while (i >= 0) {
            nums.add(nums2[i--]);
        }
        return nums;
    }

}
