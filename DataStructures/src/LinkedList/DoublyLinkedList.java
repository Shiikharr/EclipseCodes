package LinkedList;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode
	{
		ListNode next;
		ListNode previous;
		int data;
		
		public ListNode (int data)
		{
			this.data=data;
		}
	}
	public DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	public int length()
	{
		return length;
	}
	
	public void inserAtLast(int data)
	{
		ListNode newNode=new ListNode(data);
		if(isEmpty())
			head=newNode;
		else
		{
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	
	public void printForward()
	{
		if(head==null)
			return;
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	public void printBackward()
	{
		if(tail==null)
			return;
		ListNode current=tail;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.previous;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.inserAtLast(1);
		ob.inserAtLast(3);
		ob.inserAtLast(5);
		ob.inserAtLast(9);
		ob.inserAtLast(10);
		ob.printForward();
		System.out.println();
		ob.printBackward();

	}

}
