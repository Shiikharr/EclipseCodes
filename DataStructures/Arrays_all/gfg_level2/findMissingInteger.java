package gfg_level2;

import java.util.Arrays;
import java.util.HashMap;

public class findMissingInteger {

	
	
	  
	  
//You are given a list of n-1 integers and these integers are in the range of 1 to n.
//There are no duplicates in the list. One of the integers is missing in the list.
//Write an efficient code to find the missing integer.
//Example: 
//
//Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
//Output: 5
//Explanation: The missing number from 1 to 8 is 5
//
//Input: arr[] = {1, 2, 3, 5}
//Output: 4
//Explanation: The missing number from 1 to 5 is 4
	 
	
	public static void main(String args[])
	{
		int a[]= {1, 2, 4, 6, 3, 7, 8};
		findInteger(a,a.length);
	}

	private static void findInteger(int[] a, int n) 
	{	
		//here we have to apply the summation formula. 
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(i+1==a[i])
			map.put(i+1, a[i]);
			else
			{
				System.out.println("The missing integer is:"+ (i+1));
				break;
			}
		}
	}
}