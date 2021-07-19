package dynamic;

public class countSubsetSum {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,3};
		int sum=6;
		System.out.println(countsub(a,a.length,sum));

	}

	private static int countsub(int[] a, int n, int sum) {
		int t[][]=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<sum+1;j++)
			{
				if(i==0)
					t[i][j]=0;
				if(j==0)
					t[i][j]=1;
			}
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=0;j<sum+1;j++)
			{
				if(a[i-1]<=j)
					t[i][j]=t[i-1][j] + t[i-1][j-a[i-1]];
				else
					t[i][j]=t[i-1][j];
			}
		}
		return t[n][sum];
	}

}
