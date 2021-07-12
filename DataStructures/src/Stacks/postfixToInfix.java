package Stacks;

import java.util.Stack;

public class postfixToInfix {

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
	
	public static String convertToInfix(String s)
	{
		Stack<String> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(isOperator(ch))
			{
				String op1=stack.pop();
				String op2=stack.pop();
				String temp="("+op2+ch+op1+")";
				stack.push(temp);
			}
			else
				stack.push(ch+"");
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String s="ab-de+f*/";
		System.out.println("Postfix:"+s+"\nInfix:"+convertToInfix(s));
		String s2="ABC/-AK/L-*";
		System.out.println("\nPostfix:"+s2+"\nInfix:"+convertToInfix(s2));

	}

}
