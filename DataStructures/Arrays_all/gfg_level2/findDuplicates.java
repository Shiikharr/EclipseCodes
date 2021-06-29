package gfg_level2;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {

	/**
	 * Find duplicates in O(n) time and O(1) extra space
	 * 
	 * Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6

Explanation: The numbers 1 , 3 and 6 appears more
than once in the array.

Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3
	 */
	
	public static void main(String args[])
	{
		int a[]= {1, 2, 3, 6, 3, 6, 1};
		findDup(a,a.length);
	}

	private static void findDup(int[] a, int n) {
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<n;i++)
		{
			if(set.contains(a[i]))
			{
				System.out.print(a[i]+" ");
			}
			else
				set.add(a[i]);
		}
		
	}
}
