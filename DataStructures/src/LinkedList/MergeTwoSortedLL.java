package LinkedList;

public class MergeTwoSortedLL {

	ListNode head;
	
	public static class ListNode
	{
		ListNode next;
		int data;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode createLL(int n1,int n2,int n3, int n4,int n5)
	{
		ListNode one=new ListNode(n1);
		ListNode two=new ListNode(n2);
		ListNode three=new ListNode(n3);
		ListNode four=new ListNode(n4);
		ListNode five=new ListNode(n5);
		
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		return one;
		
	}
	public void printll(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		if(l1.data > l2.data)
		{
			ListNode temp=l1;
			l1=l2;
			l2=temp;
		}
		ListNode res=l1;
		while(l1!=null && l2!=null)
		{
			ListNode tmp=null;
			while(l1!=null && l1.data <= l2.data )
			{
				tmp=l1;
				l1=l1.next;
			}
			tmp.next=l2;
			//swap
			ListNode temp=l1;
			l1=l2;
			l2=temp;
		}
		return res;
	}
	
	public static void main(String args[])
	{
		MergeTwoSortedLL ob=new MergeTwoSortedLL();
		ListNode l1=ob.createLL(2, 3, 5, 7, 9);
		ob.printll(l1);
		System.out.println();
		ListNode l2=ob.createLL(1, 4, 6, 10, 12);
		ob.printll(l2);
		System.out.println("The merged List is:\n");
		ListNode merge=ob.mergeTwoLists(l1, l2);
		ob.printll(merge);
	}
}
