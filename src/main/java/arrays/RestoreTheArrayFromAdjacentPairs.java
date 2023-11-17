package arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class RestoreTheArrayFromAdjacentPairs {


    //1743. Restore the Array From Adjacent Pairs
    //Medium

    //There is an integer array nums that consists of n unique elements, but you have forgotten it. However, you do remember every pair of adjacent elements in nums.
    //
    //You are given a 2D integer array adjacentPairs of size n - 1 where each adjacentPairs[i] = [ui, vi] indicates that the elements ui and vi are adjacent in nums.
    //
    //It is guaranteed that every adjacent pair of elements nums[i] and nums[i+1] will exist in adjacentPairs, either as [nums[i], nums[i+1]] or [nums[i+1], nums[i]]. The pairs can appear in any order.
    //
    //Return the original array nums. If there are multiple solutions, return any of them.


    public int[] restoreArray(int[][] adjacentPairs) {

            int[] result = new int[adjacentPairs.length + 1];

            SortedSet<Integer> set = new TreeSet<>();

            for (int[] adjacentPair : adjacentPairs) {
                for (int j = 0; j < adjacentPair.length; j++) {
                    set.add(adjacentPair[j]);
                }
            }

            int[] firstPair = adjacentPairs[0];
            int[] lastPair = adjacentPairs[adjacentPairs.length - 1];

            int first = firstPair[0];
            int last = lastPair[1];

            result[0] = first;
            result[result.length - 1] = last;

            for (int i = 1; i < result.length - 1; i++) {
                for (int[] adjacentPair : adjacentPairs) {
                    if (adjacentPair[0] == first) {
                        result[i] = adjacentPair[1];
                        first = adjacentPair[1];
                        break;
                    }
                    if (adjacentPair[1] == last) {
                        result[i] = adjacentPair[0];
                        last = adjacentPair[0];
                        break;
                    }
                }
            }

            return result;
    }

    public static void main(String[] args) {
        RestoreTheArrayFromAdjacentPairs restoreTheArrayFromAdjacentPairs = new RestoreTheArrayFromAdjacentPairs();
        int[][] adjacentPairs = {{2, 1}, {3, 4}, {3, 2}};
        int[] result = restoreTheArrayFromAdjacentPairs.restoreArray(adjacentPairs);
        System.out.println(result);
    }
}
