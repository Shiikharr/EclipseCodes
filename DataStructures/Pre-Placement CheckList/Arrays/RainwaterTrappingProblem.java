package Arrays;

import java.util.Arrays;

public class RainwaterTrappingProblem {

	public static void main(String[] args) {
		int a[]= {3,1,2,4,0,1,3,2};
		trapping(a,a.length);

	}

	private static void trapping(int[] a, int n) {
		int left[]=new int[n];
		int right[]=new int[n];
		left[0]=a[0];
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1], a[i]);
		}
		System.out.println(Arrays.toString(a));
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1], a[i]);
		}
		System.out.println(Arrays.toString(left));		
		System.out.println(Arrays.toString(right));
		int ans=0;
		for(int i=0;i<n;i++)
		{
			ans+=(Math.min(left[i], right[i])-a[i]);
		}
		System.out.println("Total blocks of water trapped is: "+ans);
	}

}
