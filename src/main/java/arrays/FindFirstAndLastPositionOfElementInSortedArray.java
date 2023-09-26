package arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    //34. Find First and Last Position of Element in Sorted Array
    //Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    //
    //If target is not found in the array, return [-1, -1].

    public static void main(String[] args) {
        int[] input = {5, 7, 7, 8, 8, 10};
        System.out.println(searchRange(input, 8));
    }


    //two pointer
    public static int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                return new int[]{left, right};
            }
            if (nums[left] != target) {
                left++;
            }
            if (nums[right] != target) {
                right--;
            }

        }
        return new int[]{-1, -1};
    }
}
