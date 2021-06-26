package Arrays;

public class MinValueArray {

	
	public int min(int a[])
	{
		int min=0;
		min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
	public static void main(String args[])
	{
		MinValueArray ob=new MinValueArray();
		int a[]= {54,23,54,7,97,4,56,87};
		System.out.println("The minimun value in the array is: "+ob.min(a));
	}
	
}
