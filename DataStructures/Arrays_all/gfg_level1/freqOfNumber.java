package gfg_level1;

public class freqOfNumber {

	
	/**
	 * Given an array, a[], and an element x, find a number of occurrences of x in a[].
Examples: 
 

Input  : a[] = {0, 5, 5, 5, 4}
           x = 5
Output : 3

Input  : a[] = {1, 2, 3}
          x = 4
Output : 0
	 */
	
	public static void main(String args[])
	{
		int a[]= {0, 5, 5, 5, 4};
		int x=5;
		findFreq(a,x);
	}

	private static void findFreq(int[] a, int x) {
		int c=0,n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
				c++;
		}
		System.out.println("frequency of "+x+" is:"+c);
	}

}
