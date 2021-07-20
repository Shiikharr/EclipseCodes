package dynamic;

public class MinCoinChangeProb {

	public static int MinCoin(int coin[],int N,int x)
	{
		int t[][]=new int [x+1][N+1];
		for(int i=0;i<x+1;i++)
		{
			for(int j=0;j<N+1;j++)
			{
				if(j==0)
					t[i][j]=0;
				if(i==0)
					t[i][i]=Integer.MAX_VALUE;
			}
		}
		//initialize the second row as well;
		for(int j=1;j<N+1;j++)
		{
			if(j%coin[0]==0)
				t[1][j]=j/coin[0];
			else
				t[1][j]=Integer.MAX_VALUE-1;
		}
		for(int i=2;i<x+1;i++)
		{
			for(int j=1;j<N+1;j++)
			{
				if(coin[i-1]<=j)
					t[i][j]=Math.min(t[i-1][j], t[i][j-coin[i-1]]+1);
				else
					t[i][j]=t[i-1][j];
			}
		}
		return t[x][N];
	}
	
	public static void main(String[] args) {

		int coins[] = {9, 6, 5, 1}; 
		int V = 11;
		System.out.println(MinCoin(coins, V, coins.length));
	}

}
