package CompetetiveCoding;

public class MaxSumContiguousSubarray {
	
	/**
	 * Asked in: FACEBOOK,PAYPAL,YAHOO,MICROSOFT,LINKEDIN,AMAZON,GOLDMAN SACHS
	 * 
	 * Here we have to find that contiguous subarray which is having the maximum sum
	 * 
	 * contiguous- ek ke baad ek hona chahiye
	 * 
	 * for example
	 * 
	 * a[]={-2,-3,4,-1,-2,1,5,-3}
	 * 
	 * output- 7
	 * subarray- {4,-1,-2,1,5} add them and you will get maximum sum
	 * 
	 */
	
	public int ContigiousSum(int a[])
	{
		int maxSoFar=Integer.MIN_VALUE;
		int maxEnd=0,sum=0;
		//Implementing kadane's algorithm
		for(int i=0;i<a.length;i++)
		{
			maxEnd=maxEnd+ a[i];
			if(maxEnd<0)
				maxEnd=0;
			if(maxSoFar < maxEnd)
				maxSoFar=maxEnd;
		}
		
		//If the array consist of only negative elements for that we have to do the following steps
		if(maxSoFar==0)
		{
			//find the maximum element and return it. Simple.
			sum=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>sum)
					sum=a[i];
			}
			return sum;
		}
		
		return maxSoFar;
	}
	public static void main(String args[])
	{
		MaxSumContiguousSubarray ob=new MaxSumContiguousSubarray();
		int a[]={-2,-3,4,-1,-2,1,5,-3};
		System.out.println(ob.ContigiousSum(a));
		int b[]={-500,-400};
		System.out.println(ob.ContigiousSum(b));
	}

}
