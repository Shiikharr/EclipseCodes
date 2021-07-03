package Strings;



public class RemoveSpecialChars {

	public static void main(String[] args) {
		String s="$ja!va$st%ar";
		
		String s2="   j   a  v   a  s    t  a    r   ";
		remove(s,s2);
	}

	private static void remove(String s, String s2) {
		
		//aprroach 1
		String newstr=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newstr);	
		
		String news2=s2.replaceAll(" ", "");
		System.out.println(news2);
	}

}
