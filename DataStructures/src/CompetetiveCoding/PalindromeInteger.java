package CompetetiveCoding;

public class PalindromeInteger {

	/**
	 * 
	 * Asked in:HCL
	 * 
	 * Determine whether an integer is a palindrome. Do this without extra space.
	 * A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
	 * Negative numbers are not palindromic.
	 * 
	 * Input : 12121
	 * Output : True
	 * 
	 * Input : 123
	 * Output : False
	 */
	
	
	public int palinn (int a)
	{
		int copy=a;
		int r=0,sum=0;
		while(a!=0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		if(sum==copy)
			return 1;
		else
			return 0;
	}
	
	public static void main(String args[])
	{
		PalindromeInteger ob=new PalindromeInteger();
		boolean x=false;
		int n=12121;
		if(ob.palinn(n)==1)
		{
			x=true;
			System.out.println(x);
		}
		else
			System.out.println(x);
	}
	
}
