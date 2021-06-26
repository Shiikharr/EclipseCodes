package gfg_level1;

public class ReverseArray {

	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		reverse(a);
	}

	private static void reverse(int[] a) {
		int start=0,end=a.length-1;
		
		while(start<end)
		{
			int t=a[start];
			a[start]=a[end];
			a[end]=t;
			start++;
			end--;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
