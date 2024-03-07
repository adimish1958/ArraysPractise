
public class FirstLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int n = arr.length;
        int x = 2;
        System.out.println("First Occurrence = "
                           + first(arr, x, n));
        System.out.println("Last Occurrence = "
                           + last(arr, x, n));

	}

	private static int last(int[] arr, int x, int n) {
		// TODO Auto-generated method stub
		int l=0, r=n-1,index=-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==x) {
				l=mid+1;
				index=mid;
			}
			else if(arr[mid]<x) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return index;
	}

	private static int first(int[] arr, int x, int n) {
		// TODO Auto-generated method stub
		
		int l=0, r=n-1,index=-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==x) {
				r=mid-1;
				index=mid;
			}
			else if(arr[mid]<x) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return index;
	}

}
