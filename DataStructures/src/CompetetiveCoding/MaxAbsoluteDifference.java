package CompetetiveCoding;

public class MaxAbsoluteDifference {

	
	/**
	 * To see the explanation check oneNote
	 * 
	 * You are given an array of N integers, A1, A2,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
	 * f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes the absolute value of x.
	 * 
	 * For example,
	 * A=[1, 3, -1]
	 * 
	 * f(1, 1) = f(2, 2) = f(3, 3) = 0
	 * f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
	 * f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
	 * f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5
	 * So, we return 5.
	 */
	
	public int maxDiff(int a[])
	{
		int n=a.length;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			max1=Math.max(max1, a[i]-i);
			max2=Math.max(max2, -a[i]+i);
			min1=Math.min(min1, a[i]-i);
			min2=Math.min(min2, -a[i]+i);
		}
		return (Math.max(max1-min1, max2-min2));
	}
	
	
	public static void main(String args[])
	{
		MaxAbsoluteDifference ob=new MaxAbsoluteDifference();
		int a[]={1, 3, -1};
		System.out.println(ob.maxDiff(a));
		int b[]={1,2,3,4,5};
		System.out.println(ob.maxDiff(b));
	}
}
