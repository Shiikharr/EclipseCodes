package Stacks;
import java.util.*;
public class StackUsingQueues {

	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();

	
	public static void main(String[] args) {
		
		StackUsingQueues ob=new StackUsingQueues();
		ob.push(3);
		ob.push(4);
		ob.push(6);
		ob.push(8);
		ob.push(9);
		ob.show();
		ob.pop();
		ob.show();
		System.out.println("The element at the top is:"+ob.peek());
		System.out.println("The size of the stack is:"+ob.size());
	}
	static int size=0;
	
	static void push(int data)
	{
		size++;
		
		q2.add(data);
		while(!q1.isEmpty())
		{
			q2.add(q1.peek());
			q1.remove();
		}
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;
	}
	static void pop()
	{
		if(q1.isEmpty())
			return;
		q1.poll();
		size--;
	}
	static int peek()
	{
		if(q1.isEmpty())
			return -1;
		return q1.peek();
	}
	static int size()
	{
		return size;
	}
	static void show()
	{
		System.out.println(q1);
	}
}
