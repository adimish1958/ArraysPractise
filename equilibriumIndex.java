static int equilibriumIndex(int arr[]) {
		//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
		//The equilibrium index of an array is an index 
		//such that the sum of elements at lower indexes
		//is equal to the sum of elements at higher indexes. 
		int sum=0;
		int index=-1;
		int leftSum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum=sum-arr[i];
			if(sum==leftSum) {
				index=i;
				break;
			}
			leftSum+=arr[i];
		}
		return index;
	}
