package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted array where every element appears twice except for one element which appears once.
 * find the single element that appears only once
 * example
 *    a[]={1,1,2,3,3,4,4,8,8}
 *    output= 2
 *    b[]={3,3,7,7,10,11,11}
 *    output= 10
 */


public class ElementAppearOnce {

	public void reappear(int a[])
	{
		int res=0;
		
		Map<Integer, Integer>count=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			count.put(a[i], count.getOrDefault(a[i],0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:count.entrySet()) {
			if(entry.getValue()==1) {
				res=entry.getKey();
				break;
			}
		}
		System.out.println(res);
	}
	
	
	
	
	public static void main(String args[])
	{
		ElementAppearOnce ob=new ElementAppearOnce();
		int a[]= {1,1,2,3,3,4,4,8,8};
		ob.reappear(a);
		int b[]= {3,3,7,7,10,11,11};
		ob.reappear(b);
	}
}
