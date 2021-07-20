package dynamic;

public class LongestCommonSubsequencePrint {

	public static void main(String[] args) {
		
		String x="shikhar";
		String y="ayushi";
		System.out.println("Longest Common Subsequence recursive is: "+LCSPrint(x,y,x.length(),y.length()));

	}

	private static String LCSPrint(String x, String y, int n, int m) {
		int t[][]=new int [n+1][m+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				if(i==0 || j==0)
					t[i][j]=0;
				else if(x.charAt(i-1) == y.charAt(j-1))
					t[i][j]=1+t[i-1][j-1];
				else
					t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		int i=n, j=m; String s="";
		while(i>0 && j>0)
		{
			if(x.charAt(i-1)==y.charAt(j-1))
			{
				s+=x.charAt(i-1);
				i--;
				j--;
			}
			else
			{
				if(t[i][j-1] > t[i-1][j])
					j--;
				else
					i--;
			}
		}
		return reverse(s);
	}

	private static String reverse(String s) {
		char c[]=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j)
		{
			char ch=c[i];
			c[i]=c[j];
			c[j]=ch;
			i++;
			j--;
		}
		return String.valueOf(c);
	}

}
