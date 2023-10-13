package arrays;

import java.util.*;

public class MajorityElementTwo {

    //229. Majority Element II

    //Medium
    //Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

    //Related Topics
    //Array
    //Hash Table
    //Sorting
    //Counting

    public List<Integer> majorityElement(int[] nums) {
        int check = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > check) {
                result.add(entry.getKey());
            }
        }
        return result;

    }
}
