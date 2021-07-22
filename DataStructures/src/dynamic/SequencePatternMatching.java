package dynamic;

public class SequencePatternMatching {
	
	//check if a string is present completely in another string and is in sequence or not
	
	public static void main(String[] args) {
		String x="AXY";
		String y="ADXCPY";
		System.out.println("The sequence pattern matching value: "+pattern(x,y,x.length(),y.length()));

	}

	private static boolean pattern(String x, String y, int n, int m) {
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
		return t[n][m]==Math.min(n, m);
	}

}
