package Trees;

import java.util.*;

public class findMaxInBinaryTree {

	static class Node {
		Node left, right;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
		
	static Scanner sc=null;
	static Node createTree()
	{
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}
	
	public static int findMax(Node root)
	{
		if(root==null)
			return Integer.MIN_VALUE;
		int result=root.data;
		int left=findMax(root.left);
		int right=findMax(root.right);
		if(left>result)
			result=left;
		if(right>result)
			result=right;
		return result;
	}
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		Node root = createTree();
		System.out.println(findMax(root));
	}

}
