package Arrays;

public class deleteElement {
	
	public void del(int a[], int pos)
	{
		int n=a.length;
		int b[]=new int[n-1];
		int x=0;
		for(int i=0;i<n;i++)
		{
			if(i==pos)
			{
				System.out.println("The deleted element is:"+ a[i]);
				continue;
			}
			else
			{
				b[x]=a[i];
				x++;
			}
		}
		System.out.println("the new array is:");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		deleteElement ob=new deleteElement();
		int a[]= {1,2,3,4,5,6,7};
		int pos=3;
		ob.del(a,pos);
	}

}
