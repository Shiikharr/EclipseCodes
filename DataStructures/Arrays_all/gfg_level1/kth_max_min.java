package gfg_level1;

import java.util.Arrays;

public class kth_max_min {

	
	/**
	 * Given an array and a number k where k is smaller than the size of the array, we need to find the k’th smallest element in the given array.
	 *  
	 *  It is given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 4 
Output: 10 
	 */
	public static void main(String args[])
	{
		int a[]= {7, 10, 4, 3, 20, 15, 54, 34};
		int k=3;
		findkMxMin(a,k);
	}

	private static void findkMxMin(int[] a, int k) {
		//sort the array in ascending order
		Arrays.sort(a);
		int n=a.length;
		System.out.println(a[k-1]);
		System.out.println(a[n-k]);
	}
}
