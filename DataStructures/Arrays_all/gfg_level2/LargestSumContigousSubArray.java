package gfg_level2;

public class LargestSumContigousSubArray {

//	Largest Sum Contiguous Subarray
//	Difficulty Level : Medium
//	Last Updated : 27 May, 2021
//	Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum. 
//	a[]={-2,-3,4,-1,-2,1,5,-3}
//	output- 7
//	subarray- {4,-1,-2,1,5} add them and you will get maximum sum
	
	public static void main(String[] args)
	{
		//We will implement kaden's algo for this question
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(LargestSum(a,a.length));

	}

	private static int LargestSum(int[] a, int n) 
	{
		int maxSoFar=Integer.MIN_VALUE;
		int maxEnd=0,sum=0;
		//Implementing kadane's algorithm
		for(int i=0;i<a.length;i++)
		{
			maxEnd=maxEnd+ a[i];
			if(maxEnd<0)
				maxEnd=0;
			if(maxSoFar < maxEnd)
				maxSoFar=maxEnd;
		}
		
		//If the array consist of only negative elements for that we have to do the following steps
		if(maxSoFar==0)
		{
			//find the maximum element and return it. Simple.
			sum=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>sum)
					sum=a[i];
			}
			return sum;
		}
		
		return maxSoFar;
	
	}

}
