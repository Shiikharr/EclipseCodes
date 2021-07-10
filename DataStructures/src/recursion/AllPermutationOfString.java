package recursion;

import java.util.HashSet;
import java.util.Set;

public class AllPermutationOfString {

	static Set<String> set=new HashSet<>();
	//if we have to find out only unique permutations then we will use a set
	
	public static void main(String[] args) {
		
		String s="aac";
		System.out.print("All the permutations are:  ");
		permutation(s,0,s.length()-1);
		System.out.println("\nUnique permutations are:  ");
		permutationUnique(s,0,s.length()-1);
	}

	private static void permutationUnique(String s, int l, int r) {
		
		if(l==r)
		{
			if(set.contains(s)) return;
			set.add(s);
			System.out.print(s+" ");
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s=interChangeChar(s,l,i);
			permutation(s,l+1,r);
			s=interChangeChar(s,l,i);
		}
	}

	private static void permutation(String s,int l,int r) {
		
		if(l==r)
		{
			System.out.print(s+" ");
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s=interChangeChar(s,l,i);
			permutation(s,l+1,r);
			s=interChangeChar(s,l,i);
		}
	}
	
	public static String interChangeChar(String s,int a,int b)
	{
		char ch[]=s.toCharArray();
		char t=ch[a];
		ch[a]=ch[b];
		ch[b]=t;
		return String.valueOf(ch);
	}
}
