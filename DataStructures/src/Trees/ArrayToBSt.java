package Trees;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class ArrayToBSt {

	public TreeNode convert(int a[],int left,int right)
	{
		if(left>right)
			return null;
		int mid=(left+right)/2;
		TreeNode newNode=new TreeNode(a[mid]);
		newNode.left=convert(a,left,mid-1);
		newNode.right=convert(a,mid+1,right);
		return newNode;
	}
	
	public void PostOrder(TreeNode root)
	{
		if(root==null)
			return;
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		ArrayToBSt ob=new ArrayToBSt();
		int a[]= {3,4,5,7,9,10,11};
		TreeNode bst=ob.convert(a, 0, a.length-1);
		ob.PostOrder(bst);
	}

}
