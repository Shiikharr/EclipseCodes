package Stacks;
import java.util.*;
public class BalancedParenthesis {

	public static void main(String[] args) {
		String s="({)}";
		checkBalance(s);
		String st="([{}])";
		checkBalance(st);

	}

	private static void checkBalance(String s) {
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
			{
				stack.push(s.charAt(i));
			}
			else if(!stack.isEmpty() && ((s.charAt(i)==']' && stack.peek()=='[') || 
					(s.charAt(i)=='}' && stack.peek()=='{') ||
					(s.charAt(i)==')' && stack.peek()=='(')) )
			{
				stack.pop();
			}
			else
			{
				stack.push(s.charAt(i));
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
