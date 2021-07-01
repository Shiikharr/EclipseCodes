package Arrays;
import java.io.*;
import java.util.Arrays;
import java.util.Stack;
public class MergeIntervals {

//	Merge Overlapping Intervals
//	Difficulty Level : Medium
//	Last Updated : 10 Mar, 2021
//	Given a set of time intervals in any order, merge all overlapping intervals into one 
//	and output the result which should have only mutually exclusive intervals. 
//	Let the intervals be represented as pairs of integers for simplicity. 
//	For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8}}. 
//	The intervals {1,3} and {2,4} overlap with each other, so they should be merged and 
//	become {1, 4}. Similarly, {5, 7} and {6, 8} should be merged and become {5, 8}
	
	public static class Pair implements Comparable<Pair>
	{
		int st;
		int et;
		
		Pair(int st,int et)
		{
			this.st=st;
			this.et=et;
		}

		@Override
//		for comparison of the two objects
//		this > other  return +ve
//		this = other  return 0
//		this < other  return -ve
		public int compareTo(Pair other) {
			if(this.st!=other.st)
				return this.st-other.st;
			else
				return this.et-other.et;
		}
	}
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int [n][2];
		for(int j=0;j<n;j++)
		{
			String line=br.readLine();
			a[j][0]=Integer.parseInt(line.split(" ")[0]);
			a[j][1]=Integer.parseInt(line.split(" ")[0]);
		}
		mergeOverlapping(a);
	}

	private static void mergeOverlapping(int[][] a) 
	{
		Pair pairs[]=new Pair[a.length];
		for(int i=0;i<a.length;i++)
		{
			pairs[i]=new Pair(a[i][0],a[i][1]);
		}
		Arrays.sort(pairs);
		Stack<Pair> stack=new Stack<Pair>();
		for(int i=0;i<pairs.length;i++)
		{
			if(i==0)
				stack.push(pairs[i]);
			else
			{
				Pair top=stack.peek();
				if(pairs[i].st > top.et)
				{
					stack.push(pairs[i]);
				}
				else
				{
					top.et=Math.max(top.et, pairs[i].et);
				}
			}
		}
		Stack<Pair> Resultstack= new Stack<Pair>();
		while(stack.size() > 0)
			Resultstack.push(stack.pop());
		
		while(Resultstack.size() > 0)
		{
			Pair p=Resultstack.pop();
			System.out.println(p.st + " " + p.et);
		}
	}
	
}
