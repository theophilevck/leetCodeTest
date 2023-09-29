package arrays;

public class SortArrayByParity {

    //905. Sort Array By Parity
    //Easy

    //Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    //
    //Return any array that satisfies this condition.

    //Related Topics:
    //Array
    //Two Pointers
    //Sorting
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 == 0) {
                left++;
            }
            if (nums[right] % 2 != 0) {
                right--;
            }
            if (right > left && nums[right] % 2 == 0 && nums[left] % 2 != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                left++;
            }

        }
        return nums;

    }
}
