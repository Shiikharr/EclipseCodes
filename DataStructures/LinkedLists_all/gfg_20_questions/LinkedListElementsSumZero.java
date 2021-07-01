package gfg_20_questions;

import java.util.HashMap;
import java.util.Map;

import LinkedList.MergeTwoSortedLL.ListNode;

public class LinkedListElementsSumZero {
	
	ListNode head;
	
	private class ListNode
	{
		ListNode next;
		int data;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode createLL(int n1, int n2, int n3, int n4, int n5)
	{
		ListNode one=new ListNode(n1);
		ListNode two=new ListNode(n2);
		ListNode three=new ListNode(n3);
		ListNode four=new ListNode(n4);
		ListNode five=new ListNode(n5);
//		ListNode six=new ListNode(n6);
//		ListNode seven=new ListNode(n7);
//		ListNode eight=new ListNode(n8);
		
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
//		five.next=six;
//		six.next=seven;
//		seven.next=eight;
		
		return one;
		
	}
	
	public ListNode sumZero(ListNode l1, int k)
	{
		ListNode root=new ListNode(0);
		root.next=head;
		Map<Integer, ListNode> map=new HashMap<Integer, ListNode>();
		map.put(0, root);
		int sum=0;
		while(head!=null)
		{
			sum+=head.data;
			
			if(map.containsKey(sum-k))
			{
				ListNode prev=map.get(sum-k);
				ListNode start=prev;
				int aux=sum;
				sum=sum-k;
				
				while(prev!=head)
				{
					prev=prev.next;
					aux+=prev.data;
					if(prev!=head)
					{
						map.remove(aux);
					}
				}
				start.next=head.next;
			}
			else if(!map.containsKey(sum))
			{
				map.put(sum, head);
			}
			head=head.next;
		}
		return root.next;
		
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
	
	public static void main(String args[])
	{
		LinkedListElementsSumZero ob=new LinkedListElementsSumZero();
		ListNode l1=ob.createLL(1,2,-3,3,1);
		int k=3;
		ListNode x=ob.sumZero(l1, k);
		ob.printll(x);
	}

}
