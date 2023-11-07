package math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {

    //823. Binary Trees With Factors
    //Medium
    //Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.
    //
    //We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children.
    //
    //Return the number of binary trees we can make. The answer may be too large so return the answer modulo 109 + 7.

    //Related Topics
    //Array
    //Hash Table
    //Dynamic Programming
    //Sorting

    public int numFactoredBinaryTrees(int[] arr) {

        int mod = 1000000007;
        Arrays.sort(arr);
        Map<Integer, Long> dp = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            dp.put(arr[i], 1L);
            for (int j=0; j<i; j++) {
                if (arr[i] % arr[j] == 0) {
                    dp.put(arr[i], (dp.get(arr[i]) + dp.get(arr[j]) * dp.getOrDefault(arr[i] / arr[j], 0L)) % mod);
                }
            }
        }
        return (int) (dp.values().stream().reduce(0L, Long::sum) % mod);
    }

}
