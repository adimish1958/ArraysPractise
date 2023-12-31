static int secondLargest(int arr[]) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				if(arr[i]>first) {
					first=arr[i];
				}
				if(arr[i-1]>second) {
					second=arr[i-1];
					//System.out.println("the second largest"+ second);
				}
				
			}
			else {
				if(arr[i-1]>first) {
					first=arr[i-1];
				}
				if(arr[i]>second) {
					second=arr[i];
					//System.out.println("the second largest"+ second);
				}
			}
		}
		
		return second;
	}
