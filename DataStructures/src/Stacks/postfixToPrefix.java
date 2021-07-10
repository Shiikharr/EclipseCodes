package Stacks;

import java.util.Stack;

public class postfixToPrefix {

	public static boolean isOperator(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
		case '*':
		case '/':
			return true;
		}
		return false;
	}
	
	public static String convertpostfix(String s)
	{
		Stack<String> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(isOperator(ch))
			{
				String op1=stack.pop();
				String op2=stack.pop();
				String temp=ch+op2+op1;
				stack.push(temp);
			}
			else
				stack.push(ch+"");
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String s="AB+CD-*";
		System.out.println("Postfix:"+s+"\nPrefix:"+convertpostfix(s));
		String s2="ABC/-AK/L-*";
		System.out.println("\nPostfix:"+s2+"\nPrefix:"+convertpostfix(s2));
	}

}
