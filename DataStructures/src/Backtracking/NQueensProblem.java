package Backtracking;

public class NQueensProblem {
	final static int n=5;
	public static void main(String args[])
	{
		int a[][]= {{ 0, 0, 0, 0, 0 },
                	{ 0, 0, 0, 0, 0 },
                	{ 0, 0, 0, 0, 0 },
                	{ 0, 0, 0, 0, 0 },
                	{ 0, 0, 0, 0, 0 }};
		
		boolean isPossible=solveNQ(a,0);
		if(isPossible)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Solution is not possible");
	}

	private static boolean solveNQ(int[][] a, int col) {
		
		if(col>=n)
			return true;
		for(int i=0;i<n;i++)
		{
			if(isValid(a,i,col))
			{
				a[i][col]=1;
				
				if(solveNQ(a,col+1))
					return true;
				//backtracking
				a[i][col]=0;
			}
		}
		return false;
	}

	private static boolean isValid(int[][] a, int row, int col) {
		int i,j;
		
		for(i=0;i<col;i++)
			if(a[row][i]==1)
				return false;
		
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (a[i][j] == 1)
                return false;
		
		for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (a[i][j] == 1)
                return false;
		return true;
	}
}
