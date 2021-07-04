package LinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedLists {

	private ListNode last;
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
	
	public CircularLinkedLists()
	{
		last=null;
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
	
	public void createCircularLL()
	{
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(5);
		ListNode third=new ListNode(10);
		ListNode fourth=new ListNode(15);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		
		last=fourth;
	}
	
	public void insertAtBeg(int data)
	{
		ListNode newNode=new ListNode(data);
		if(last == null)
			last=newNode;
		else
			newNode.next=last.next;
		last.next=newNode;
		length++;
	}
	
	public void insertAtLast(int data)
	{
		ListNode newNode=new ListNode(data);
		if(last == null)
		{
			last=newNode;
			last.next=last;
		}
		else 
		{
			newNode.next=last.next;
			last.next=newNode;
			last=newNode;
		}
		length++;
	}
	public ListNode removeFirst()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		ListNode temp=last.next;
		if(last.next == last)
			last=null;
		else
			last.next=temp.next;
		temp.next=null;
		length--;
		return temp;
	}
	
	public void printCircularLL()
	{
		if(last == null)
			return;
		ListNode first=last.next;
		while(first!=last)
		{
			System.out.print(first.data+"->");
			first=first.next;
		}
		System.out.print(first.data+" ");
	}
	
	public static void main(String[] args) 
	{
		CircularLinkedLists ob=new CircularLinkedLists();
		ob.createCircularLL();
		ob.printCircularLL();
		//inserting element at the beginning
		System.out.println("\nAfter Inserting at the beginning the list is:");
		ob.insertAtBeg(3);
		ob.printCircularLL();
		//inserting at the last
		System.out.println("\nAfter Inserting at the last the list is:");
		ob.insertAtLast(14);
		ob.printCircularLL();
		System.out.println("the element deleted is: "+ob.removeFirst().data);
		System.out.println("After deleting at the first element, the list is:");
		ob.printCircularLL();
	}

}
