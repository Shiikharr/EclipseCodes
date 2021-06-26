package gfg_level1;

public class RangeAndCoeffOfRange {

	
	/**
	 * Input: arr[] = {15, 16, 10, 9, 6, 7, 17} 
Output: Range : 11 
Coefficient of Range : 0.478261 
Max = 17, Min = 6 
Range = Max – Min = 17 – 6 = 11 
Coefficient of Range = (Max – Min) / (Max + Min) = 11 / 23 = 0.478261
Input: arr[] = {5, 10, 15} 
Output: Range : 10 
Coefficient of Range : 0.5 
	 */
	
	public static void main(String args[])
	{
		int a[]= { 15, 16, 10, 9, 6, 7, 17};
		int b[]= {5, 10, 15};
		RangeAndCoeff(a);
		RangeAndCoeff(b);
	}

	private static void RangeAndCoeff(int[] a) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		double range=max-min;
		double coeff=range/(max+min);
		System.out.println("Range = "+range);
		System.out.println("Coefficient of Range = "+coeff);
		
	}
}
