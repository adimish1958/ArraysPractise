//longest subarray with sum 0 
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		// <PrefixSum, Index>
		Map<Integer,Integer> prefixMap = new HashMap<>();
		int prefixSum = 0;
		int maxLength = 0;

		for(int i=0;i<arr.size();i++){
			prefixSum += arr.get(i);
			if(prefixSum == 0){
				maxLength = i + 1;
			}
			else{
				if(prefixMap.get(prefixSum) != null){
					maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum));
				}
				else{
					prefixMap.put(prefixSum, i);
				}
			}
		}

		return maxLength;
	}
