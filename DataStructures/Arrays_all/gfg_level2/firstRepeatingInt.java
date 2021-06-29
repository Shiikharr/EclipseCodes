package gfg_level2;

import java.util.HashSet;
import java.util.Set;

public class firstRepeatingInt {

//	Given an array of integers, find the first repeating element in it. 
//	We need to find the element that occurs more than once and whose index of first occurrence is smallest. 
//
//	Examples: 
//
//	Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
//	Output: 5 [5 is the first element that repeats]
//
//	Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
//	Output: 6 [6 is the first element that repeats]
	
	public static void main(String[] args) {
		
		int a[]= {10, 5, 3, 4, 3, 5, 6};
		findFirstRepeating(a,a.length);
		System.out.println();
		int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		findFirstRepeating(arr,arr.length);

	}

    private static void findFirstRepeating(int[] a, int n) 
    {
    	Set<Integer> set=new HashSet<>();
    	
    	for(int i=0;i<n;i++)
    	{
    		if(set.contains(a[i]))
    		{
    			System.out.println("The first repeating element is:"+a[i]);
    			break;
    		}
    		else
    		set.add(a[i]);
    	}
    }

}
