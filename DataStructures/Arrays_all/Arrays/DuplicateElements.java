package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	//for this method the time complexity is O(n2)
	
	public void duplicate(int a[])
	{
		int n=a.length;
		System.out.print("{");
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.print("}\n");
	}
	
	//We are going to use set data structure
	//Set is an unordered collection of objects in which duplicate values cannot be stored.
	//Set is an interface and it is implemented by HashSet, LinkedHashSet or TreeSet class.
	
	
	public void duplicate2(int a[])
	{
		Set<Integer> uniqueNumber=new HashSet<>();
		boolean duplicateExist= false;
		
		for(int i=0;i<a.length;i++)
		{
			if(uniqueNumber.contains(a[i])) {
				duplicateExist=true;
				System.out.println("Duplicate elements are:"+a[i]);
			}
			else
			{
				uniqueNumber.add(a[i]);
			}
		}
		if(!duplicateExist)
		{
			System.out.println("No duplicate exists.");
		}
	}
	
	public static void main(String args[])
	{
		DuplicateElements ob=new DuplicateElements();
		int a[]= {1,5,4,2,1,4,7,7};
		ob.duplicate(a);
		ob.duplicate2(a);
	}
}
