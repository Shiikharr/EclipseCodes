package gfg_level1;

public class Sort_ascending {

	
	public static void main(String args[])
	{
		int a[]= {6,7,3,2,9,5,8};
		sortAscending(a);
	}

	private static void sortAscending(int[] a) {
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
