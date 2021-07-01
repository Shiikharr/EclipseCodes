package gfg_level2;
import java.math.BigInteger;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
		
		int n=100;
		factorial(n);

	}

	//Using Big Integer
//	private static void factorial(int n) 
//	{
//		BigInteger res=BigInteger.ONE;
//		for(int i=2;i<=n;i++)
//		{
//			res=res.multiply(BigInteger.valueOf(i));
//		}
//		System.out.print(res);
//	}
	
	//using arrays
	private static void factorial(int n)
	{
		int a[]=new int[100000];
		int q=2, len=1, x=0;
		a[0]=1;
		int num=0;
		while(q<=n)
		{
			x=0;
			num=0;
			while(x<len)
			{
				a[x]=a[x]*q;
				//adding carry
				a[x]=a[x]+num;
				num=a[x]/10;
				a[x]=a[x]%10;
				x++;
			}
			while(num!=0)
			{
				a[len]=num%10;
				num=num/10;
				len++;
			}
			q++;
		}
		len--;
		for(int i=len;i>=0;i--)
		{
			System.out.print(a[i]+"");
		}
	}

}
