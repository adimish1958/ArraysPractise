//longest subarray with sum K 
	// Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int maxlen=0;
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int prefixsum=0;
        for(int i=0;i<N;i++){
            prefixsum+=A[i];
            if(prefixsum==K){
                maxlen=i+1;
            }
            else{
                if(hmap.containsKey(prefixsum-K)){
                    maxlen=Math.max(maxlen,i-hmap.get(prefixsum-K));
                }
                else{
                    hmap.put(prefixsum,i);
                }
            }
        }
        return maxlen;
    }
