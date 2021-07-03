package Strings;

import java.util.Arrays;

public class reverseAString {

	public static void main(String[] args) {
		
		String s="Shikhar.is.a.good.boy";
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
		System.out.println(Arrays.toString(a));
	}

}
