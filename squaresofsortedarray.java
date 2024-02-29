/*

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

*/

/* solution explaination

  Intuition
We will start changing the array from backwards and fill from reverse.

Approach
We will initialize three pointers:
'i' which will start at the start of Array and will go to the end, 'j' which will start at the end of array and will travel in opposite direction.
And a pointer 'k' which will start from left and will travel in reverse direction like j.
The task of i and j is that at each iteration we compare the value at i and j and depending on the greater mod value we fill its value at index k and increment(if i) or decrement(if j) the pointer. Note that both ways k will always get decremented.

Clever part
There can be a concern of crossing of i and j pointers since we are modifying the array but it is also resolved since we are filling elements in decreasing order and as the original array is sorted so our new modified array will be sorted from the back(i.e. from position k to end all elements are sorted and are guaranteed to be greater than other elements left).

Complexity
Time complexity: O(n)O(n)O(n)
As we went thru the array in one pass

Space complexity:O(1)O(1)O(1)
Since we used no extra space proportional to n

  */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] =new int[nums.length];
        int i=0,j=nums.length-1,k=nums.length-1;
        while(i<nums.length && j>=0 && k>=0){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                arr[k]=(int)Math.pow(nums[j],2);
                j--;
                k--;
            }
            else{
                arr[k]=(int)Math.pow(nums[i],2);
                i++;
                k--;
            }
        }
        return arr;

    }
}
  
