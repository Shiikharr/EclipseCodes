package dynamic;

import java.util.Arrays;

public class PalindromePartitioning {

	public static void main(String[] args) {
		String s="ababbbabbababa";
		System.out.println("The minimum Number of palindrome partitions by recursion are: "+partition(s,0,s.length()-1));
		int t[][]=new int[s.length()][s.length()];
		for(int i[]:t)
		{
			Arrays.fill(i, -1);
		}
		System.out.println("The minimum Number of palindrome partitions by top down are: "+partitionTopDown(s,0,s.length()-1,t));
	}
	
	private static int partitionTopDown(String s, int i, int j, int[][] t) {
		if(i>=j)
			return 0;
		if(isPalin(s,i,j)==true)
			return 0;
		if(t[i][j]!=-1)
			return t[i][j];
		t[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<=j-1;k++)
		{
			t[i][j]=Math.min(t[i][j], partitionTopDown(s,i,k,t) + partitionTopDown(s,k+1,j-1,t)+1);
		}
		return t[i][j];
	}

	private static int partition(String s, int i, int j) {
		if(i>=j)
			return 0;
		if(isPalin(s,i,j)==true)
			return 0;
		int ans=Integer.MAX_VALUE;
		for(int k=i;k<=j-1;k++)
		{
			int temp=partition(s,i,k) + partition(s,k+1,j-1) + 1;
			ans=Math.min(ans, temp);
		}
		return ans;
	}

	private static boolean isPalin(String s, int i, int j) {
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
