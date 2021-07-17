package dynamic;

import java.util.Arrays;

public class Knapsack0_1 {

	//recursive code
	public static int maxProfitRecursive(int wt[],int val[],int w,int n)
	{
		if(n==0 || w==0)
			return 0;
		if(wt[n-1]<=w)
		{
			return Math.max(val[n-1]+maxProfitRecursive(wt,val,w-wt[n-1],n-1), maxProfitRecursive(wt,val,w,n-1));
		}
		else
			return maxProfitRecursive(wt,val,w,n-1);
	}
	
	static int t[][]=new int[102][1002];
	//dp code-memoization
	public static int maxProfitdp(int wt[],int val[],int w,int n)
	{
		if(n==0 || w==0)
			return 0;
		if(t[n][w]!=-1)
			return t[n][w];
		if(wt[n-1]<=w)
		{
			t[n][w]=Math.max(val[n-1]+maxProfitdp(wt,val,w-wt[n-1],n-1), maxProfitdp(wt,val,w,n-1));
			return t[n][w];
		}
		else
		{
			t[n][w]= maxProfitdp(wt,val,w,n-1);
			return t[n][w];
		}
	}
	
	public static int maxProfitBottomUp(int wt[], int val[],int w,int n)
	{
		int x[][]=new int [n+1][w+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<w+1;j++)
			{
				x[i][j]=0;
			}
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<w+1;j++)
			{
				if(wt[i-1]<=j)
					x[i][j]=Math.max(val[i-1]+x[i-1][j-wt[i-1]], x[i-1][j]);
				else
					x[i][j]=x[i-1][j];
			}
		}
		return x[n][w];
	}
	
	public static void main(String[] args) {
		
		int wt[]= {10,20,30,40};
		int val[]= {60,100,120,380};
		int w=50;
		for (int[] row: t)
		    Arrays.fill(row, -1);
		System.out.println("Max Profit: "+maxProfitRecursive(wt,val,w,wt.length));
		System.out.println("Max Profit: "+maxProfitdp(wt,val,w,wt.length));
		System.out.println("Max Profit: "+maxProfitBottomUp(wt,val,w,wt.length));
	}

}
