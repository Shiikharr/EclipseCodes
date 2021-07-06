package Queues;

public class queueAsLinkedLists {

	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	public void enqueue(int data)
	{
		ListNode newNode=new ListNode(data);
		if(isEmpty())
			front=newNode;
		else
		{
			rear.next=newNode;
		}
		rear=newNode;
		length++;
	}
	
	public void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is empty");
		else
		{
			ListNode current=front;
			front=front.next;
			current.next=null;
			length--;
			System.out.println("The dequeued element is:"+current.data);
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty.");
			return 0;
		}
		else {
			int x=front.data;
			return x;
		}
	}
	
	public void show()
	{
		ListNode current=front;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		queueAsLinkedLists ob=new queueAsLinkedLists();
		ob.enqueue(2);
		ob.enqueue(5);
		ob.enqueue(7);
		ob.show();
		ob.dequeue();
		ob.show();
		System.out.println(ob.peek());
		ob.dequeue();
		ob.dequeue();
		ob.enqueue(8);
		ob.enqueue(12);
		ob.enqueue(54);
		System.out.println(ob.peek());
		ob.show();
		
	}

}
