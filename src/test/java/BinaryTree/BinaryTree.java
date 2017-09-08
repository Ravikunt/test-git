package test.java.BinaryTree;

import java.util.Stack;

class Node
{
	int data;
	Node left,right;
	public Node(int d)
	{
		data = d;
		right = left = null;
	}
}
public class BinaryTree 
{
	Node root;
	BinaryTree(int d) 
	{
		root = new Node(d);
	}
	BinaryTree() 
	{
		root = null;
	}
	void preOrder(Node root) 
	{
	    Stack<Node> s = new Stack<>();
	    s.push(root);
	    while(!s.isEmpty())
	    {
	    	Node current = s.pop();
	    	System.out.print(current.data+", ");
	    	if(current.right != null)
	    	{
	    		s.push(current.right);
	    	}
	    	if(current.left !=null)
	    	{
	    		s.push(current.left);
	    	}
	    }
	}
	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(5);
		bt.root.left = new Node(7);
		bt.root.right = new Node(9);
		bt.root.left.left = new Node(10);
		bt.root.left.right = new Node(12);
		bt.preOrder(bt.root);
	}
}