public class MicrosoftBoard {
	/*
	 * write a java code for board with rows and column. each cell is either empty or contains a or b. 
	 * calculate the number of rectangles inside the board with corner at position (0,0) which cover an equal number of letters a and b.

      String [] board={"AB.","B..","..A"};
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String board[]={"AB.","B..","..A"};
		System.out.println("no. of rectangles formed " + countRectangles(board));

	}
	
	// Function to calculate the number of rectangles with corners at position (0,0) that cover an equal number of 'a' and 'b'
    private static int countRectangles(String [] board) {
        int rectangleCount = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                int countA = 0;
                int countB = 0;

                for (int k = 0; k <= i; k++) {
                    for (int l = 0; l <= j; l++) {
                        if (board[k].charAt(l) == 'A') {
                            countA++;
                        } else if(board[k].charAt(l) == 'B') {
                            countB++;
                        }
                    }
                }

                if (countA == countB) {
                    rectangleCount++;
                }
            }
        }

        return rectangleCount;
    }

}
