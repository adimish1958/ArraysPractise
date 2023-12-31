static boolean nonDecreasing(int arr[]) {
		//non decreasing array with atmost one element change
		int count=0;
		int flag=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>=arr[i-1])
			{
				continue;
			}
			else {
				count++;
				if(flag==-1)
				flag=i-1;
				if(flag!=i&&count>1)
					return false;
			}
		}
		return true;
	}
