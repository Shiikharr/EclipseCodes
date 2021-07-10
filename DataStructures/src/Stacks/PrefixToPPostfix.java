package Stacks;

import java.util.Stack;

public class PrefixToPPostfix {

	
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
	
	public static String convertToPostfix(String s)
	{
		Stack<String> stack=new Stack<>();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			if(isOperator(ch))
			{
				String op1=stack.pop();
				String op2=stack.pop();
				String temp=op1+op2+ch;
				stack.push(temp);
			}
			else
				stack.push(ch+"");
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {

		String s="*+AB-CD";
		System.out.println("Prefix:"+s+"\nPostfix:"+convertToPostfix(s));

	}

}
