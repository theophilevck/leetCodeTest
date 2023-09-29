package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    //1431. Kids With the Greatest Number of Candies
    //Easy
    //There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
    //
    //Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
    //
    //Note that multiple kids can have the greatest number of candies.

    //Related Topics
    //Array


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int right = candies.length - 1;
        int left = 0;
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        while (left <= right) {
            max = Math.max(max, candies[left]);
            max = Math.max(max, candies[right]);
            left++;
            right--;
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
