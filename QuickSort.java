
public class QuickSort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n=arr.length;
		sort(arr,0,n-1);
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
   

	}

	public static void sort(int[] arr, int l, int r) {
		
		// TODO Auto-generated method stub
		if(l<r) {
			int p=partition(arr,l,r);
			sort(arr,l,p-1);
			sort(arr,p+1,r);
		}
		
	}

	public static int partition(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int p=arr[l];
		int low=l;
		int high=r;
		while(l<r) {
			while(l<arr.length && arr[l]<=p) {
				l++;
			}
			while(r>=0 && arr[r]>p) {
				r--;
			}
			if(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			}
		}
		arr[low]=arr[r];
		arr[r]=p;
		return r;
	}

}
