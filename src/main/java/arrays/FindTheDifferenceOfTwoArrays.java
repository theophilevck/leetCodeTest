package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {

    //2215. Find the Difference of Two Arrays
    //Easy
    //Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
    //
    //    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    //    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
    //
    //Note that the integers in the lists may be returned in any order.

    //Related Topics
    //Array
    //Hash Table

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (Integer num : nums1) {
            set1.add(num);
        }

        for (Integer num : nums2) {
            set2.add(num);
        }

        for (Integer num : set1) {
            if (set2.contains(num)) {
                set2.remove(num);
            } else {
                list1.add(num);
            }
        }

        for (Integer num : set2) {
            if (set1.contains(num)) {
                set1.remove(num);
            } else {
                list2.add(num);
            }
        }

        result.add(list1);
        result.add(list2);

        return result;
    }
}
