package test.java.BinaryTree;

public class RecInOrder 
{
		Node root;
		RecInOrder(int d)
		{
			root = new Node(d);
		}
		RecInOrder()
		{
			root = null;
		}
		void funIn(Node root)
		{
			if(root != null)
			{
				funIn(root.left);
				System.out.println(root.data);
				funIn(root.right);
			}
		}
		public static void main(String[] args) 
		{
			RecInOrder rp = new RecInOrder();
			rp.root = new Node(5);
			rp.root.left = new Node(7);
			rp.root.right = new Node(9);
			rp.root.left.left = new Node(10);
			rp.root.left.right = new Node(12);
			rp.funIn(rp.root);
		}
	}
