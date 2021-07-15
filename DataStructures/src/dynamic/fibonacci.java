package dynamic;

import java.util.Arrays;

public class fibonacci {

	public static void main(String[] args) {
		
		int n=6;
		int qb[]=new int[n+1];
		System.out.println(fibo(n,qb));
		System.out.println(Arrays.toString(qb));
	}
		
	public static int fibo(int n,int qb[])
	{
		if(n==0 || n==1)
			return n;
		if(qb[n]!=0)
			return qb[n];
		int f1=fibo(n-1,qb);
		int f2=fibo(n-2,qb);
		int fib=f1+f2;
		qb[n]=fib;
		return fib;
	}
}
