package LinkedList;

import LinkedList.SinglyLinkedList.ListNode;

public class singlyLinkedList_2 {

	
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
	
	public void findnthNodefromEnd(int n)
	{
		ListNode mainpt=head;
		ListNode refpt=head;
		int c=0;
		while(c<n)
		{
			refpt=refpt.next;
			c++;
		}
		while(refpt!=null)
		{
			refpt=refpt.next;
			mainpt=mainpt.next;
		}
		System.out.println("\nThe "+n+" node from the end is:"+mainpt.data);
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
	public void removeDuplicate()
	{
		ListNode current=head;
		while(current!=null && current.next!=null)
		{
			if(current.data == current.next.data)
			{
				current.next=current.next.next;
			}
			else
				current=current.next;
		}
	}
	
	public void addElementInSortedLL(int n)
	{
		ListNode newNode=new ListNode(n);
		ListNode current=head;
		ListNode temp=head;
		while(current!=null && current.data<newNode.data)
		{
			temp=current;
			current=current.next;
		}
		temp.next=newNode;
		newNode.next=current;
	}
	
	public void removeAKey(int n)
	{
		ListNode temp=head;
		ListNode current=head;
		ListNode after=head;
		while(current.next!=null)
		{
			if(current.next.data==n)
			{
				temp=current;
				after=current.next.next;
				
			}
			current=current.next;
		}
		
		temp.next=after;
	}
	
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
		singlyLinkedList_2 ob=new singlyLinkedList_2();
		ob.head=new ListNode(1);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(3);
		//connect the nodes
		
		ob.head.next=second;
		second.next=third;
		third.next=fourth;
		
		ob.insertAtEnd(5);
		ob.insertAtEnd(8);
		ob.display();
		
		//find the nth node from the end of the linked list
		ob.findnthNodefromEnd(2);
		
		//remove duplicate from sorted linkedList
		System.out.print("\nAll the duplicates are removed from:");
		ob.display();
		ob.removeDuplicate();
		System.out.println();
		ob.display();
		
		//Insert a node in a sorted singlyLinkedList 
		System.out.println();
		ob.addElementInSortedLL(4);
		ob.display();
		ob.addElementInSortedLL(7);
		System.out.println();
		ob.display();
		
		//remove a given key from linkedlist
		System.out.println("The list after removing a key is:");
		ob.removeAKey(4);
		ob.removeAKey(7);
		ob.display();
	}
}
