static int uniqueArray(int arr[]) {
		int n=arr.length;
		
		Set<Integer> s= new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
				
		}
		int diff=n-s.size();
		return diff;
	}
