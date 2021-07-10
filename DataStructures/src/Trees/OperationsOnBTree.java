package Trees;

import java.util.*;

public class OperationsOnBTree {

	static Scanner sc=null;
	TreeNode root;
	class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public TreeNode createBinaryTree()
	{
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		TreeNode six=new TreeNode(6);
		TreeNode seven=new TreeNode(7);
		TreeNode eight=new TreeNode(8);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=six;
		third.right=seven;
		seven.right=eight;
		return root;
	}
	
	//user input
	public TreeNode createBTree()
	{
		TreeNode root=null;
		System.out.println("Enter the data:");
		int data=sc.nextInt();
		if(data==-1)
			return null;
		root=new TreeNode(data);
		System.out.println("Enter the left value:");
		root.left=createBTree();
		System.out.println("Enter the right value:");
		root.right=createBTree();
		return root;
	}
	public void show(TreeNode root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		show(root.left);
		show(root.right);
	}
	public int sizeOfBTree(TreeNode root)
	{
		int leftCount=root.left == null? 0:sizeOfBTree(root.left);
		int rightCount=root.right == null? 0:sizeOfBTree(root.right);
		return 1+leftCount+rightCount;
	}
	public int sizeWithoutRecursion(TreeNode root)
	{
		int c=0;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp!=null)
			{
				c++;
				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
		}
		return c;
	}
	
	public void levelOrderReverse(TreeNode root)
	{
		if(root==null)
			return;
		Stack<TreeNode> s=new Stack<>();
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
			s.push(temp);
		}
		while(!s.isEmpty())
			System.out.print(s.pop().data+" ");
	}
	
	public int depthOfBTree(TreeNode root)
	{
		if(root==null)
			return -1;
		return (Math.max(depthOfBTree(root.left), depthOfBTree(root.right))+1);
	}
	public int MinHeight(TreeNode root)
	{
		if(root == null)
			return 0;
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.offer(root);
		q.offer(null);
		int minHeight=1;
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp!=null)
			{
			if(temp.left == null && temp.right==null)
				return minHeight;
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
			}
			else
			{
				if(!q.isEmpty()) 
				{
					minHeight++;
					q.offer(null);
				}
			}
		}
		return minHeight;
	}
	
	public TreeNode deepestNode(TreeNode root)
	{
		TreeNode temp=null;
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty())
		{
			temp=q.poll();
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return temp;
	}
	public int CountLeafNodes(TreeNode root)
	{
		int count=0;
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp.left==null && temp.right==null)
				count++;
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return count;
		
	}
	public int CountHalfNodes(TreeNode root)
	{
		int count=0;
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if((temp.left==null && temp.right!=null) || (temp.right==null && temp.left!=null))
				count++;
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return count;
	}
	
	public static void main(String[] args) {
		OperationsOnBTree ob=new OperationsOnBTree();
		sc=new Scanner(System.in);
		TreeNode node=ob.createBinaryTree();
		ob.show(node);
		System.out.println("\nThe size of the binary tree is:"+ob.sizeOfBTree(node));
		System.out.println("The size of the binary tree is without recursion:"+ob.sizeWithoutRecursion(node));
		System.out.println("The reverse level order traversal is:");
		ob.levelOrderReverse(node);
		System.out.println("\nMaximum Depth of Binary tree is:"+ob.depthOfBTree(node));
		System.out.println("\nMinimum Depth of Binary tree is:"+ob.MinHeight(node));
		System.out.println("\nThe deepest node in the tree is:"+ob.deepestNode(node).data);
		System.out.println("\nThe list after deleting node 8 is:");
		System.out.println("\nThe number of leaf nodes are:"+ob.CountLeafNodes(node));
		TreeNode node2=ob.createBTree();
		System.out.println("The number of half nodes are:"+ob.CountHalfNodes(node2));
	}

}
