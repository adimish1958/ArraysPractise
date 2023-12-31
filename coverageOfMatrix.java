public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here;
		int r=mat.size();
		int c=mat.get(0).size();
		int count=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(mat.get(i).get(j)==0){
					if(j-1>=0)
					{
						if(mat.get(i).get(j-1)==1){
							count++;
						}
					}
					if(i-1>=0)
					{
						if(mat.get(i-1).get(j)==1){
							count++;
						}
					}
					if(j+1<c)
					{
						if(mat.get(i).get(j+1)==1){
							count++;
						}
					}
					if(i+1<r)
					{
						if(mat.get(i+1).get(j)==1){
							count++;
						}
					}
				}
			}
		}

		return count;
	}


/*
ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		mat.add(new ArrayList<Integer>());//row 0 created
		mat.add(new ArrayList<Integer>());//row 1 created
		mat.get(0).add(0,1);
		mat.get(0).add(1,0);
		mat.get(1).add(0,0);
		mat.get(1).add(1,1);
		
		System.out.println("the coverage of matrix : " + coverageOfMatrix(mat));
*/
	
