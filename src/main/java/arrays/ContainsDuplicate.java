package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //    217. Contains Duplicate
    //    Easy
    //    Given an integer array nums, return true if any value appears at least twice in the array,
    //    and return false if every element is distinct.


    //Related Topics
    //Array
    //Hash Table
    //Sorting
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (!s.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1};
        System.out.println(containsDuplicate(input));
    }
}
