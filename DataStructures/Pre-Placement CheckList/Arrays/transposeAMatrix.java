package Arrays;

public class transposeAMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6}};
		//printing first original array (a)
		System.out.println("The first matrix is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The first transposed matrix is:");
		transposematrix(a);
		//printing the second array (b)
		System.out.println("The second matrix is:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The second transposed matrix is:");
		transposematrix(b);
	}

	private static void transposematrix(int[][] a) {
		int rows=a.length;
		int columns=a[0].length;
		
		int newMatrix[][]=new int [columns][rows];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				newMatrix[j][i]=a[i][j];
			}
		}
		for(int i=0;i<columns;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}

}
