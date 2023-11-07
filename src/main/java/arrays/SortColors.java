package arrays;

public class SortColors {

    //75. Sort Colors
    //Medium

    //Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
    //
    //We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    //
    //You must solve this problem without using the library's sort function.

    //Related Topics
    //Array
    //Two Pointers
    //Sorting


    public void sortColors(int[] nums) {

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                swap(nums, left, right);
                left++;
            }
        }
        for (int right = left; right < nums.length; right++) {
            if (nums[right] == 1) {
                swap(nums, left, right);
                left++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
