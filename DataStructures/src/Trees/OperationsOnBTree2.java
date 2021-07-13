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
	public TreeNode createBinaryTree2()
	{
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		TreeNode six=new TreeNode(6);
		TreeNode seven=new TreeNode(7);
		
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		third.left=six;
		third.right=seven;
		
		return root;
	}
	
	public int minDepth(TreeNode root)
	{
		if(root==null)
			return 0;
		int left=minDepth(root.left)+1;
		int right=minDepth(root.right)+1;
		return Math.min(left, right);
	}
	public int levelWithMaxSum(TreeNode root)
	{
		if(root==null)
			return 0;
		int left=minDepth(root.left)+1;
		int right=minDepth(root.right)+1;
		return Math.min(left, right);
	}
	
	public int maxDepth(TreeNode root)
	{
		if(root==null)
			return 0;
		int left=minDepth(root.left)+1;
		int right=minDepth(root.right)+1;
		return Math.max(left, right);
	}
	
	public int width(TreeNode root)
	{
		int max=0;
		int height=maxDepth(root);
		for(int i=0;i<height;i++)
		{
			int temp=width(root,i);
			if(temp>max)
				max=temp;
		}
		return max;
	}
	
	private int width(TreeNode root, int i) {
		if(root==null)
			return 0;
		else if(i==0)
			return 1;
		else
		return width(root.left,i-1)+width(root.right,i-1);
	}
	public boolean checkStructure(TreeNode root1,TreeNode root2)
	{
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		return checkStructure(root1.left, root2.left) && checkStructure(root1.right,root2.right);
	}
	int diameter;
	public int diameterOfBTree(TreeNode root)
	{
		
		if(root==null)
			return 0;
		if(root.left==null && root.right == null)
		{
			return 1;
		}
		int left=diameterOfBTree(root.left);
		int right=diameterOfBTree(root.right);
		diameter=Math.max(diameter, left+right+1);
		return Math.max(left, right) +1;
		
	}
	
	public void rootToLeafPaths(TreeNode root)
	{
		int path[]=new int[5];
		printpaths(root,path,0);
	}
	
	private void printpaths(TreeNode root2, int[] path, int i) {
		if(root2==null)
			return ;
		path[i]=root2.data;
		i++;
		if(root2.left==null && root2.right==null)
			System.out.println(Arrays.toString(path));
		else 
		{
			printpaths(root2.left,path,i);
			printpaths(root2.right,path,i);
		}
	}
	
	public void show(TreeNode root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		show(root.left);
		show(root.right);
	}
	
	public TreeNode createMirrorTree(TreeNode root)
	{
		TreeNode temp;
		if(root!=null)
		{
			createMirrorTree(root.left);
			createMirrorTree(root.right);
			
			temp=root.left;
			root.left=root.right;
			root.right=temp;
		}
		return root;
	}
	public boolean printAncestors(TreeNode root, int n)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==n)
			return true;
		if(printAncestors(root.left,n)||printAncestors(root.right,n))
		{
			System.out.print(root.data+" ");
			return true;
		}
		return false;
	}
	public TreeNode LCA(TreeNode root,int a,int b)
	{
		if(root==null)
			return null;
		if(root.data==a || root.data==b)
			return root;
		TreeNode left=LCA(root.left,a,b);
		TreeNode right=LCA(root.right,a,b);
		if(left!=null && right!=null)
			return root;
		else if(left!=null)
			return left;
		else
			return right;
	}
	
//	private void printArray(int[] path, int i) {
//		for(int j=0;j<i;j++)
//		{
//			System.out.print(path[i]+" ");
//		}
//		System.out.println();
//		
//	}
	public static void main(String[] args) {
		OperationsOnBTree2 ob=new OperationsOnBTree2();
		
		TreeNode node=ob.createBinaryTree();
		System.out.println("min depth:"+ob.minDepth(node));
		TreeNode node2=ob.createBinaryTree2();
		System.out.println("The two trees are structurally identical:"+ob.checkStructure(node, node2));
		System.out.println("The diameter of tree is:"+ob.diameterOfBTree(node));
		System.out.println("The width of the tree is:"+ob.width(node));
		ob.rootToLeafPaths(node);
		//create mirror image of node2
		TreeNode mirror=ob.createMirrorTree(node);
		ob.show(  mirror);
		System.out.println();
		System.out.println(ob.printAncestors(node, 8));
		System.out.println(ob.LCA(node, 6, 4).data);
		
	}

}
