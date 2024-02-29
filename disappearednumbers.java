/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

  */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<=nums.length;i++){
            arr.add(0);
        }
        
        arr.set(0,0);
        for(int i=0;i<nums.length;i++){
            arr.set(nums[i],nums[i]);
        }
        int count=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)==0){
                nums[count]=i;
                count++;
            }
        }
        arr.clear();
        for(int i=0;i<count;i++){
            arr.add(nums[i]);
        }
        return arr;
    }
}
