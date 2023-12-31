 //count all subarrays having sum divisible by k
    
    public static int subArrayCount(ArrayList < Integer > arr, int k) {

   	 // Write your code here.
       /* int sum =0;
        int count=0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=arr.get(j);
                if(sum%k==0){
                    count++;
                }
            }
            sum=0;
        }
        return count;*/

        HashMap<Long,Integer> hmap=new HashMap<>();
        int ans=0;
        long sum=0;
        hmap.put(sum,1);
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            long rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hmap.containsKey(rem)){
                ans+=hmap.get(rem);
                hmap.put(rem,hmap.get(rem)+1);
            }
            else{
                hmap.put(rem,1);
            }

        }
        return ans;
   }
