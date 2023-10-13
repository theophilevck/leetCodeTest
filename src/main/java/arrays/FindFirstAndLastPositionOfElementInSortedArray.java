package arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    //34. Find First and Last Position of Element in Sorted Array
    //Medium
    //Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    //
    //If target is not found in the array, return [-1, -1].

    //Related Topics
    //Array
    //Binary Search

    public static void main(String[] args) {
        int[] input = {5, 7, 7, 8, 8, 10};
        System.out.println(searchRange(input, 8));
    }


    //two pointer
    public static int[] searchRange1(int[] nums, int target) {

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


    //BinartSearsh
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int first = -1;
        int  last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                last = mid;
                while (first > 0 && nums[first - 1] == target) {
                    first--;
                }
                while (last < nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
