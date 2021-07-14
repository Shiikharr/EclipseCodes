package Trees;

import java.util.*;

public class ImpFunctionsInBT {

	private Node root;
	
	private class Node
	{
		Node left,right;
		int data,height;
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public Node createBT()
	{
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node four=new Node(4);
		Node fifth=new Node(5);
		
		Node seven=new Node(7);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=four;
		second.right=fifth;
		third.right=seven;
		
		return root;
	}
	
	public void TopView(Node root)
	{
		if(root==null)
			return;
		TreeMap<Integer,Integer> map=new TreeMap<>();
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp=q.remove();
			int ht=temp.height;
			
			if(map.get(ht) == null)
			{
				map.put(ht, temp.data);
			}
			if(temp.left != null)
			{
				temp.left.height=ht - 1;
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				temp.right.height=ht + 1;
				q.add(temp.right);
			}
		}
		System.out.println(map.values());
	}
	
	public void BottomView(Node root)
	{
		if(root==null)
			return;
		TreeMap<Integer,Integer> map=new TreeMap<>();
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp=q.remove();
			int ht=temp.height;
			
			map.put(ht, temp.data);
			
			if(temp.left != null)
			{
				temp.left.height=ht - 1;
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				temp.right.height=ht + 1;
				q.add(temp.right);
			}
		}
		System.out.println(map.values());
	}
	
	public void LeftView(Node root)
	{
		int level=0;
		
		LeftView(root,level);
	}
	
	int maxLevel;
	public void LeftView(Node root,int level)
	{
		if(root==null)
			return;
		if(level >= maxLevel)
		{
			System.out.print(root.data+" ");
			maxLevel++;
		}
		LeftView(root.left,level+1);
		LeftView(root.right,level+1);
	}
	
	public void RightView(Node root)
	{
		int level=0;
		RightView(root,level);
	}
	
	int maxLevel2;
	public void RightView(Node root,int level)
	{
		if(root==null)
			return;
		if(level >= maxLevel2)
		{
			System.out.print(root.data+" ");
			maxLevel2++;
		}
		RightView(root.right,level+1);
		RightView(root.left,level+1);
	}
	
	public void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void zigzagTraversal(Node root)
	{
		if(root==null)
			return;
		
		Stack<Node> currentLevel=new Stack<>();
		Stack<Node> nextLevel=new Stack<>();
		
		currentLevel.push(root);
		boolean ltr=true;
		while(!currentLevel.isEmpty())
		{
			Node temp=currentLevel.pop();
			System.out.print(temp.data+" ");
			if(ltr)
			{
				if(temp.left != null)
					nextLevel.push(temp.left);
				if(temp.right != null)
					nextLevel.push(temp.right);
			}
			else
			{
				if(temp.right!=null)
					nextLevel.push(temp.right);
				if(temp.left!=null)
					nextLevel.push(temp.right);
			}
			if(currentLevel.isEmpty())
			{
				ltr=!ltr;
				Stack<Node> temp2=currentLevel;
				currentLevel=nextLevel;
				nextLevel=temp2;
			}
		}
	}
	
	public static void main(String[] args) {
		ImpFunctionsInBT ob=new ImpFunctionsInBT();
		Node a=ob.createBT();
		ob.inOrder(a);
		System.out.println("\nThe top view is: ");
		ob.TopView(a);
		System.out.println("\nThe Left view is: ");
		ob.LeftView(a);
		System.out.println("\nThe Right view is: ");
		ob.RightView(a);
		System.out.println("\nThe Bottom view is: ");
		ob.BottomView(a);
		System.out.println("\nThe Zigzag traversal is: ");
		ob.zigzagTraversal(a);
		
	}

}
