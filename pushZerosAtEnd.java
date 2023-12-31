public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		// Write your code here.
		
		int count=0;
		for(int i=0;i<arr.size();i++){
			if(arr.get(i)!=0)
			{
				arr.set(count,arr.get(i));
				count++;
			}
			

		}
		while(count<arr.size()){
				arr.set(count,0);
				count++;
			}
		System.out.print("after push zeroes to end" + arr);
	}

/*  ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(1);
		arr3.add(0);
		arr3.add(-2);
		arr3.add(3);
		arr3.add(0);
		arr3.add(5);
		arr3.add(0);
		arr3.add(-27);
		pushZerosAtEnd(arr3);
*/
