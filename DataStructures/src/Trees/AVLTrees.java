package Trees;

class Node
{
	Node left,right;
	int data,height;
	
	Node(int data)
	{
		this.data=data;
		height=1;
	}
}

public class AVLTrees {
	Node root;
	
	int Height(Node n)
	{
		if(n==null)
			return 0;
		return n.height;
	}
	int max(int a,int b)
	{
		return (a>b)? a:b;
	}
	
	Node rightRotate(Node y)
	{
		Node x=y.left;
		Node T2=x.right;
		
		x.right=y;
		y.left=T2;
		
		y.height = max(Height(y.left),Height(y.right)) + 1;
		x.height = max(Height(x.left),Height(x.right)) + 1;
		
		return x;
	}
	Node leftRotate(Node x) 
	{
	     Node y = x.right;
	     Node T2 = y.left;
	 
	     y.left = x;
	     x.right = T2;
	 
	     x.height = max(Height(x.left), Height(x.right)) + 1;
	     y.height = max(Height(y.left), Height(y.right)) + 1;
	 
	     return y;
	 }
	int getBalance(Node n)
	{
		if(n==null)
			return 0;
		
		return Height(n.left) - Height(n.right);
	}
	Node insert(Node node, int key) {
		 
        /* 1.  Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));
 
        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;
 
        /* 2. Update height of this ancestor node */
        node.height = 1 + max(Height(node.left),
                              Height(node.right));
 
        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);
 
        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);
 
        // Right Right Case
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);
 
        // Left Right Case
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
 
        // Right Left Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
 
        /* return the (unchanged) node pointer */
        return node;
    }
	
	public void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		
		AVLTrees ob=new AVLTrees();
		
		ob.root = ob.insert(ob.root, 10);
		ob.root = ob.insert(ob.root, 20);
		ob.root = ob.insert(ob.root, 30);
		ob.root = ob.insert(ob.root, 40);
		ob.root = ob.insert(ob.root, 50);
		ob.root = ob.insert(ob.root, 25);
		
		System.out.println("InOrder traversal");
		ob.inOrder(ob.root);
	}

}
