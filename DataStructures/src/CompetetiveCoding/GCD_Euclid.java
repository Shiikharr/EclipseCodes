package CompetetiveCoding;

public class GCD_Euclid {

	/**
	 * This basically returns the gcd in one line function, which is very important for competitive coding
	 * here a>b
	 * 
	 */
	public static void main(String args[])
	{
		int a=24;
		int b=60;
		System.out.print(gcd(a,b));
	}
	
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
}
