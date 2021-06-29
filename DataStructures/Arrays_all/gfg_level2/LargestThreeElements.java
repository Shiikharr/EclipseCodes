package gfg_level2;

public class LargestThreeElements {

//	Find the largest three distinct elements in an array
//	Difficulty Level : Easy
//	Last Updated : 09 Mar, 2021
//	Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1). 
//	Examples :
//
//	Input: arr[] = {10, 4, 3, 50, 23, 90}
//	Output: 90, 50, 23
	
	
	
	public static void main(String[] args) {
		int a[]= {10, 4, 3, 50, 23, 90};
		largestThree(a,a.length);
		int b[]= {3,8,1,22,43,66};
		largestThree(b,b.length);
	}

private static void largestThree(int[] a, int n) {
	int max1=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	int max3=Integer.MIN_VALUE;
	
	for(int i=0;i<n;i++)
	{
		if(max1<a[i])
		{
			max1=a[i];
		}
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]<max1 && max2<a[i])
		{
			max2=a[i];
		}
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]<max2 && max3<a[i])
		{
			max3=a[i];
		}
	}
	System.out.println("The largest three numbers are:"+max1+","+max2+","+max3);
}

}
