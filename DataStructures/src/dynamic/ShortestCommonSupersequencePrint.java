package dynamic;

public class ShortestCommonSupersequencePrint {

	public static void main(String[] args) {
		String x = "AGGTAB",  y = "GXTXAYB";
		System.out.println("The shortest Common Supersequence is: "+SCSPrint(x,y,x.length(),y.length()));

	}
//similar to LCSPrint with little changes
	private static String SCSPrint(String x, String y, int n, int m) {
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
		int i=n, j=m;
		String s="";
		while(i>0 && j>0)
		{
			if(x.charAt(i-1) == y.charAt(j-1))
			{
				s+=x.charAt(i-1);
				i--;
				j--;
			}
			else
			{
				if(t[i][j-1] > t[i-1][j])
				{
					s+=y.charAt(j-1);
					j--;
				}
				else
				{
					s+=x.charAt(i-1);
					i--;
				}
			}
		}
		while(i>0)
		{
			s+=x.charAt(i-1);
					i--;
		}
		while(j>0)
		{
			s+=y.charAt(j-1);
			j--;
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
