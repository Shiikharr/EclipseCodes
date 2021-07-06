package Stacks;
import java.util.*;
public class nextGreaterElement {

//	Given an array arr[ ] of size N having distinct elements, 
//	the task is to find the next greater element for each element of 
//	the array in order of their appearance in the array.
//	Next greater element of an element in the array is the nearest 
//	element on the right which is greater than the current element.
//	If there does not exist next greater of current element, then 
//	next greater element for current element is -1. For example, 
//	next greater of the last element is always -1.
//
//	Example 1:
//
//	Input: 
//	N = 4, arr[] = [1 3 2 4]
//	Output:
//	3 4 4 -1
//	Explanation:
//	In the array, the next larger element 
//	to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
//	since it doesn't exist, it is -1.
	
	public static void main(String[] args) {
		
		int a[]= {1,3,2,4};
		findnext(a,a.length);
		
	}

	private static void findnext(int[] a, int n) {
	
		Stack<Integer>stack=new Stack<>();
		int x[]=new int[n];
		Arrays.fill(x, -1);
		for(int i=0;i<n;i++)
		{
			while(!stack.isEmpty() && a[stack.peek()]<a[i])
				x[stack.pop()]=a[i];
			stack.push(i);
		}
		for(int i=0;i<n;i++)
			System.out.print(x[i]+" ");
	}

}
