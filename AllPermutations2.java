/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 

Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10

*/

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

    
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return res;
        
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int nums[], boolean used[]){
        if(tempList.size()==nums.length){
            res.add(new ArrayList<>(tempList));
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(used[i]||i>0 && nums[i]==nums[i-1]&&!used[i-1])
            {
            continue;
            }
           used[i]=true;
           tempList.add(nums[i]);
           backtrack(res,tempList,nums,used);
           used[i]=false;
           tempList.remove(tempList.size()-1);
        }
        }

    }    
    
}
