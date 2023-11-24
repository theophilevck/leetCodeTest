package arrays;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {

    //1561. Maximum Number of Coins You Can Get
    //Medium
    //There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
    //
    //    In each step, you will choose any 3 piles of coins (not necessarily consecutive).
    //    Of your choice, Alice will pick the pile with the maximum number of coins.
    //    You will pick the next pile with the maximum number of coins.
    //    Your friend Bob will pick the last pile.
    //    Repeat until there are no more piles of coins.
    //
    //Given an array of integers piles where piles[i] is the number of coins in the ith pile.
    //
    //Return the maximum number of coins that you can have.

    //Related Topics
    //Array
    //Math
    //Greedy
    //Sorting
    //Game Theory

    public int maxCoins(int[] piles) {

        int result = 0;
        int n = piles.length;
        int i = n / 3;
        Arrays.sort(piles);
        while (i < n) {
            result += piles[i];
            i += 2;
        }
        return result;
    }

}
