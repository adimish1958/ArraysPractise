//1.Write a program in Java
/*You are given the prices of a stock in the form of an array of integers, prices. Let's say that prices[i] is the price of the stock on the ith day (0-based index). Assuming that you are allowed to buy and sell the stock only once, your task is to find the maximum possible profit (the difference between the buy and sell price).
Note : no fees associated with buying or selling of the stock
*/
public class pay2dcOnlineAssessment1 {
	
	 public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5};
	        int[] b = mutateArray(a);

	        System.out.println("Original Array:");
	        printArray(a);
	        System.out.println("\nMutated Array:");
	        printArray(b);
	    }

	    public static int[] mutateArray(int[] a) {
	        int n = a.length;
	        int[] b = new int[n];

	        for (int i = 0; i < n; i++) {
	            int left = (i > 0) ? a[i - 1] : 0;
	            int right = (i < n - 1) ? a[i + 1] : 0;
	            b[i] = left + a[i] + right;
	        }

	        return b;
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

}
