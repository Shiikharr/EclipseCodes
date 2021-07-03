package Arrays;

public class StockBuySellThird {

	public static void main(String[] args) {
		
		int a[]= {3,3,5,0,0,3,1,4};
		stockThird(a,a.length);

	}

	private static void stockThird(int[] a, int n) {
		
		int fb=Integer.MIN_VALUE, sb=Integer.MIN_VALUE;
		int fs=0,ss=0;
		for(int i=0;i<n;i++)
		{
			fb=Math.max(fb, -a[i]);
			fs=Math.max(fs, fb+a[i]);
			sb=Math.max(sb, fs-a[i]);
			ss=Math.max(ss, sb+a[i]);
		}
		System.out.println("The max profit is: "+ss);
		
	}

}
