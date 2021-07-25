package dynamic;

public class minInsertionToMakeItPalindrome {

	public static void main(String[] args) {
		
		String x="abcda";
		System.out.println("The minimum insertions to make it palindrome is: "+palin(x));

	}

	private static int palin(String x) {
		String y=reverse(x);
		return MinInsertion(x,y,x.length(),y.length());
	}

	private static int MinInsertion(String x, String y, int n, int m) {
		int t[][]=new int[n+1][m+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				if(i==0 || j==0)
					t[i][j]=0;
				else if(x.charAt(i-1)==y.charAt(j-1))
					t[i][j]=1+t[i-1][j-1];
				else
					t[i][j]=Math.max(t[i-1][j], t[j-1][i]);
			}
		}
		return n-t[n][m];
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
