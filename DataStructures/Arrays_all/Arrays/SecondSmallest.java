package Arrays;

public class SecondSmallest {

	
	/**
	 *   Here we have to find the second smallest number in an array:
	 *   
	 *   a[]={-1,7,1,34,18}
	 *   
	 *   output= 1
	 */
	
	
	public static void main(String args[])
	{
		int a[]= {-1,7,1,34,18};
		int smallest=Integer.MAX_VALUE;
		int secondsmall=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
				smallest=a[i];
			if(a[i]>smallest && a[i]<secondsmall)
				secondsmall=a[i];
		}
		System.out.println("The Second smallest number is: "+secondsmall);
	}
}
