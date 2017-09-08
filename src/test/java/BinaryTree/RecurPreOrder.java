package test.java.BinaryTree;

public class RecurPreOrder 
{
	Node root;
	RecurPreOrder(int r) 
	{
		root = new Node(r);
	}
	RecurPreOrder() 
	{
		root = null;
	}
	void preOrder(Node root)
	{
		if(root != null)
		{
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
		}
	}
	public static void main(String[] args) 
	{
		RecurPreOrder rp = new RecurPreOrder();
		rp.root = new Node(5);
		rp.root.left = new Node(7);
		rp.root.right = new Node(9);
		rp.root.left.left = new Node(10);
		rp.root.left.right = new Node(12);
		rp.preOrder(rp.root);
	}
}
