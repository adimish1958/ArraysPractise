public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
		
		//First way to do but complexity is high
       /* HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else{hmap.put(arr[i],1);}
        }
        int count=0;
        for(Map.Entry<Integer,Integer> me:hmap.entrySet()){
            if(hmap.containsKey(target-me.getKey())){
                if(hmap.get(target-me.getKey())>0 && me.getKey()!=(target-me.getKey()))
                {
                    count++;
                    hmap.put(target-me.getKey(),0);
                    hmap.put(me.getKey(),0);
                }
            }
        }
       return count==0?-1:count;*/
		
		//Second Way with O(n)
		int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]==target)
            {
                count++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }


        }
        return count==0?-1:count;
    }

/*
int array5[]= {1,2,3,4,5};
		int target=6;
		System.out.println("No. of pair sum are " +pairSum(array5,5,6));

*/
	
