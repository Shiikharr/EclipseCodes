package Arrays;

public class CommonElement {

	/**
	 * Here We are given 3 arrays and we have to find the common elements present in them
	 * 
	 * a[]={1,2,3,4,5,6}
	 * b[]={2,3,8,9,10}
	 * c[]={2,3,11,12,15}
	 * 
	 * output- { 2 , 3}
	 */
	
	public void approach1(int a[],int b[],int c[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
					if(a[i]==b[j] && b[j]==c[k])
						System.out.print(a[i]+" ");
				}
			}
		}
	}
	
	public void approach2(int a[],int b[], int c[]) 
	{
		int x=0,y=0,z=0;
		
		while(x<a.length  &&  y<b.length && z<c.length)
		{
			if(a[x]==b[y] && b[y]==c[z])
			{
				System.out.print(a[x]+" ");
				x++;
				y++;
				z++;
			}
			else if(a[x]>b[y])
				y++;
			else if(b[y]>c[z])
				z++;
			else
				x++;
		}
	}
	
	public static void main(String args[])
	{
		CommonElement ob=new CommonElement();
		int a[]= {1,5,10,20,40,80};
		int b[]= {6,7,20,80,100};
		int c[]= {3,4,15,20,30,70,80,120};
		System.out.println("Approach 1:");
		ob.approach1(a, b, c);
		System.out.println("\nApproach 2:");
		ob.approach2(a, b, c);
	}
	
}
