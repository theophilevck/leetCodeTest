package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class NumberOfGoodPairs {

    //Given an array of integers nums, return the number of good pairs.
    //
    //A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                count += numCount.get(num);
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        return count;
    }
}
