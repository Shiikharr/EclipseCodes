package CompetetiveCoding;

import java.util.ArrayList;

public class MaxUnsortedSubarray {

	/**
	 * 
	 * Here we have to return the first and  last index of the subarray
	 * which is unsorted and if we sort that subarray then our whole 
	 * array will be sorted.
	 * If the array is already sorted then we have to return -1
	 * 
	 * Example-
	 * a[]={1,3,2,4,5}
	 * output- [1,2]
	 * 
	 * now if we will sort the indexes 1,2 we will get a sorted array
	 * 
	 * b[]={1,2,3,4,5}
	 * output- -1
	 */
	
	public ArrayList<Integer> Unsortedsub(int a[])
	{
		int start = -1;
        int end = -1;
        int i = 0;
        int n = a.length;
        ArrayList<Integer> arr = new ArrayList<>();

        while (i < n-1) {
            if (a[i] > a[i+1]) 
            {
                start = i;
                end = n-1;

                while (end > start) 
                {
                    if (a[end] < a[end-1]) 
                    {
                        while (end < n-1) 
                        {
                            if (a[end]!=a[end+1]) break;
                            end++;
                        }
                        break;
                    }
                    end--;
                }
                break;
            }
            i++;
        }

        if (start == -1 && end == -1) {
            arr.add(-1);
            return arr;
        }
        
        int min = a[start];
        int max = a[end];
        int minIdx = start;
        
        while (minIdx <= end) {
            min = Math.min(min, a[minIdx]);
            max = Math.max(max, a[minIdx]);
            minIdx++;
        }

        for (i=0;i<start; i++) {
            if (a[i] > min) {
                start = i;
                break;
            }
        }

        for (i=n-1; i > end; i--) {
            if (a[i] < max) {
                end = i;
                break;
            }
        }
        arr.add(start);
        arr.add(end);
        return arr;
			
	}
	
	public static void main(String args[])
	{
		MaxUnsortedSubarray ob=new MaxUnsortedSubarray();
		int a[]={1,2,4,3,5};
		System.out.println(ob.Unsortedsub(a));
		int b[]={1,2,3,4,5};
		System.out.println(ob.Unsortedsub(b));
	}
}
