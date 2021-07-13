package Trees;

public class BST {

	private TreeNode root;
	
	private class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public void insert(int data)
	{
		root=insert(root,data);
	}
	
	public TreeNode insert(TreeNode root,int data)
	{
		if(root==null)
		{
			root=new TreeNode(data);
			return root;
		}
		if(data<root.data)
			root.left=insert(root.left,data);
		else
			root.right=insert(root.right ,data);
		return root;
	}
	
	public void inOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public TreeNode search(TreeNode root, int k)
	{
		if(root==null)
			return null;
		if(k<root.data)
			return search(root.left,k);
		else if(k>root.data)
			return search(root.right,k);
		return root;
	}
	public TreeNode searchNonRecursive(TreeNode root,int k)
	{
		if(root==null)
			return null;
		while(root!=null)
		{
			if(k==root.data)
				return root;
			else if(k<root.data)
				root=root.left;
			else
				root=root.right;
		}
		return null;
	}
	
	public TreeNode MinimumElement(TreeNode root)
	{
		if(root==null)
			return null;
		else if(root.left==null)
			return root;
		else return MinimumElement(root.left);
	}
	public TreeNode MinNonRecursive(TreeNode root)
	{
		if(root==null)
			return null;
		while(root.left!=null)
			root=root.left;
		return root;
	}
	
	public TreeNode maxElement(TreeNode root)
	{
		if(root==null)
			return null;
		else if(root.right==null)
			return root;
		else return maxElement(root.right);
	}
	public TreeNode maxNonRecursive(TreeNode root)
	{
		if(root==null)
			return null;
		while(root.right!=null)
			root=root.right;
		return root;
	}
	
	
	 TreeNode deleteNode(TreeNode root, int k)
	{
	     
	    // Base case
	    if (root == null)
	        return root;
	 
	    // Recursive calls for ancestors of
	    // node to be deleted
	    if (root.data > k)
	    {
	        root.left = deleteNode(root.left, k);
	        return root;
	    }
	    else if (root.data < k)
	    {
	        root.right = deleteNode(root.right, k);
	        return root;
	    }
	 
	    // We reach here when root is the node
	    // to be deleted.
	 
	    // If one of the children is empty
	    if (root.left == null)
	    {
	        TreeNode temp = root.right;
	        return temp;
	    }
	    else if (root.right == null)
	    {
	        TreeNode temp = root.left;
	        return temp;
	    }
	 
	    // If both children exist
	    else
	    {
	        TreeNode succParent = root;
	 
	        // Find successor
	        TreeNode succ = root.right;
	         
	        while (succ.left != null)
	        {
	            succParent = succ;
	            succ = succ.left;
	        }
	 
	        // Delete successor. Since successor
	        // is always left child of its parent
	        // we can safely make successor's right
	        // right child as left of its parent.
	        // If there is no succ, then assign
	        // succ->right to succParent->right
	        if (succParent != root)
	            succParent.left = succ.right;
	        else
	            succParent.right = succ.right;
	 
	        // Copy Successor Data to root
	        root.data = succ.data;
	 
	        return root;
	    }
	}

	public static void main(String[] args) {
		
		BST ob=new BST();
		ob.insert(7);
		ob.insert(5);
		ob.insert(4);
		ob.insert(6);
		ob.insert(10);
		ob.insert(9);
		ob.insert(11);
		ob.inOrder(ob.root);
		if(ob.search(ob.root, 4)==null)
			System.out.println("\nElement not found");
		else
			System.out.println("\nElement found");
		//Non recursive approach
		if(ob.searchNonRecursive(ob.root, 8)==null)
			System.out.println("Element not found");
		else
			System.out.println("Element found");
		//find the minimum element
		System.out.println("The Minimum element in the BST is:"+ob.MinimumElement(ob.root).data);
		System.out.println("The Minimum element(Without Recursion) in the BST is:"+ob.MinNonRecursive(ob.root).data);
		//finding the maximum element
		System.out.println("The Maximum element in the BST is:"+ob.maxElement(ob.root).data);
		System.out.println("The Maximum element(Without Recursion) in the BST is:"+ob.maxNonRecursive(ob.root).data);
		ob.insert(8);
		ob.inOrder(ob.root);
		//delete an element from the bst
		ob.deleteNode(ob.root, 8);
		System.out.println();
		ob.inOrder(ob.root);
	}

}
