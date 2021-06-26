package gfg_level1;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	
	/**
	 * Given two sorted arrays, find their union and intersection.
Example:

Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output : Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input : arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output : Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}
	 */
	
	public static void main(String args[])
	{
		int a[]={1, 3, 4, 5, 7};
		int b[]={2, 3, 5, 6};
		unionIntersection(a,b);
		System.out.println();
		int c[]={2, 5, 6};
		int d[]={4, 6, 8, 10};
		unionIntersection(c,d);
	}

	private static void unionIntersection(int[] a, int[] b) {
		Set <Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		System.out.print("Intersection:");
		for(int i=0;i<b.length;i++)
		{
			if(set.contains(b[i]))
			{
				System.out.print(b[i]+" ");
			}
			set.add(b[i]);
		}	
		System.out.print("\nUnion: "+set);
		
	}
}
