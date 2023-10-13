package arrays;

public class FindInMountainArray {

    //1095. Find in Mountain Array
    //Hard
    //(This problem is an interactive problem.)
    //
    //You may recall that an array arr is a mountain array if and only if:
    //
    //    arr.length >= 3
    //    There exists some i with 0 < i < arr.length - 1 such that:
    //        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    //        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    //
    //Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
    //
    //You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
    //
    //    MountainArray.get(k) returns the element of the array at index k (0-indexed).
    //    MountainArray.length() returns the length of the array.
    //
    //Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.


    //Related Topics
    //Array
    //Binary Search
    //Interactive


    // This is MountainArray's API interface.
    // You should not implement it, or speculate about its implementation
    interface MountainArray {
        public int get(int index);

        public int length();
    }


    public static int findInMountainArray(int target, MountainArray mountainArr) {


        int length = mountainArr.length();


        int max = findPeak(mountainArr, length);

        //search begin to middle
        int index = findTarget(mountainArr, 0, max - 1, target, true);

        if (index != -1) {
            return index;
        }
        return findTarget(mountainArr, max, length - 1, target, false);
    }

    private static int findPeak(MountainArray mountainArr, int length) {
        int left = 0;
        int right = length - 1;
        //find middle
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int findTarget(MountainArray mountainArr, int left, int right, int target, boolean up) {


        if (up) {
            while (left <= right) {
                int mid = (right + left) / 2;
                int midVal = mountainArr.get(mid);

                if (midVal == target) {
                    return mid;
                } else if (midVal < target) {

                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }
        } else {
            while (left <= right) {
                int mid = (right + left) / 2;
                int midVal = mountainArr.get(mid);

                if (midVal == target) {
                    return mid;
                } else if (midVal > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


}
