package arrays;

import java.util.*;

public class SortIntegersByTheNumberOfOneBits {

    //1356. Sort Integers by The Number of 1 Bits
    //Easy

    //You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
    //
    //Return the array after sorting it.

    //Related Topics
    //Array
    //Bit Manipulation
    //Sorting
    //Counting

    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> D = new HashMap<>();

        for (int i : arr) {
            int count = Integer.bitCount(i);
            D.putIfAbsent(count, new ArrayList<>());
            D.get(count).add(i);
        }

        List<Integer> result = new ArrayList<>();
        List<Integer> sortedKeys = new ArrayList<>(D.keySet());
        Collections.sort(sortedKeys);

        for (int k : sortedKeys) {
            List<Integer> sortedValues = D.get(k);
            Collections.sort(sortedValues);
            result.addAll(sortedValues);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
