package recursion;

public class TowerOfHanoi {

	
	public void toh(int n, char A,char B,char C)
	{
		if(n==0)
			return;
		toh(n-1,A,C,B);
		System.out.println("["+A+" -> "+B+"]");
		toh(n-1,C,B,A);
	}
	
	
	
	public static void main(String args[])
	{
		TowerOfHanoi ob=new TowerOfHanoi();
		int n=3;
		ob.toh(n,'A','B','C');
	}
}
