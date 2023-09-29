package arrays;

public class MonotonicArray {


    //896. Monotonic Array
    //Easy
    //An array is monotonic if it is either monotone increasing or monotone decreasing.
    //
    //An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
    //
    //Given an integer array nums, return true if the given array is monotonic, or false otherwise.

    //Related Topics
    //Array


    //two pointer
    public static boolean isMonotonic(int[] nums) {

        if (nums.length < 2) {
            return true;
        }
        int left = 0;
        int right = nums.length - 1;
        int increase = 0;


        while (left < right) {
            if (nums[left] > nums[left + 1]) {
                if (increase == 0) increase = -1;
                else if (increase == 1) return false;
            }

            if (nums[left] < nums[left + 1]) {
                if (increase == 0) increase = 1;
                else if (increase == -1) return false;
            }

            if (nums[right] < nums[right - 1]) {
                if (increase == 0) increase = -1;
                if (increase == 1) return false;
            }

            if (nums[right] > nums[right - 1]) {
                if (increase == 0) increase = 1;
                if (increase == -1) return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isMonotonic1(int[] nums) {

        if (nums.length < 2) {
            return true;
        }
        int increase = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (increase == 0) increase = -1;
                else if (increase == 1) return false;
            }

            if (nums[i] < nums[i + 1]) {
                if (increase == 0) increase = 1;
                else if (increase == -1) return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] input = {2, 2, 2, 1, 4, 5};
        int[] input1 = {1, 2, 2, 3};
        System.out.println(isMonotonic(input));
    }


}
