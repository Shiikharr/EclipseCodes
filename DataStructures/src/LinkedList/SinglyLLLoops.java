package LinkedList;

import LinkedList.singlyLinkedList_2.ListNode;

public class SinglyLLLoops {

	
public static ListNode head;
	
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
	
	public boolean detectAloop()
	{
		ListNode fast=head;
		ListNode slow=head;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow == fast)
			{
				return true;
			}
		}
		return false;
	}
	
	public ListNode loopStartingNode()
	{
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow == fast)
			{
				return getStartingNode(slow);
			}
		}
		return null;
	}
	
	private ListNode getStartingNode(ListNode slow) {
		
		ListNode temp=head;
		while(temp!=slow)
		{
			slow=slow.next;
			temp=temp.next;
		}
		return temp;
	}
	
	public void removeLoop()
	{
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow == fast)
			{
				remove(slow);
				return;
			}
		}
	}

	private void remove(ListNode slow) {
		
		ListNode temp=head;
		while(temp.next!=slow.next)
		{
			temp=temp.next;
			slow=slow.next;
		}
		slow.next=null;
		
	}

	public void createALoop()
	{
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		ListNode sixth=new ListNode(6);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
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
		
		SinglyLLLoops ob=new SinglyLLLoops();
		ob.createALoop();
		System.out.println("The linked List contains a loop:"+ob.detectAloop());
		//print the starting element of the loop
		System.out.println("The starting element of the loop is : "+ob.loopStartingNode().data);
		//Remove the loop
		System.out.println("The Linked List after removing the loop is:");
		ob.removeLoop();
		ob.display();
	}
}
