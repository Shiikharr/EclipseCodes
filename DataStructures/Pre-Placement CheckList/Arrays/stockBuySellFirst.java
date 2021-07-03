package Arrays;

public class stockBuySellFirst {
	
//	Stock Buy Sell to Maximize Profit
//	
//	The cost of a stock on each day is given in an array, find the max profit that you can 
//	make by buying and selling in those days. For example, 
//	if the given array is {100, 180, 260, 310, 40, 535, 695}, 
//	the maximum profit can earned by buying on day 0, selling on day 3. 
//	Again buy on day 4 and sell on day 6. If the given array of prices is 
//	sorted in decreasing order, then profit cannot be earned at all.

	public static void main(String args[])
	{
		int a[]= {100, 180, 260, 310, 40, 535, 695};
		stockbuy(a,a.length);
	}

	//time complexity is O(n) and space O(1)
	private static void stockbuy(int[] a, int n) 
	{
		int minSoFar=a[0],maxProfit=0;
		for(int i=0;i<n;i++)
		{
			minSoFar=Math.min(a[i], minSoFar);
			int profit=a[i]-minSoFar;
			maxProfit=Math.max(profit,maxProfit);
		}
		System.out.println("The maximum profit is:"+maxProfit);
	}
	
//	//brute-force approach time complexity is O(n^2)
//	private static void stockbuy(int[] a, int n) {
//		
//		int max=Integer.MIN_VALUE;
//		int sum=0,Endindex=0,startIndex=0;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				sum=a[j]-a[i];
//				if(sum>max) 
//				{
//					startIndex=i;
//					Endindex=j;
//					max=sum;
//				}
//			}
//		}
//		System.out.println("The maximum profit earned is:"+max);
//		System.out.println("the stocks should be purchased on day "+startIndex+" at cost "+a[startIndex]);
//		System.out.println("the stocks should be sold on day "+Endindex+" at cost "+a[Endindex]);
//	}
	
}
