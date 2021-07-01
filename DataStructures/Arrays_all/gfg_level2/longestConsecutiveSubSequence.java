package gfg_level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class longestConsecutiveSubSequence {

//	Longest Consecutive Subsequence
//	Difficulty Level : Medium
//	Last Updated : 25 Jun, 2021
//	Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. 
//
//	Examples:  
//
//	Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
//	Output: 4
//	Explanation: 
//	The subsequence 1, 3, 4, 2 is the longest 
//	subsequence of consecutive elements
//
//	Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
//	Output: 5
//	Explanation: 
//	The subsequence 36, 35, 33, 34, 32 is the longest 
//	subsequence of consecutive elements.
	
	public static void main(String[] args) {
		int a[]= {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		longestsubSequence(a,a.length);

	}

	private static void longestsubSequence(int[] a, int n)
	{
		
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		for(int i=0;i<n;i++)
		{
			map.put(a[i], true);
		}
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]-1))
			{
				map.put(a[i], false);
			}
		}
		int msp=0;
		int ml=0;
		for(int i=0;i<n;i++)
		{
			if(map.get(a[i])==true)
			{
				int tl=1;
				int tsp=a[i];
				while(map.containsKey(tsp+tl))
				{
					tl++;
				}
				if(tl>ml)
				{
					msp=tsp;
					ml=tl;
				}
			}
		}
		System.out.println(map);
		System.out.println("Longest consecutive Sub Sequence is of length= "+ml);
		System.out.println("The subsequence is:");
		for(int i=0;i<ml;i++)
			System.out.print(msp + i +" ");
	}

}
