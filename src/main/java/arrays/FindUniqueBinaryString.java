package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {

    //1980. Find Unique Binary String
    //Medium
    //Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.

    //Related Topics
    //Array
    //String
    //Backtracking

    public String findDifferentBinaryString(String[] nums) {

        if (nums.length == 0) return "";
        int result = 0;
        Set<Integer> set = new HashSet();

        for (String num : nums) {
            set.add(Integer.parseInt(num, 2));
        }

        while (set.contains(result)) {
            result++;
        }
        String binary = Integer.toBinaryString(result);

        while (binary.length() < nums.length) {
            binary = "0" + binary;
        }

        return binary;

    }
}
