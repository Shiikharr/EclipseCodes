package Queues;
import java.util.*;
public class queueUsingStacks {

	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	public static void main(String[] args) {
		
		queueUsingStacks ob=new queueUsingStacks();
		ob.enqueue(5);
		ob.enqueue(3);
		ob.enqueue(6);
		ob.enqueue(8);
		ob.enqueue(9);
		ob.show();
		ob.dequeue();
		ob.dequeue();
		ob.show();
	}
	
	public void enqueue(int n)
	{
		s1.push(n);
	}
	public void dequeue()
	{
		 if(s2.isEmpty())
		 {
			 if(s1.isEmpty())
				 System.out.println("Queue is empty");
			 else
			 {
				 while(!s1.isEmpty())
					 s2.push(s1.pop());
			 }
		 }
		 s2.pop();
	}
	public void show()
	{
		if(s2.isEmpty())
			System.out.println(s1);
		else
			System.out.println(s2);
	}

}
