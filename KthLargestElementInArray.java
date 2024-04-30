/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 
*/



class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max=Integer.MIN_VALUE;

        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else{
                hmap.put(nums[i],1);
            }

            max=Math.max(max,nums[i]);
        }
        k=k-hmap.get(max);
        hmap.put(max,0);
        while(k>0){
            max=max-1;
            if(hmap.containsKey(max)){
               k=k-hmap.get(max); 
               hmap.put(max,0);
            }
        }
        return max;
        
    }
}
