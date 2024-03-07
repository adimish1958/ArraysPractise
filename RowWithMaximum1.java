public class RowWithMaximum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
System.out.println("Index of row with maximum 1s is "+ rowWithMax1s(mat));

	}

	private static int rowWithMax1s(int[][] mat) {
		// TODO Auto-generated method stub
		int max=mat[0].length;
		int row=-1;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<max;j++) {
				if(mat[i][j]==1) {
					if(j<max) {
						max=j;
						row=i;
					}
					break;
				}
			}
		}
		return row;
	}

}
