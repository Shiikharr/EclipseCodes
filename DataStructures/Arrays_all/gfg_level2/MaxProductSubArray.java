package gfg_level2;

public class MaxProductSubArray {

//	Maximum Product Subarray
//	Difficulty Level : Hard
//	Last Updated : 08 Apr, 2021
//	Given an array that contains both positive and negative integers, find the product of the maximum product subarray. Expected Time complexity is O(n) and only O(1) extra space can be used.
//
//	Examples:
//
//	Input: arr[] = {6, -3, -10, 0, 2}
//	Output:   180  // The subarray is {6, -3, -10}
//
//	Input: arr[] = {-1, -3, -10, 0, 60}
//	Output:   60  // The subarray is {60}
//
//	Input: arr[] = {-2, -40, 0, -2, -3}
//	Output:   80  // The subarray is {-2, -40}
	
	public static void main(String[] args) {
		
		int a[]= {-2, -40, 0, -2, -3};
		System.out.println(maxProduct(a,a.length));
	}

	private static int maxProduct(int[] a, int n) {
		int maxOverall=a[0];
		int maxEnd=a[0],minEnd=a[0];
		
		for(int i=0;i<n;i++)
		{
			int tmp=maxEnd;
			maxEnd=Math.max(a[i], Math.max(a[i]*maxEnd, a[i]*minEnd));
			minEnd=Math.min(a[i], Math.min(a[i]*tmp, a[i]*minEnd));
			maxOverall=Math.max(maxOverall, maxEnd);
		}
		return maxOverall;
		
	}
}
