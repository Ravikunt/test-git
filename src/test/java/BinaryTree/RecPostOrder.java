package test.java.BinaryTree;

public class RecPostOrder 
{
	Node root;
	RecPostOrder(int d)
	{
		root = new Node(d);
	}
	RecPostOrder()
	{
		root = null;
	}
	void funPost(Node root)
	{
		if(root != null)
		{
			funPost(root.left);
			funPost(root.right);
			System.out.println(root.data);
		}
	}
	public static void main(String[] args) 
	{
		RecPostOrder rp = new RecPostOrder();
		rp.root = new Node(5);
		rp.root.left = new Node(7);
		rp.root.right = new Node(9);
		rp.root.left.left = new Node(10);
		rp.root.left.right = new Node(12);
		rp.funPost(rp.root);
	}
}
