package CompetetiveCoding;
import java.util.ArrayList;
public class FirstMissingInteger {

	
	/**
	 * Given an unsorted integer array, find the first missing positive integer.
	 * Example:
	 * Given 
	 * [1,2,0] return 3,
	 * 
	 * [3,4,-1,1] return 2,
	 * 
	 * [-8, -7, -6] returns 1
	 * 
	 * Your algorithm should run in O(n) time and use constant space.
	 */
	
	public int fms(int arr[])
	{
		ArrayList<Integer>A =new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			A.add(arr[i]);
		int n = A.size();
	    int idx = 0;
	    while (idx < n) 
	    {
	      if (A.get(idx) == (idx + 1) || A.get(idx) <= 0 || A.get(idx) > n) 
	      {
	        idx++;
	        continue;
	        }
	      int idx1 = idx;
	      int idx2 = A.get(idx) - 1;
	      if (A.get(idx2) != A.get(idx1)) 
	      {
	        int temp = A.get(idx1);
	        A.set(idx1, A.get(idx2));
	        A.set(idx2, temp);
	      }
	      else
	      {
	        idx++;
	      }
	    }
	    idx = 0;
	    while (idx < n && A.get(idx) == idx + 1) 
	    {
	      idx++;
	    }
	    return idx + 1;
	}
	
	public static void main(String args[])
	{
		FirstMissingInteger ob=new FirstMissingInteger();
		int a[]= {1,2,0};
		int b[]= {3,4,-1,1};
		System.out.println(ob.fms(a));
		System.out.println(ob.fms(b));
		
	}
}
