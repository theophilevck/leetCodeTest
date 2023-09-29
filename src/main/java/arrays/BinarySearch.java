package arrays;

public class BinarySearch {

    //704. Binary Search
    //Easy
    //Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    //
    //You must write an algorithm with O(log n) runtime complexity.

    //Related Topics
    //Array
    //Binary Search

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            if (nums[right] == target) {
                return right;
            }

            if (nums[left] == target) {
                return left;
            }
            right--;
            left++;
        }

        return -1;
    }

}
