public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		
		ArrayList<Integer> arr = new ArrayList<>();

        int i = 0; // Pointer for arr1

        int j = 0; // Pointer for arr2

 

        while (i < arr1.size() && j < arr2.size()) {

            if (arr1.get(i) < arr2.get(j)) {

                i++;

            } else if (arr1.get(i) > arr2.get(j)) {

                j++;

            } else {

                // Found an intersection

                arr.add(arr2.get(j));

                i++;

                j++;

            }

        }
		
		return arr;
	}
/*
    ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(1);
		arr1.add(2);
		arr1.add(2);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(1);
		arr2.add(2);
		System.out.println("intersection of two arrays" + findArrayIntersection(arr1,4,arr2,2));
*/
		
	
