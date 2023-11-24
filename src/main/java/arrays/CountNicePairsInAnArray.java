package arrays;

public class CountNicePairsInAnArray {

    //1814. Count Nice Pairs in an Array
    //Medium
    //You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
    //
    //    0 <= i < j < nums.length
    //    nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
    //
    //Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.

    //Related Topics
    //Array
    //Hash Table
    //Math
    //Counting

    int reverse(int num) {
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {

            int[] rev = new int[nums.length];
            int count = 0;
            int mod = 1000000007;

            for (int i = 0; i < nums.length; i++) {
                rev[i] = reverse(nums[i]);
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < rev.length; j++) {
                    if (nums[i] + rev[j] == nums[j] + rev[i]) {
                        count++;
                    }
                }
            }

            return count % mod;

    }

}
