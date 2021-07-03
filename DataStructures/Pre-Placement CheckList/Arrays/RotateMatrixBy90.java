package Arrays;

public class RotateMatrixBy90 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		rotatematrix(a,a.length);

	}

	private static void rotatematrix(int[][] a, int n) {
		
		//swap the diagonals of opposite index like a[0][1]=a[1][0] and so on
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				 int t=a[i][j];
				 a[i][j]=a[j][i];
				 a[j][i]=t;
			}
		}
		//swap the first and the last elements
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				int t=a[i][j];
				a[i][j]=a[i][n-1-j];
				a[i][n-1-j]=t;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
