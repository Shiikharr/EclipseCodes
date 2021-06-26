package Arrays;

public class MovezeroEnd {

	
	public void move(int a[],int start,int end)
	{
		while(start<end)
		{
			if(a[start]==0)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				end--;
			}
			start++;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public void move2(int a[],int n)
	{
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0 && a[j]==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(a[j]!=0)
				j++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	
	public static void main(String args[])
	{
		MovezeroEnd ob=new MovezeroEnd();
		int a[]= {0,3,0,5,6,7,0,2,4};
		System.out.println("New array after moving zero to the end is:");
		ob.move(a, 0, a.length-1);
		System.out.println("\nNew array after moving zero to the end by method 2 is:");
		ob.move2(a, a.length);
		
		int b[]= {8,1,0,2,1,0,3};
		System.out.println("\nNew array after moving zero to the end is:");
		ob.move(b, 0, b.length-1);
		System.out.println("\nNew array after moving zero to the end by method 2 is:");
		ob.move2(b, b.length);
		
		
	}
}
