package gfg_level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingNumber {

	
//	Find the first non-repeating element in a given array of integers.
//
//	Examples:
//
//	Input : -1 2 -1 3 2
//	Output : 3
//	Explanation : The first number that does not 
//	repeat is : 3
//
//	Input : 9 4 9 6 7 4
//	Output : 6
	
	public static void main(String[] args) {
		int a[]= {-1, 2, -1, 3 ,2};
		int b[]= {9 ,4, 9 ,6 ,7, 4};
		int c[]= {1,2,3,2,1,3,4,5,6,6};
		firstNonRepeat(a,a.length);
		firstNonRepeat(b,b.length);
		firstNonRepeat(c,c.length);
	}

	private static void firstNonRepeat(int[] a, int n) 
	{
		
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			int count =map.getOrDefault(a[i], 0);
			map.put(a[i], count + 1);
		}
		System.out.println(map);
		for(int i=0;i<n;i++)
		{
			if(map.get(a[i])==1)
			{
				System.out.println("The first non-repeating element is :"+a[i]);
				break;
			}
		}
			
	
	}

}
