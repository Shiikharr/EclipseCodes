package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class majorityElementFirst {

	public static void main(String args[])
	{
		int a[]= {1,4,4,4,1};
		findMajority(a,a.length);
	}

	//This is the most efficient way to solve this problem MOORE'S VOTING ALGORITHM
	private static void findMajority(int[] a, int n) {
		int ansIndex=0;
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(a[i] == a[ansIndex])
				count++;
			else
				count--;
			if(count==0)
			{
				ansIndex=i;
				count =1;
			}
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]== a[ansIndex])
				c++;
		}
		if(c > n/2)
			System.out.println(a[ansIndex]);
		else
			System.out.println("No element");
	}

	//using hashMap T-> O(n) S-> O(n)
//	private static void findMajority(int[] a, int n) {
//		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//		int max=0,index=-1;
//		for(int i=0;i<n;i++)
//		{
//			int count=map.getOrDefault(a[i], 0);
//			map.put(a[i], count+1);
//		}
//		System.out.println(map);
//		for(int i=0;i<n;i++)
//		{
//			if(map.get(a[i])>max)
//			{
//				max=map.get(a[i]);
//				index=i;
//			}
//		}
//		if(max>n/2)
//		System.out.println(a[index]);
//		else
//			System.out.println("No element");
//	}

	//brute-force approach
//	private static void findMajority(int[] a, int n) {
//		int count=0,i,j,max=0,index=-1;
//		for(i=0;i<n;i++)
//		{
//			count = 0;
//			for(j=0;j<n;j++)
//			{
//				if(a[j]==a[i])
//				{
//					count++;
//				}
//			}
//			if(count>max)
//			{
//				max=count;
//				index=i;
//			}
//		}
//		if(max> n/2)
//			System.out.println(a[index]);
//		else
//			System.out.println("No element found.");
//	}
	
	
	
}
