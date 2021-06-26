package Arrays;

import java.util.HashSet;
import java.util.Set;

public class reoccurence {

	
	/**
	 * GOOGLE INTERVIEW QUESTION
	 *We have to find first recurring number for example
	 *
	 * a[]={1,3,4,1,3,4,6}
	 * output= 1
	 * 
	 * b[]={1,3,3,1,4,6}
	 * output= 3
	 * 
	 * c[]={2,3,4,5,6,4,2}
	 * output = 4
	 */
	
	public void reoccur(int a[])
	{
		Set<Integer> unique=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(unique.contains(a[i]))
			{
				System.out.println("The first reoccuring number is: "+a[i]);
				break;
			}
			else
			{
				unique.add(a[i]);
			}
		}
	}
	public static void main(String args[])
	{
		reoccurence ob=new reoccurence();
		int a[]= {1,3,4,1,3,4,6};
		ob.reoccur(a);
		int b[]= {1,3,3,1,4,6};
		ob.reoccur(b);
		int c[]= {2,3,4,5,6,4,2};
		ob.reoccur(c);
		
	}
}
