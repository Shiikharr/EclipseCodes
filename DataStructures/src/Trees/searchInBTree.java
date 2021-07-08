package Trees;

import java.util.*;

public class searchInBTree {

	private TreeNode root;

	private class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
	}	
	public boolean searchElement(TreeNode root, int x)
	{
		boolean flag=false;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			if(temp.data==x)
				flag=true;
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return flag;
	}
	public boolean searchRecursive(TreeNode root,int x)
	{
		if(root==null)
			return false;
		if(root.data==x)
			return true;
		return searchRecursive(root.left,x) || searchRecursive(root.right,x);
	}
	
	public static void main(String[] args) {
		
		searchInBTree ob=new searchInBTree();
		ob.createBinaryTree();
		int n=-1;
		System.out.println("The searched element found status:"+ob.searchElement(ob.root, n));
		System.out.println("The searched element found status:"+ob.searchRecursive(ob.root, n));

	}

}
