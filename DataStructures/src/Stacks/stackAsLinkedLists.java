package Stacks;

public class stackAsLinkedLists {

	private ListNode top;
	private int length;
	
	private class ListNode
	{
		private ListNode next;
		private int data;
		
		public ListNode(int data)
		{
			this.data=data;
		}
	}
	
	public stackAsLinkedLists()
	{
		top=null;
		length=0;
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void push(int data)
	{
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public void pop()
	{
		if(isEmpty())
			System.out.println("Stack Underflow");
		else
		{
			ListNode current=top;
			top=top.next;
			current.next=null;
			length--;
		}
	}
	
	public int peek()
	{
		int data=0;
		if(isEmpty())
			System.out.println("Stack Underflow");
		else
		{
			data=top.data;
		}
		return data;
	}
	
	public void show()
	{
		ListNode current=top;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		stackAsLinkedLists ob=new stackAsLinkedLists();
		ob.push(5);
		ob.push(8);
		ob.push(10);
		ob.push(19);
		ob.show();
		ob.pop();
		ob.show();
		ob.pop();
		ob.show();
		ob.pop();
		ob.pop();
		ob.show();
		ob.pop();
		ob.push(98);
		ob.show();
		ob.push(5);
		ob.push(8);
		ob.push(10);
		
		ob.show();
		System.out.println("The peek element is:"+ob.peek());
		System.out.println("The length of the stack is:"+ob.length());
	}

}
