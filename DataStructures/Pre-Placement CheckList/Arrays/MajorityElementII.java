package Arrays;

public class MajorityElementII {

	public static void main(String args[])
	{
		int a[]= {1,1,1,3,3,2,2};
		findMajorityII(a,a.length);
	}

	private static void findMajorityII(int[] a, int n) {
		int num1=0;
		int num2=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++)
		{
			if(a[i] == num1)
				count1++;
			else if(a[i]== num2)
				count2++;
			else if(count1==0)
			{
				num1=a[i];
				count1=1;
			}
			else if(count2==0)
			{
				num2=a[i];
				count2=1;
			}
			else
			{
				count1--;
				count2--;
			}
		}
		int c1=0,c2=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==num1)
				c1++;
			else if(a[i]==num2)
				c2++;
		}
		if(c1> n/3)
			System.out.println(num1);
		if(c2> n/3)
			System.out.println(num2);
	}
}
