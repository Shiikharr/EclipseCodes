package CompetetiveCoding;

import java.util.Arrays;

public class SieveOfEratosthenes {

	
	public static void main(String args[])
	{
		int n=50;
		boolean isPrime[]=seive(n);
		for(int i=0;i<n;i++)
		{
			if(isPrime[i]==true)
			System.out.println(i+" "+ isPrime[i]);
		}
		
	}

	//Made this function just to check the sqrt(n) concept. It is not required in this question
	private static boolean isPrime(int n) {
		int k=(int)Math.sqrt(n); //We can write i*i instead of this
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	//we will return all the prime numbers between 2-n
	private static boolean[] seive(int n)
	{
		boolean isPrime[]=new boolean[n+1];
		//assign value true to all the indexes
		Arrays.fill(isPrime,true);//This will fill all the values as true in the array
		
		isPrime[0]=false;
		isPrime[1]=false;
		
		for(int i=2;i*i<=n;i++)
		{
			for(int j=2*i; j<=n; j+=i)
			{
				isPrime[j] = false;
			}
		}
		return isPrime;
	}
}
