package gfg_level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class subArrayWithSumZero {

//	Find if there is a subarray with 0 sum
//	Difficulty Level : Medium
//	Last Updated : 08 Feb, 2021
//	Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
//
//	Examples : 
//
//	Input: {4, 2, -3, 1, 6}
//	Output: true 
//	Explanation:
//	There is a subarray with zero sum from index 1 to 3.
//
//	Input: {4, 2, 0, 1, 6}
//	Output: true 
//	Explanation:
//	There is a subarray with zero sum from index 2 to 2.
//
//	Input: {-3, 2, 3, 1, 6}
//	Output: false
	
	public static void main(String[] args) {
		int a[]= {4, 2, -3, 1, 6};
		int b[]= {4, 2, 0, 1, 6};
		System.out.println(subZero(a,a.length));
		System.out.println();
		System.out.println(subZero(b,b.length));

	}

	//we will do sum of elements of array and if at any point the sum is repeating then we know that subarray sum is zero somewhere in the array
	
	private static boolean subZero(int[] a, int n) 
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int count=0;
		int i=-1;
		int sum=0;
		map.put(0, 1);
		while(i<a.length-1)
		{
			i++;
			sum+=a[i];
			if(map.containsKey(sum))
			{
				count+=map.get(sum);
				map.put(sum, map.get(sum)+1);
			}
			else
			{
				map.put(sum, 1);
			}
		}
		System.out.println(map);
		if(count!=0)
			return true;
		else
			return false;
	}

}
