public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        
        int r=matrix.length;
        int c=matrix[0].length;
        int trans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                trans[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                if(trans[i][j]!=matrix[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
/*
int matrix[][] = { { 1, 3, 5 },
                { 3, 2, 4 },
                { 5, 4, 1 } };
		
		System.out.println("is the matrix is symmetric? " + isMatrixSymmetric(matrix) );
*/
