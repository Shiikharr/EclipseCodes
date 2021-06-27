package gfg_level2;

import java.util.Arrays;

public class CyclicRotation {

	
	/**
	 * Given an array, cyclically rotate the array clockwise by one. 

Examples:  

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
	 */
	
	public static void main(String args[])
	{
		int a[]= {1, 2, 3, 4, 5};
		rotate(a,a.length);
		int b[]= {3,4,5,6,7,8};
		rotate(b,b.length);
		
		System.out.println("\n"+Arrays.toString(rotate2(b)));
	}

	static int [] rotate2(int arr[])
    {
       int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
       return arr;
    }
	
	private static void rotate(int[] a, int n) {
		int b[]=new int [n];
		int c=1;
		b[0]=a[n-1];
		for(int i=0;i<n-1;i++)
		{
			b[c]=a[i];
			c++;
		}
		System.out.print(Arrays.toString(b));
	}
}
