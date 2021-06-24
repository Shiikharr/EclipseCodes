package Arrays;

public class MergeSortedArrays {

	
	public void merge(int a[],int b[])
	{
		int x=a.length;int y=b.length;
		int n=x+y;
		int c[]=new int[n];
		int k=0,i=0,j=0;
		
		while(i<x && j<y)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<x)
		{
			c[k]=a[i];
			i++;k++;
		}
		while(j<y)
		{
			c[k]=b[j];
			j++;k++;
		}
		for(int s=0;s<n;s++)
		{
			System.out.print(c[s]+" ");
		}
	}
	public static void main(String args[])
	{
		MergeSortedArrays ob=new MergeSortedArrays();
		int a[]= {1,2,4,6,8,9};
		int b[]= {3,5,7,10,11};
		ob.merge(a, b);
	}
}
