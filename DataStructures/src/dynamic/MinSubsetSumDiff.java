package dynamic;

import java.util.ArrayList;

public class MinSubsetSumDiff {
	
	static boolean t[][];
	public static void subsetSum(int a[],int n,int sum)
	{
		t=new boolean[n+1][sum+1];
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
					t[i][j]=t[i-1][j] || t[i-1][j-a[i-1]];
				else
					t[i][j]=t[i-1][j];
			}
		}
	}
	
	public static int minSubset(int a[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=a[i];
		subsetSum(a,n,sum);
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=0;i<=(sum)/2;i++)
		{
			if(t[n][i]==true)
				ar.add(i);
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<ar.size();i++)
		{
			min=Math.min(min, sum-2*ar.get(i));
		}
		return min;
	}
	public static void main(String[] args) {
		
		int arr[] = {3, 1, 4, 2, 2, 1};
		System.out.println("The minimum difference between two subsets is: "+minSubset(arr,arr.length));
	}

}
