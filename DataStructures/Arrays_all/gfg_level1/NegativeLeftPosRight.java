package gfg_level1;

public class NegativeLeftPosRight {
	
	/**
	 * An array contains both positive and negative numbers in random order.
	 * Rearrange the array elements so that all negative numbers appear before all positive numbers.

Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
	Note: Order of elements is not important here.
	 */
	public static void main(String args[])
	{
		int a[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		separate(a);
	}

	private static void separate(int[] a) {
		
		int n=a.length;
		int start=0,end=n-1;
		while(start<end)
		{
			if(a[start]>=0)
			{
				int t=a[start];
				a[start]=a[end];
				a[end]=t;
				end--;
			}
			start++;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
