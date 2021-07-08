package LinkedList;

import java.util.HashMap;

class Node
{
	int key;
	int value;
	Node next;
	Node prev;
	
	public Node(int key,int value)
	{
		this.key=key;
		this.value=value;
	}
}

public class LRUcache {

	Node head;
	Node tail;
	HashMap<Integer,Node> map=null;
	int cap=0;
	
	public LRUcache(int capacity)
	{
		this.cap=capacity;
		map=new HashMap<>();
	}
	
	public int get(int key)
	{
		if(map.containsKey(key))
		{
			Node node=map.get(key);
			removeNode(node);
			putOnTop(node);
			return node.value;
		}
		return -1;
	}
	
	public void put(int key, int value)
	{
		if(map.containsKey(key))
		{
			Node t=map.get(key);
			t.value=value;
			removeNode(t);
			putOnTop(t);
		}
		else
		{
			if(map.size()>=cap)
			{
				map.remove(tail.key);
				removeNode(tail);
			}
			Node node=new Node(key,value);
			map.put(key, node);
			putOnTop(node);
		}
	}
	
	
	private void putOnTop(Node node) {
		node.next=head;
		node.prev=null;
		if(head!=null)
			head.prev=node;
		head=node;
		if(tail==null)
			tail=node;
		
	}

	private void removeNode(Node node) {
		Node prevNode=node.prev;
		Node nextNode=node.next;
		
		if(prevNode!=null)
		{
			prevNode.next=node.next;
		}
		else
			head=nextNode;
		if(nextNode!=null)
		{
			nextNode.prev=prevNode;
		}
		else
			tail=prevNode;
	}

	public static void main(String[] args) {
		LRUcache cache=new LRUcache(3);
		cache.put(1, 3);
		cache.put(4, 2);
		System.out.println(cache.get(1));
		
		cache.put(5, 6);
		System.out.println(cache.get(7));
		System.out.println(cache.get(5));
		
		cache.put(7, 4);
		System.out.println(cache.get(4));

	}

}
