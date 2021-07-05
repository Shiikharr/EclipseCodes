package Strings;

public class AllPermutationOfAString {

	public static void main(String[] args) {
		String s="abc";
		int l=0;
		int r=s.length()-1;
		permutation(s,l,r);

	}

	private static void permutation(String s, int l, int r) 
	{	
		if(l==r)
		{
			System.out.print(s+" ");
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s=swap(s,l,i);
			permutation(s,l+1,r);
			s=swap(s,l,i);
		}
	}

	static String swap(String str, int i, int j)
    {
		char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
