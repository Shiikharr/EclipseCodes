package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Here we have to sort the array elements in descending order of their frequency.
 * If any two or more elements have same frequency then print element which comes first.
 * 
 * example
 * 
 * a[]={5,3,4,5,8,1,1,5}
 * output={5,5,5,1,1,3,4,8}
 * 
 * b[]={8,2,3,4,8,2,8,2,4,5,2,9,3}
 * output={2,2,2,2,8,8,8,3,3,4,4,5,9}
 *
 */


public class SortElementsByFrequency {
	
	public List<Integer> sortfreq(int a[])
	{
		List<Integer>li=new ArrayList<>();
		//we are using linkedhashmap because if elements have same frequency then the element which comes first should be printed first
		//in simple words it is used to maintain the insertion order
		
		Map<Integer,Integer> count=new LinkedHashMap<>();
		
		//now we will traverse the array and store each element and its count in a map
		
		for(int i=0;i<a.length;i++)
		{
			count.put(a[i], count.getOrDefault(a[i], 0)+1);
		}
		
		//now we will sort this
		
		count.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).forEach(record -> {
			int key=record.getKey();
			int value=record.getValue();
			
			for(int i=0;i<value;i++)
			{
				li.add(key);
			}
		});
		return li;
	}
	
	public static void main(String args[])
	{
		SortElementsByFrequency ob=new SortElementsByFrequency();
		int a[]={5,3,4,5,8,1,1,5};
		System.out.print(ob.sortfreq(a));
		
		int b[]={8,2,3,4,8,2,8,2,4,5,2,9,3};
		System.out.print("\n"+ob.sortfreq(b));
	}
}
