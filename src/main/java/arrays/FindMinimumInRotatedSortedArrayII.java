package arrays;

public class FindMinimumInRotatedSortedArrayII {

    //154. Find Minimum in Rotated Sorted Array II
    //Hard
    //Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:
    //
    //    [4,5,6,7,0,1,4] if it was rotated 4 times.
    //    [0,1,4,4,5,6,7] if it was rotated 7 times.
    //
    //Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
    //
    //Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
    //
    //You must decrease the overall operation steps as much as possible.

    //Related Topics
    //Array
    //Binary Search


    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int right = nums.length - 1;
        int left = 0;
        while (right > left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right -= 1;
            }

        }
        return nums[left];
    }


}
