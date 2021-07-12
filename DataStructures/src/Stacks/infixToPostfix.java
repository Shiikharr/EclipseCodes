package Stacks;

import java.util.Stack;

public class infixToPostfix {

	static int precedence(char c)
	{
		switch(c)
		{
		case '+':
		case '-':
			return 1;
			
		case '*':
		case '/':
			return 2;
		
		case '^':
			return 3; 
		}
		return -1;
	}
	
	static String convertInfixToPostFix(String s)
	{
		String result="";
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
				result+=ch;
			
			else if(ch == '(')
				stack.push(ch);
			
			else if(ch == ')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					result+=stack.pop();
				}
				stack.pop();
			}
	
			else
			{
				while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek()))
				{
					result+=stack.pop();
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty())
		{
			if(stack.peek() == '(')
				return "Invalid Expression";
			result+=stack.pop();
		}
		return result;
	}
	
	public static void main(String[] args) {

		String exp="(a+b)*C+D/(E+F*G)-H";
		System.out.println(convertInfixToPostFix(exp));

	}

}
