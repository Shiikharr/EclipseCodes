package Backtracking;

public class sudoku {
	static int n=9;
	public static void main(String[] args) {
		
		int a[][] = {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                	 { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                	 { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                	 { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                	 { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                	 { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                	 { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                	 { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                	 { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		boolean isPossible=sudokusolver(a,0,0);
		if(isPossible)
			print(a);
		else
			System.out.println("sudoku cannot be solved");
	}

	private static boolean sudokusolver(int[][] a, int row, int col) {
		
		/*if we have reached the 8th
        row and 9th column (0
        indexed matrix) ,
        we are returning true to avoid further
        backtracking       */
     if (row == n - 1 && col == n)
         return true;
     if (col == n) 
     {
         row++;
         col = 0;
     }
     if (a[row][col] != 0)
         return sudokusolver(a, row, col + 1);
     for (int num = 1; num < 10; num++) {
    	 
         // Check if it is safe to place
         // the num (1-9)  in the
         // given row ,col ->we move to next column
         if (isSafe(a, row, col, num)) {

             
             a[row][col] = num;

             if (sudokusolver(a, row, col + 1))
                 return true;
         }
         //backrtacking
         a[row][col] = 0;
     }
		return false;
	}

	private static boolean isSafe(int[][] a, int row, int col, int num) {
		// Check if we find the same num
        // in the similar row , we
        // return false
        for (int x = 0; x <= 8; x++)
            if (a[row][x] == num)
                return false;
     // Check if we find the same num
        // in the similar column ,
        // we return false
        for (int x = 0; x <= 8; x++)
            if (a[x][col] == num)
                return false;
     // Check if we find the same num
        // in the particular 3*3
        // matrix, we return false
        int startRow = row - row % 3, startCol= col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (a[i + startRow][j + startCol] == num)
                    return false;
        
		return true;
	}

	static void print(int[][] a)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
