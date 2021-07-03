package Arrays;

public class stockBuySellSecond {

	public static void main(String[] args) {
		
		int a[]= {5,2,6,1,4,7,3,6};
		stocksecond(a,a.length);
	}

	private static void stocksecond(int[] a, int n) {
		
		int profit=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				profit+=(a[i+1]-a[i]);
				System.out.println("Buy at day "+i+" and sell at day "+(i+1)+" And current profit is "+profit);
			}
		}
		System.out.println("Total profit is: "+profit);
	}

}
