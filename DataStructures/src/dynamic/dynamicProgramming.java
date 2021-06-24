package dynamic;

public class dynamicProgramming {
	
	public int fiboRecusrsion(int n)
	{
		if(n==0)
			return 0; 
		if(n==1)
			return 1;
		return(fiboRecusrsion(n-1)+fiboRecusrsion(n-2));
	}
	
	public void bottomUp(int n)
	{
		int table[]=new int[n+1];
		table[0]=0;
		table[1]=1;
		for(int i=2;i<=n;i++)
		{
			table[i]=table[i-1]+table[i-2];
		}
		for(int i=0;i<table.length;i++)
		{
			System.out.print(table[i]+" ");
		}
	}
	
	public int topDown(int memo[],int n)
	{
		if(memo[n]==0) {
			if(n<2)
			{
				memo[n]=n;
			}
			else
			{
				memo[n]=topDown(memo,n-1)+topDown(memo,n-2);
			}
		}
		return memo[n];
		
	}

	
	public static void main(String args[])
	{
		dynamicProgramming ob=new dynamicProgramming();
		System.out.println("the fibo series by recursive approach is:");
		for(int i=0;i<=10;i++)
		{
			System.out.print(ob.fiboRecusrsion(i)+" ");
		}
		
		System.out.println("\nthe fibo series by bottum-up approach is:");
		ob.bottomUp(10);
		System.out.println("\nthe fibo series by top-down  approach is:");
		for(int i=0;i<=10;i++)
		{
			int a[]=new int[i+1];
			System.out.print(ob.topDown(a,i)+" ");
		}
	}
}
