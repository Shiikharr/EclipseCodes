package Strings;

public class AllsubstringsOfString {

	//it is also called as power set of a given string
	
	public static void main(String[] args) {

		String s="abc";
		String current="";
		int i=0;
		printsub(s,i,current);

	}

	private static void printsub(String s, int i, String current) {
		
		if(i==s.length())
		{
			System.out.print("{"+current+"}");
			return;
		}
		
		printsub(s,i+1,current+s.charAt(i));
		printsub(s,i+1,current);
		
	}

}
