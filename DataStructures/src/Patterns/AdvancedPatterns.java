package Patterns;

public class AdvancedPatterns {

	public static void main(String[] args) {
		System.out.println("Pattern 1: \n");
		pattern1(5);
		System.out.println("Pattern 2: \n");
		pattern2(4);
		System.out.println("Pattern 3: \n");
		pattern3(4);
		System.out.println("Pattern 4: \n");
		pattern4(5);
	}

	private static void pattern4(int n) {
		for(int i=0;i<n;i++)
		{
			if(i==0 || i==n-1)
			{
				for(int j=0;j<=i;j++)
					System.out.print("* ");
			}
			if(i>0 && i<n-1)
			{
				System.out.print("* ");
				for(int j=0;j<i-1;j++)
					System.out.print("  ");
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(k++ +"   ");
			}
			System.out.println();
		}
	}

	private static void pattern1(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
