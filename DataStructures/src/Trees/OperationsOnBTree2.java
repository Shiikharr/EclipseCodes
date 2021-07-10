package Trees;

import java.util.*;
public class OperationsOnBTree2 {

	TreeNode root;
	private class TreeNode 
	{
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
	
	
	
	public static void main(String[] args) {
		OperationsOnBTree2 ob=new OperationsOnBTree2();
		
		TreeNode node=ob.createBinaryTree();

	}

}
