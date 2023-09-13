package arrays;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

//    121. Best Time to Buy and Sell Stock
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {

            int BuyPrice = prices[i];
            if (BuyPrice < minPrice) {
                minPrice = BuyPrice;
            } else if (BuyPrice - minPrice > maxProfit) {
                maxProfit = BuyPrice - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] input = {3,3};
        System.out.println(maxProfit(input));
    }


}
