/*
 * Write a Program in Java
Given an array a, your task is to apply the following mutation to it
Array a mutates into a new array b of the same length
For each I from 0 to a.length -1 inclusive b[i] = a[i-1] + a[i] + a[i+1]
If some element in the sum a[i-1] + a[i] + a[i+1] doesn't exist it is considered to be 0

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
 */
public class pay2dconlineassesment2 {
	
	public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = findMaxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int findMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price seen so far
            minPrice = Math.min(minPrice, price);
            // Update the maximum profit if selling at the current price would yield a higher profit
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

}
