package Strings;

import java.util.Arrays;

public class reverseAString {

	public static void main(String[] args) {
		
		String s="i.like.this.program.very.much";
		reverse(s);

	}

	private static void reverse(String s) {
		
		String a[]=s.split("\\.");
		int start=0,end=a.length-1;
		while(start<end)
		{
			String t=a[start];
			a[start]=a[end];
			a[end]=t;
			start++;
			end--;
		}
		String st="";
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
	            st+=a[i];
	       else
	         st+="."+a[i];
		}
		System.out.println(st);
	}

}
