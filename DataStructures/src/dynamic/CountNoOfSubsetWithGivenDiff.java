package dynamic;

public class CountNoOfSubsetWithGivenDiff {

	public static int subset(int a[],int n,int sum)
	{
		int t[][]=new int [n+1][sum+1];
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
				{
					t[i][j]=t[i-1][j] + t[i-1][j-a[i-1]];
				}
				else
					t[i][j]=t[i-1][j];
			}
		}
		return t[n][sum];
	}
	
	public static int countSub(int a[],int n,int diff)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		int sub1= (sum+diff)/2;
		return subset(a,n,sub1);
	}
	
	public static void main(String[] args) {
		int a[]= {1,1,2,3};
		int diff=1;
		System.out.println(countSub(a,a.length,diff));
	}

}
