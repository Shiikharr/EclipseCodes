package dynamic;

public class MinDeletionToMakePalindrome {

	public static void main(String[] args) {
		
		String x="geeksforgeeks";
		System.out.println("Minimum deletion is: "+minDel(x));

	}

	private static int minDel(String x) {
		
		String y=reverse(x);
		int lps=LPS(x,y,x.length(),y.length());
		return x.length()-lps;
	}

	private static int LPS(String x, String y, int n, int m) {
		int t[][]=new int[n+1][m+1];
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
		return t[n][m];
	}

	private static String reverse(String x) {
		char ch[]=x.toCharArray();
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
