package Stacks;
import java.util.*;
public class ReverseStringUsingStack {

	public static void main(String[] args) {
		
		String s="shikhar is great";
		reverse(s);

	}

	private static void reverse(String s) {
		
		Stack<Character> stack=new Stack<Character>();
		char chars[]=s.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			stack.push(chars[i]);
		}
		for(int i=0;i<s.length();i++)
		{
			chars[i]=stack.pop();
		}
		for(int i=0;i<chars.length;i++)
		{
			System.out.print(chars[i]);
		}
	}

}
