package Backtracking;

public class shortestPathInAMaze {

	public static void main(String[] args) {
		int a[][]={	{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
					{1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
					{1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
					{0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
					{1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
					{1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
					{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
					{1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};
		int result=shortestPath(a,1,0,0,9);
		if(result<10000)
		System.out.println(result);
		else
			System.out.println("No path exists");
	}

	public static int shortestPath(int a[][], int i, int j, int k, int l)
	{
		int rows=a.length;
		int col=a[0].length;
		boolean vis[][]=new boolean[rows][col];
		
		return shortestPath(a,i,j,k,l,vis);
	}

	public static boolean isValid(int a[][],int i,int j,boolean vis[][])
	{
		int rows=a.length;
		int col=a[0].length;
		
		return i>=0 && j>=0  && i<rows && a[i][j]==1 &&  j<col && !vis[i][j];
	}
	
	private static int shortestPath(int[][] a, int i, int j, int k, int l, boolean[][] vis) {
		
		if(!isValid(a,i,j,vis))
			return 10000;
		if(i==k && j==l)
			return 1;
		vis[i][j]=true;
		int left=shortestPath(a,i,j-1,k,l,vis)+1;
		int right=shortestPath(a,i,j+1,k,l,vis)+1;
		int up=shortestPath(a,i-1,j,k,l,vis)+1;
		int down=shortestPath(a,i+1,j,k,l,vis)+1;
		//this line makes backtracking work
		vis[i][j]=false;
		return Math.min(Math.min(left, down), Math.min(up, right));
	}
	
}
