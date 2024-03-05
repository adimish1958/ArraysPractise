/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
  */


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
        {List<Integer> intersect=new ArrayList<Integer>();
        HashMap<Integer, Integer> hmap1=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(!hmap1.containsKey(nums1[i])){
                hmap1.put(nums1[i],1);

            }
        }
       //r int count=0;
        for(int i=0;i<nums2.length;i++){
            if(hmap1.containsKey(nums2[i])){
                if(!intersect.contains(nums2[i])){
                    intersect.add(nums2[i]);
                }
                
            }

        }
        int arr[] =new int[intersect.size()];
        int count=0;
        for(int a:intersect){
            arr[count]=a;
            count++;
        }

        return arr;
    }
}
