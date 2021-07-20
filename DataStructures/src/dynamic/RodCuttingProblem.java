package dynamic;

public class RodCuttingProblem {

	public static int rodCut(int len[],int price[],int N, int x)
	{
		int t[][]=new int[x+1][N+1];
		for(int i=0;i<x+1;i++)
		{
			for(int j=0;j<N+1;j++)
			{
				if(i==0 || j==0)
					t[i][j]=0;
			}
		}
		for(int i=1;i<x+1;i++)
		{
			for(int j=1;j<N+1;j++)
			{
				if(len[i-1]<=j)
					t[i][j]=Math.max(t[i-1][j], price[i-1]+t[i][j-len[i-1]]);
				else
					t[i][j]=t[i-1][j];
			}
		}
		return t[x][N];
	}
	
	
	public static void main(String args[])
	{
		int length[]= {1,2,3,4,5,6,7,8};
		int price[]= {3, 5, 8, 9, 10, 17, 17, 20};
		int N=8;
		System.out.println("Max Profit is: "+rodCut(length,price,N,length.length));
	}
}
