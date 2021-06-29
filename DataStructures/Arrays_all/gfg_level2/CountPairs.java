package gfg_level2;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairs {

	
	/**
	 * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.

Examples:  

Input  :  arr[] = {1, 5, 7, -1}, 
          sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1)

Input  :  arr[] = {1, 5, 7, -1, 5}, 
          sum = 6
Output :  3
Pairs with sum 6 are (1, 5), (7, -1) &
                     (1, 5)         

Input  :  arr[] = {1, 1, 1, 1}, 
          sum = 2
Output :  6
There are 3! pairs with sum 2.

Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6, 
                   5, 4, 2, 1, 1, 1}, 
          sum = 11
Output :  9
Expected time complexity O(n)
	 * 
	 */
	
	public static void main(String args[])
	{
		int a[]= {1, 5, 7, -1};
		int s1=6;
		findpairs(a,a.length,s1);
		int b[]= {1,1,1,1};
		int s2=2;
		findpairs(b,b.length,s2);
		int c[]= {10, 12, 10, 15, -1, 7, 6, 
                5, 4, 2, 1, 1, 1};
		int s3=2;
		findpairs(c,c.length,s3);
	}

//	private static void findpairs(int[] a, int n, int sum) 
//	{
//		int start=0,end=n-1;
//		Arrays.sort(a);
//		while(start<end)
//		{
//			int sum2=a[start]+a[end];
//			if(sum2==sum)
//			{
//				System.out.println("["+a[start]+","+a[end]+"]");
//				start++;
//				end--;
//			}
//			else if(sum2<sum)
//			{
//				start++;
//			}
//			else if(sum2>sum)
//				end--;
//		}
//		
//	}

	private static void findpairs(int[] a, int n,int sum) {
		
		HashMap<Integer,Integer>map=new HashMap<>();
		//every element of the array is the key and its frequency is the value
		for(int i=0;i<n;i++)
		{
			int c=map.getOrDefault(a[i], 0);
			map.put(a[i], c+1);
		}
		System.out.print(map);
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(map.get(sum-a[i])!=null)
			{
				count+=map.get(sum-a[i]);
			}
			if(sum-a[i]==a[i])
				count--;
		}
		System.out.println("\nThe number of pairs are:"+(count/2));
		
	}
	
	
}
