package Arrays;

public class palindromeString {

	
	public boolean palin(String s)
	{
		char ch[]=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		
		while(start<end)
		{
			if(ch[start]!=ch[end])
				return false;
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		palindromeString ob=new palindromeString();
		String s="shikhar";
		String s2="mom";
		System.out.println("The string "+s+" is palindrome:"+ob.palin(s));
		System.out.println("The string "+s2+" is palindrome:"+ob.palin(s2));
		
	}
}
