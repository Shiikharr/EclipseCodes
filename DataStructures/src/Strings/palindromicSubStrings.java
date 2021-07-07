package Strings;

public class palindromicSubStrings {

	public static void main(String[] args) {

		String s="aaaa";
		String current="";
		int index=0;
		palinsubstring(s,index,current);
	}
	
	public static void palinsubstring(String s,int i,String current)
	{	
		if(i==s.length())
		{
			if(palin(current)==true)
			{	
				System.out.print(current+" ");
			}
			return;
		}
		palinsubstring(s,i+1, current+s.charAt(i));
		palinsubstring(s,i+1,current);
		
	}
	
	public static boolean palin(String s)
	{
		char ch[]=s.toCharArray();
		boolean x=true;
		int start=0,end=ch.length-1;
		while(start<end)
		{
			if(ch[start]==ch[end])
			{
				start++;
				end--;
				continue;
			}
			else
			{
				x=false;
				break;
			}
		}
		return x;
	}
}
