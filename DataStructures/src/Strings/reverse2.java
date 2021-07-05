package Strings;

public class reverse2 {

	public static void main(String[] args) {
		String s="Shikhar is a good boy";
		revers(s);

	}

	private static void revers(String s) {
		
		int i=s.length()-1;
		
		String st="";
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)==' ')
				i--;
			int j=i;
			if(i<0)
				break;
			while(i<=0 && s.charAt(i)!=' ')
				i--;
			if(st.isEmpty())
				st.concat(s.substring(i+1,j+1));
			else
				st.concat(" "+ s.substring(i+1,j+1));
		}
		System.out.println(st);
	}

}
