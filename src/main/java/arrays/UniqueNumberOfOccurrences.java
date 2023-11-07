package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    //1207. Unique Number of Occurrences
    //Easy
    //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

    //Related Topics
    //Array
    //Hash Table

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (Integer num : map.values()) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }

        return true;
    }
}
