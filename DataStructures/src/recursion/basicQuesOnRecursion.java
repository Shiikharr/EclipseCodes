package recursion;

public class basicQuesOnRecursion {
	static int steps=0;
	public static void main(String[] args) {

		int n=5;
		System.out.println(sum(n));
		int a=2,b=5;
		System.out.println(pow(a,b));
		System.out.println(fastPower(a,b));
		System.out.println("Steps"+steps);
		System.out.println("The number of paths are:"+path(4,4));
	}
	
	public static int path(int n,int m)
	{
		if(n==1 || m==1)
			return 1;
		return path(n,m-1)+path(n-1,m);
	}
	
	//This method will take b+1 steps i.e O(n)
	private static int pow(int a, int b) {
		if(b==0)
			return 1; 
		return a*pow(a,b-1);
		
	}
	//to solve this in log n times we have to know that
	//a^b = (a^2)^b/2  or  (a^b/2)^2 	we will use this maths to solve it on logn times
	//if b is even => 3^7= 3 * 3^6  and 3^6= (3^2)^3
	private static int fastPower(int a, int b) {
		steps++;
		if(b==0)
			return 1;
		if(b%2==0)
			return fastPower(a*a,b/2);
		else
			return a*fastPower(a,b-1);
	}
	
	
	private static int sum(int n) {
		if(n==1)
			return 1;
		return (n+sum(n-1));
	}  

}
