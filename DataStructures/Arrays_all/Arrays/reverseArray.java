package Arrays;

public class reverseArray {
	
	public void reverse(int a[])
	{
		int l=a.length;
		int b[]=new int[l];
		int x=0,i;
		for(i=l-1;i>=0;i--)
		{
			b[x]=a[i];
			x++;
		}
		for(i=0;i<l;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public void reverse2(int a[],int start,int end)
	{
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		reverseArray ob=new reverseArray();
		int a[]= {1,2,3,4,5,6};
		ob.reverse(a);
		System.out.println("\nReverse with second method:");
		ob.reverse2(a, 0, a.length-1);
	}

}
