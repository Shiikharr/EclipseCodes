package Arrays;

public class SeparateZeroOne {

	
	/**
	 *     a[]   =   {0,1,0,1,0,0,1}
	 *     output=   {0,0,0,0,1,1,1}
	 */
	
	
	public void separate(int a[])
	{
		int start=0,end=a.length-1;
		
		while(start<end)
		{
			if(a[start]==0)
			{
				start++;
			}
			else if(a[end]==1)
			{
				end--;
			}
			if(a[start]!=a[end])
			{
				int t=a[start];
				a[start]=a[end];
				a[end]=t;
			}
		}
		System.out.println("The New Array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
	public static void main(String args[])
	{
		SeparateZeroOne ob=new SeparateZeroOne();
		int a[]= {0,1,0,1,0,0,1};
		ob.separate(a);
	}
	
}
