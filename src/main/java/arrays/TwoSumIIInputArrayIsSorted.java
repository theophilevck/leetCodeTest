package arrays;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    //167. Two Sum II - Input Array Is Sorted

    //Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
    //
    //Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
    //
    //The tests are generated such that there is exactly one solution. You may not use the same element twice.
    //
    //Your solution must use only constant extra space.

    //Related Topics
    //Array
    //Two Pointers
    //Binary Search


    //binary Search
    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; ++i) {
            int left = i + 1;
            int right = numbers.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                }

                if (numbers[mid] > target - numbers[i]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }


    //two pointer
    public static int[] twoSum1(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int complement = numbers[left] + numbers[right];
            if (complement== target) {
                return new int[]{left + 1, right + 1};
            }

            if (complement < target) {
                left++;
            }

            if (complement > target) {
                right--;
            }

        }
        return new int[]{left + 1, right + 1};
    }


    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }

}
