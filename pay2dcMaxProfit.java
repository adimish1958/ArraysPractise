/*
 * Write a Program in Java
Given an array a, your task is to apply the following mutation to it
Array a mutates into a new array b of the same length
For each I from 0 to a.length -1 inclusive b[i] = a[i-1] + a[i] + a[i+1]
If some element in the sum a[i-1] + a[i] + a[i+1] doesn't exist it is considered to be 0
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
