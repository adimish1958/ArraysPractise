import java.util.*;
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>();
		int arr[]= {-1,1,1,3,2,2,2,3,6,5,6};
		for(int i=0;i<arr.length;i++) {
			A.add(arr[i]);
		}
		A.add(null);
		A.add(null);
		System.out.println("list of elements"+A);
		findDuplicates(A);

	}
	private static void findDuplicates(List<Integer> input) {
		input.removeIf(value->value==null);
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int element:input) {
			if(map.get(element)==null) {
				map.put(element, 1);
			}
			else {
				map.put(element,map.get(element)+1);
			}
		}
		for(int i:map.keySet()) {
			if(map.get(i)==2)
				System.out.println("Duplicate elemnt"+i);
		}
	}

}
