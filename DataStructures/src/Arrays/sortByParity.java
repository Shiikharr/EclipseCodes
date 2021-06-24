package Arrays;

public class sortByParity {

	/**
	 * here we have to print the array's even elements first and then odd elements
	 * 
	 *  a[]= {3,1,2,4};
	 * output={2,4,3,1}
	 * 
	 */
	
	
	private void paritysort(int a[])
	{
		int k=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String args[])
	{
		sortByParity ob=new sortByParity();
		int a[]= {3,1,2,4};
		ob.paritysort(a);
	}
}
