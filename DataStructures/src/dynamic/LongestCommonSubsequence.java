package dynamic;

import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String x="KJKASDNA";
		String y="AKSJASF";
		System.out.println("Longest Common Subsequence recursive is: "+LCSRecusrsive(x,y,x.length(),y.length()));
		//for memoization
		int a[][]=new int [x.length()+1][y.length()+1];
		for(int[] i:a)
			Arrays.fill(i,-1);
		System.out.println("Longest Common Subsequence Memoization is: "+LCSMemoization(x,y,x.length(),y.length(),a));
		System.out.println("Longest Common Subsequence Bottom-Up is: "+LCSBottomUp(x,y,x.length(),y.length()));
	}

	private static int LCSRecusrsive(String x, String y, int n, int m) {
		
		if(n==0 || m==0)
			return 0;
		if(x.charAt(n-1)==y.charAt(m-1))
			return 1+LCSRecusrsive(x,y,n-1,m-1);
		else
			return Math.max(LCSRecusrsive(x,y,n,m-1), LCSRecusrsive(x,y,n-1,m));
	}
	
	public static int LCSMemoization(String x, String y,int n,int m,int a[][])
	{
		if(n==0 || m==0)
			return 0;
		if(a[n][m]!=-1)
			return a[n][m];
		if(x.charAt(n-1)==y.charAt(m-1))
		{
			a[n][m]=1+LCSMemoization(x,y,n-1,m-1,a);
			return a[n][m];
		}
		else
		{
			a[n][m]=Math.max(LCSMemoization(x,y,n,m-1,a), LCSMemoization(x,y,n-1,m,a));
			return a[n][m];
		}
	}
	public static int LCSBottomUp(String x,String y, int n, int m)
	{
		int t[][]=new int[n+1][m+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				if(i==0 || j==0)
					t[i][j]=0;
			}
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<m+1;j++)
			{
				if(x.charAt(i-1) == y.charAt(j-1))
					t[i][j]=1+t[i-1][j-1];
				else
					t[i][j]= Math.max(t[i][j-1], t[i-1][j]);
			}
		}
		return t[n][m];
	}
}
