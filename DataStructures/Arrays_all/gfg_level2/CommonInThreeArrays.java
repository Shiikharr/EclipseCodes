package gfg_level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommonInThreeArrays {

//	Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
//
//	Examples: 
//
//	Input: 
//	ar1[] = {1, 5, 10, 20, 40, 80} 
//	ar2[] = {6, 7, 20, 80, 100} 
//	ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
//	Output: 20, 80
//
//	Input: 
//	ar1[] = {1, 5} 
//	ar2[] = {3, 4, 5, 5, 10} 
//	ar3[] = {5, 5, 10, 20} 
//	Output: 5, 5
	
	public static void main(String args[])
	{
		int a[] = {1, 5, 10, 20, 40, 80} ;
		int b[] = {6, 7, 20, 80, 100} ;
		int c[] = {3, 4, 15, 20, 30, 70, 80, 120} ;
		findcommon(a,b,c);
		System.out.println();
		int ar1[] = {1,5,5} ;
		int ar2[] = {3, 4, 5, 5, 10} ;
		int ar3[] = {5,5, 10, 20} ;
		findcommon(ar1,ar2,ar3);
	}

    private static void findcommon(int[] a, int[] b, int[] c)
    {
    	int x=0,y=0,z=0;
    	ArrayList<Integer> ar=new ArrayList<>();
    	while(x<a.length && y<b.length && z<c.length)
    	{
    		if(a[x]==b[y] && a[x]==c[z])
    		{
    			ar.add(a[x]);
    			x++; y++; z++;
    		}
    		else if(a[x]<b[y])
    			x++;
    		else if(b[y]<c[z])
    			y++;
    		else
    			z++;
    	}
    	System.out.print(ar);
    }
}
