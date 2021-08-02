package Patterns;

public class BasicPatterns {

	public static void main(String[] args) {
		
		System.out.println("Pattern 1: \n");
		pattern1(5);
		System.out.println("Pattern 2: \n");
		pattern2(5);
		System.out.println("Pattern 3: \n");
		pattern3(5);
		System.out.println("Pattern 4: \n");
		pattern4(5);
		System.out.println("Pattern 5: \n");
		pattern5(5);
	}

	private static void pattern5(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern4(int n) {
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern2(int n) {
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern1(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
