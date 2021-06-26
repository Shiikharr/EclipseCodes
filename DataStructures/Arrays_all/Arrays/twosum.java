package Arrays;

public class twosum {

	
	public void sumprob(int a[],int target)
	{
		int i,j,index1=0,index2=0;
		
		for(i=0;i<a.length;i++)
		{
			for(j=a.length-1;j>=0;j--)
			{
				if(a[i]+a[j]==target)
				{
					index1=i;
					index2=j;
					break;
				}
			}
		}
		System.out.println("["+index1+","+index2+"]");
	}
	
	public static void main(String args[])
	{
		twosum ob=new twosum();
		int a[]= {2,11,5,10,7,8};
		ob.sumprob(a, 17);
	}
}
