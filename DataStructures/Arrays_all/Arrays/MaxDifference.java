package Arrays;

public class MaxDifference {

	/**
	 * find maximum difference between two elements such that larger number appears after smaller number.
	 * 
	 * a[]={2,5,15,6,4};
	 * output= 13
	 * 
	 * b[]={7,9,5,6,13,2};
	 * output= 8 
	 * as 2 appears after 13 so we will not take it, so the next small number which comes before 13 is 5 therefore the answer is 8.
	 */
	
	
	
	public void maxdiff(int a[])
	{
		int pos=0,max=0,min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				pos=i;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min && i<pos)
			{
				min=a[i];
			}
		}
		
		System.out.println("The maximum Difference is:"+ Math.abs(max-min));
	}
	
	
	
	public static void main(String args[])
	{
		MaxDifference ob=new MaxDifference();
		int a[]= {2,5,15,6,4};
		ob.maxdiff(a);
		int b[]= {7,9,5,6,13,2};
		ob.maxdiff(b);
	}
	
	
}
