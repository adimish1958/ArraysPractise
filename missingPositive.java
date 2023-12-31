static int missingPositive(int arr[]) {
		
		int flag[] = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 && arr[i]<flag.length)
			{flag[arr[i]]=1;
			}
		}
		for(int i=1;i<flag.length;i++) {
			if(flag[i]!=1)
				return i;
		}
		
		return arr.length+1;
	}
