package dynamic;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		
		String x="AABEBCDD";
		System.out.println("The length of longest repeating subsequence is: "+Repeat(x));
		System.out.println("And the longest repeating subsequence is: "+Print(x));
	}
	static int t[][];
	private static int Repeat(String x) {
		String y=x;
		int n=x.length(),m=y.length();
		 t=new int[n+1][m+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				if(i==0 || j==0)
					t[i][j]=0;
				else if(x.charAt(i-1) == y.charAt(j-1) && i!=j)
					t[i][j]=1+t[i-1][j-1];
				else
					t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		return t[n][m];
	}
	private static String Print(String x)
	{
		String y=x;
		int n=x.length(),m=y.length();
		int i=n,j=m; String s="";
		while(i>0 && j>0)
		{
			if(x.charAt(i-1)==y.charAt(j-1) && i!=j)
			{
				s+=x.charAt(i-1);
				i--; j--;
			}
			else if(t[i][j-1]> t[i-1][j])
			{
				j--;
			}
			else
				i--;
		}
		return reverse(s);
	}
	private static String reverse(String s) 
	{
		char ch[]=s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}

}
