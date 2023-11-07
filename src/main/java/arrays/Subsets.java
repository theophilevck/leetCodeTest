package arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    //78. Subsets
    //Medium
    //Given an integer array nums of unique elements, return all possible
    //subsets
    //(the power set).
    //
    //The solution set must not contain duplicate subsets. Return the solution in any order.

    //Related Topics
    //Array
    //Backtracking
    //Bit Manipulation


    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> list : result) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(num);
                tmp.add(newList);
            }
            result.addAll(tmp);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        subsets(nums);
    }

}
