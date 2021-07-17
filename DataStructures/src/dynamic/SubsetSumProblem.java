package dynamic;

public class SubsetSumProblem {

	
	public static void subsetsum(int a[],int n,int sum)
	{
		boolean t[][]=new boolean[n+1][sum+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<sum+1;j++)
			{
				if(i==0)
					t[i][j]=false;
				if(j==0)
					t[i][j]=true;
			}
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<sum+1;j++)
			{
				if(a[i-1]<=j)
				{
					t[i][j]=t[i-1][j-a[i-1]] || t[i-1][j];
				}
				else
					t[i][j]=t[i-1][j];
			}
		}
		System.out.println("subset sum exists: "+t[n][sum]);
//		for(int i=0;i<t.length;i++)
//		{
//			for(int j=0;j<t[0].length;j++)
//				System.out.print(t[i][j]+" ");
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 32;
        int n = set.length;
        subsetsum(set,n,sum);
	}

}
