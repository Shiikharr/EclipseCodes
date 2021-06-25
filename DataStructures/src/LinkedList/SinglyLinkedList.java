package LinkedList;

public class SinglyLinkedList {

	public ListNode head;
	
	public static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void insertAtBeg(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	public void insertAtEnd(int value)
	{
		ListNode newNode=new ListNode(value);
		if(head==null)
		{
			head=newNode;
		}
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	public void insertAtPos(int value,int pos)
	{
		ListNode newNode=new ListNode(value);
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			int c=1;
			ListNode previous=head;
			while(c<pos-1)
			{
				previous=previous.next;
				c++;
			}
			ListNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
		}
	}
	public int delAtBeg()
	{
		if(head==null)
			return head.data;
		ListNode current=head;
		head=head.next;
		current.next=null;
		return current.data;
	}
	public ListNode delAtLast()
	{
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
		
	}
	public void delAtPos(int pos)
	{
		if(pos==1)
			head=head.next;
		else
		{
		int c=1;
		ListNode previous=head;
		while(c<pos-1)
		{
			previous=previous.next;
			c++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
		}
	}
	
	//Finding length of linkedList
	public int lengthOfLL()
	{
		if(head==null)
			return 0;
		int size=0;
		ListNode current=head;
		while(current!=null)
		{
			size++;
			current=current.next;
		}
		return size;
	}
	//printing the linkedList
	public void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String args[])
	{
		SinglyLinkedList ob=new SinglyLinkedList();
		ob.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		//connect the nodes
		
		ob.head.next=second;
		second.next=third;
		third.next=fourth;
		//displaying the first linkedList Created
		ob.display();
		//getting the size of linkedList created
		System.out.println("\nThe size of linkedList is :"+ob.lengthOfLL());
		//inserting element at the beginning
		ob.insertAtBeg(12);
		ob.display();
		//inserting element at the end
		System.out.println();
		ob.insertAtEnd(30);
		ob.display();
		//inserting element at a specific position
		System.out.println();
		ob.insertAtPos(23, 3);
		ob.display();
		//deleting element from the beginning
		System.out.println("\nThe node deleted at the beginning is:"+ob.delAtBeg());
		ob.display();
		//deleting element from the last 
		System.out.println("\nThe node deleted at the last is:"+ob.delAtLast().data);
		ob.display();
		//deleting element at a specific position and displaying it
		System.out.println("\nThe list after deleting element at a 3rd position is:");
		ob.delAtPos(3);
		ob.display();
	}
	
}
