static void rotateArray(int arr[], int l, int r) {
		int i=l;
		int j=r-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

/*for rotating array by k call the method in the way
  rotateArray(array,0,k);
	rotateArray(array,k,array.length);
	rotateArray(array,0,array.length);
*/
