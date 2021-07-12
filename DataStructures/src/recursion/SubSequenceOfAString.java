package recursion;

public class SubSequenceOfAString {

	public static void main(String[] args) {

		String s="abc";
		String current="";
		int i=0;
		subSequence(s,i,current);

	}

	private static void subSequence(String s, int i, String current) {
		
		if(i==s.length())
		{
			System.out.print("{"+current +"}");
			return;
		}
		subSequence(s,i+1,current+s.charAt(i));
		subSequence(s,i+1,current);
		
	}

}
