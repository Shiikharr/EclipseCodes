package gfg_20_questions;

public class findMiddle {

//	Find the middle of a given linked list
//	Difficulty Level : Easy
//	Last Updated : 26 May, 2021
//	Given a singly linked list, find the middle of the linked list. 
//	For example, if the given linked list is 1->2->3->4->5 then the output should be 3. 
//	If there are even nodes, then there would be two middle nodes, 
//	we need to print the second middle element. For example, 
//	if given linked list is 1->2->3->4->5->6 then the output should be 4. 
	ListNode head;
	private static class ListNode{
		int data;
		ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public int lengthOfLL()
	{
		int size=0;
		ListNode current=head;
		while(current!=null)
		{
			current=current.next;
			size++;
		}
		return size;
	}
	
	public void findmid()
	{
		int n=lengthOfLL()/2;
		ListNode current=head;
		int c=0;
		while(c<n)
		{
			current=current.next;
			c++;
		}
		System.out.println("The middle element is:"+current.data);
	}
	
	public void printList()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data + "->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String args[])
	{
		findMiddle ob=new findMiddle();
		ob.head=new ListNode(1);
		ListNode two=new ListNode(2);
		ListNode three=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		ListNode sixth=new ListNode(6);
		
		ob.head.next=two;
		two.next=three;
		three.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		
		ob.printList();
		System.out.println();
		ob.findmid();
	}
	
}
