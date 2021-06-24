package Arrays;

public class sortzeroonetwo {

	private void sort(int a[])
	{
		int t=0,z=0,o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==2)
				t++;
			else if(a[i]==0)
				z++;
			else if(a[i]==1)
				o++;
		}
		for(int i=0;i<z;i++)
		{
			a[i]=0;
		}
		for(int i=z;i<o+z;i++)
		{
			a[i]=1;
		}
		for(int i=o+z;i<o+z+t;i++)
		{
			a[i]=2;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		sortzeroonetwo ob=new sortzeroonetwo();
		int a[]= {0,1,1,0,1,2,0,1,2};
		ob.sort(a);
	}
	
}
