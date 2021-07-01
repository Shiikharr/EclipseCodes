package Arrays;

public class kadaneAlgo {

//	a[]={-2,-3,4,-1,-2,1,5,-3}
//	  output- 7
	
	public static void main(String args[])
	{
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println("The max sum is:"+maxSumContiguous(a, a.length));
		int b[]= {-4,-54,-33,-5,-1};
		System.out.println("The max sum is:"+maxSumContiguous(b, b.length));
		
	}

	private static int maxSumContiguous(int[] a, int n) {
		
		int maxSoFar=Integer.MIN_VALUE;
		int maxEnd=0, sum=0;
		for(int i=0;i<n;i++)
		{
			maxEnd+=a[i];
			if(maxEnd<0) 
			{
				maxEnd=0;
			}
			if(maxSoFar<maxEnd)
			{
				maxSoFar=maxEnd;
			}
		}
		
		if(maxSoFar==0)
		{
			sum=a[0];
			for(int i=0;i<n;i++)
			{
				if(a[i]>sum)
					sum=a[i];
			}
			return sum;
		}
		return maxSoFar;
	}
}
