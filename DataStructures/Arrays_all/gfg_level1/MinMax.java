package gfg_level1;

public class MinMax {

	
	public static void main(String args[])
	{
		int a[]= { 12, 1234, 45, 67, 1 };
		minmax(a);
	}

	private static void minmax(int[] a) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Max:"+max+" , Min:"+min);
	}
}
