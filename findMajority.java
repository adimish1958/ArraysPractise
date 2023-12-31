//moore algorithm for majority of voting
	
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		/*int count=1;
		int max=Integer.MIN_VALUE;
		int val=Integer.MIN_VALUE;
		boolean flag=false;
		if(n==1){
			return arr[0];
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>max&&count>(n/2)){
				max=count;
				val=arr[i];
				flag=true;
			}
			count=1;
		}
		if(flag==true){
			return val;
		}
		else{
			return -1;
		}*/

		int vote =0;
		int candidate=-1;
		for(int i=0;i<n;i++){
			if(vote==0){
				vote =1;
				candidate=arr[i];
			}
			else{
				if(arr[i]==candidate){
					vote++;
				}
				else{
					vote--;
				}
			}
		}
		vote=0;
		for(int i=0;i<n;i++){
			if(arr[i]==candidate){
				vote++;
			}
		}
		if(vote>(n/2)){
			return candidate;
		}
		return -1;
	}
