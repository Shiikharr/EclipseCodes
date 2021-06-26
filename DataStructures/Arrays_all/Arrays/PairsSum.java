package Arrays;

public class PairsSum {

	//time complexity=O(n2)
	
	public void findpairs(int a[],int sum)
	{
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	
	/**
	 * for minimum time complexity lets assume that array is sorted 
	 * so we would follow the following steps 
	 */
	public void findpairs2(int a[],int sum)
	{
		int start=0,end=a.length-1;
		while(start<end)
		{
			if(a[start]+a[end]>sum)
				end--;
			else if(a[start]+a[end]<sum)
				start++;
			else if(a[start]+a[end]==sum)
			{
				System.out.println(a[start]+" "+a[end]);
				start++;
				end--;
				}
			
		}
	}
	
	public static void main(String args[])
	{
		PairsSum ob=new PairsSum();
		int a[]= {1,2,3,4,5,6,7};
		int sum=9;
		//method1
		ob.findpairs(a, sum);
		//method2
		ob.findpairs2(a,sum);
		
	}
}
