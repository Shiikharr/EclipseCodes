package dynamic;

public class CoinChangeProblem {

	public static int coinChange(int coin[],int N, int x)
	{
		int t[][]=new int[x+1][N+1];
		for(int i=0;i<x+1;i++)
		{
			for(int j=0;j<N+1;j++)
			{
				if(i==0)
					t[i][j]=0;
				if(j==0)
					t[i][j]=1;
			}
		}
		for(int i=1;i<x+1;i++)
		{
			for(int j=1;j<N+1;j++)
			{
				if(coin[i-1]<=j)
					t[i][j]=t[i-1][j] + t[i][j-coin[i-1]];
				else
					t[i][j]=t[i-1][j];
			}
		}
		return t[x][N];
	}
	
	//similar to knapsack unbounded and subset count problem
	public static void main(String[] args) {
		
		int coin[]= {2, 5, 3, 6};
		int N=10;
		System.out.println("No of ways to make the change is: "+coinChange(coin,N,coin.length));

	}

}
