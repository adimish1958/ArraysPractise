import java.util.Arrays;

public class MicrosoftMonitors {

	/*
	 * java code for a technology company announced that a new supply of p monitors would soon be available at their store. 
	 * There were N orders(numbered from 0 to N-1) placed by customers whio wanted to buy those monitors. 
	 * The K-th order has to be delivered to a location at distance D[K] from the store and is for exactly C[K] monitors.
Now the time has come for the monitors to be delivered. The orders will be fulfilled one by one.
 To minimize the shipping time, it has been decided that the deliveries will be made in order of increasing distance from the store.
  if there are many customers at the same distance, they can be processed in any order. 
  Monitors to more distant customers will be delivered only once all orders closer to the store have already been fulfilled.
what is the maximum total number of orders that can be fulfilled?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distances[]= {5,11,1,3};
		int monitors[]= {6,1,3,2};
		int p=7;
		System.out.println("Total no. of orders delivered : " + getMaxOrders(distances,monitors,p));
		

	}
	
	 public static int getMaxOrders(int[] distances, int[] monitors, int p) {
	        int n = distances.length;

	        // Create an array of Orders to store distances and corresponding monitor counts
	        Order[] orders = new Order[n];
	        for (int i = 0; i < n; i++) {
	            orders[i] = new Order(distances[i], monitors[i]);
	        }

	        // Sort orders based on distances
	        Arrays.sort(orders);

	        // Iterate through sorted orders and fulfill as many orders as possible
	        int totalOrdersFulfilled = 0;
	        int monitorsLeft = p;

	        for (int i = 0; i < n; i++) {
	            int monitorsInOrder = orders[i].monitors;

	            // If we have enough monitors left to fulfill the current order
	            if (monitorsLeft >= monitorsInOrder) {
	                monitorsLeft -= monitorsInOrder;
	                totalOrdersFulfilled++;
	            }
	            else {
	            	break;
	            }
	        }

	        return totalOrdersFulfilled;
	    }

	    // Order class to store distance and monitor count
	    static class Order implements Comparable<Order> {
	        int distance;
	        int monitors;

	        public Order(int distance, int monitors) {
	            this.distance = distance;
	            this.monitors = monitors;
	        }

	        // Implement compareTo method to compare Orders based on distance
	        @Override
	        public int compareTo(Order o) {
	            return Integer.compare(this.distance, o.distance);
	        }
	    }

}
