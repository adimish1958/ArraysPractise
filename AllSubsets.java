/*
Problem 1: (nums array without duplicates)
Given an integer array nums of unique elements, return all possible 
subsets(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

  Problem2: (array with duplicates)

  Given an integer array nums that may contain duplicates, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
  */

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, nums, new ArrayList<Integer>(), 0);
        return res;
    }

     private void backtrack(List<List<Integer>> res, int nums[], List<Integer> tempList, int start){
        res.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++){
          //below two lines are specifically added for problem 2 in which array consists of duplicate element but no duplicate sets allowed in the output
            if(i>start && nums[i]==nums[i-1])
            continue;
            tempList.add(nums[i]);
            backtrack(res,nums,tempList,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
