package recursion;

public class PalindromeString {

	public static void main(String[] args) {

		String s="racecar";
		int l=0,r=s.length()-1;
		System.out.println("The word is palindrome:"+palin(s,l,r));
	
	}

	private static boolean palin(String s, int l,int r) {
			if(l>=r)
				return true;
			if(s.charAt(l)!=s.charAt(r))
				return false;
			return palin(s,l+1,r-1);
	}

}
