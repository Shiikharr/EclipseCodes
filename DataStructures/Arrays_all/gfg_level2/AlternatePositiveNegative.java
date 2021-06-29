package gfg_level2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class AlternatePositiveNegative {

//	Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
//	Difficulty Level : Hard
//	Last Updated : 29 May, 2021
//	Given an array of positive and negative numbers, 
//	arrange them in an alternate fashion such that every positive number is followed 
//	by negative and vice-versa maintaining the order of appearance. 
//	Number of positive and negative numbers need not be equal. If there are more positive 
//	numbers they appear at the end of the array. If there are more negative numbers, 
//	they too appear in the end of the array.
//
//	Examples : 
//
//	Input:  arr[] = {1, 2, 3, -4, -1, 4}
//	Output: arr[] = {-4, 1, -1, 2, 3, 4}
//
//	Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
//	output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
	
	
	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, -4, -1, 4};
		int b[]= {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int c[]= {-2,-3,5,6,7};
		alternate(a,a.length);
		System.out.println();
		alternate(b,b.length);
		System.out.println();
		alternate(c,c.length);
	}

	private static void alternate(int[] a, int n) 
	{
		HashMap<Integer, Integer>map=new HashMap<Integer,Integer>();
		int c=0,x=1;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				map.put(c,a[i]);
				c+=2;
			}
			else
			{
				map.put(x,a[i]);
				if(x<c)
					x+=2;
				else
					x+=1;
			}
		}
		Collection<Integer> values=map.values();
		values.forEach(value -> System.out.print(value +" "));
	} 

}
