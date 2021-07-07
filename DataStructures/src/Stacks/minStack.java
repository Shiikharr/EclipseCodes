package Stacks;

import java.util.Stack;

public class minStack {

//	Design a stack that supports getMin() in O(1) time and O(1) extra space
//	Difficulty Level : Hard
//	Last Updated : 31 Mar, 2021
//	Question: Design a Data Structure SpecialStack that supports all the stack 
//	operations like push(), pop(), isEmpty(), isFull() and an additional operation 
//	getMin() which should return minimum element from the SpecialStack. All these 
//			operations of SpecialStack must be O(1). To implement SpecialStack, you 
//			should only use standard Stack data structure and no other data structure 
//			like arrays, list, .. etc. 
//	Example: 
//	 
//
//	Consider the following SpecialStack
//	16  --> TOP
//	15
//	29
//	19
//	18
//
//	When getMin() is called it should return 15, 
//	which is the minimum element in the current stack. 
//
//	If we do pop two times on stack, the stack becomes
//	29  --> TOP
//	19
//	18
//
//	When getMin() is called, it should return 18 
//	which is the minimum in the current stack.
	
	static	Stack<Integer> s1=new Stack<Integer>();
	static	Stack<Integer> s2=new Stack<Integer>();
	public static void main(String[] args) {	
		minStack ob=new minStack();
		ob.push(18);
		ob.push(19);
		ob.push(29);
		ob.push(15);
		ob.push(16);
		ob.show();
		System.out.println("The minimun element in the stack is:"+ob.min());
		ob.pop();
		ob.pop();
		ob.show();
		System.out.println("The minimun element in the stack is:"+ob.min());
	}
	
	public void push(int x)
	{
		s1.push(x);
		if(s2.isEmpty())
			s2.push(x);
		else
		{
			s2.push(Math.min(s2.peek(), s1.peek()));
		}
	}
	public void pop()
	{
		if(s1.isEmpty() && s2.isEmpty())
			return;
		s1.pop();
		s2.pop();
	}
	public int min()
	{
		return s2.peek();
	}
	public void show()
	{
		System.out.println(s1);
	}
}
