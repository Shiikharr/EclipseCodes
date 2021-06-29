package gfg_level2;

import java.util.Arrays;

public class QuickSort {

	
	public static void main(String args[])
	{
		int a[]= {15,9,7,13,12,16,4,18,11};
		System.out.println(Arrays.toString(a));
		quicksortrecursion(a,0,a.length-1);
		printArray(a);
	}

	private static void quicksortrecursion(int[] a, int low, int high) {
		int pi=partition(a,low,high);
		if(low<pi-1)
		{
			quicksortrecursion(a,low,pi-1);
		}
		if(pi>high)
		{
			quicksortrecursion(a,pi,high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot=a[(low+high)/2];
		while(low<=high)
		{
			while(a[low]<pivot)
				low++;
			while(a[high]>pivot)
				high--;
			
			if(low<=high)
			{
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}

	private static void printArray(int[] a) {
		int i;
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
}
