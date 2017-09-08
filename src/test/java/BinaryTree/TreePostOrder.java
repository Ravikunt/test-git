package test.java.BinaryTree;

import java.util.Stack;

public class TreePostOrder 
{
	Node root;
	TreePostOrder(int d) 
	{
		root = new Node(d);
	}
	TreePostOrder()
	{
		root = null;
	}
	
	void postFun(Node r)
	{
		//if( root == null ) return;
		   
	      Stack<Node> s = new Stack<>();
	      Node current = root;
	   
	      while(true) 
	      {
	          if( current != null ) 
	          {
	              if( current.right != null ) 
	            	  s.push( current.right );
		              s.push( current );
		              current = current.left;
		              continue;  
	          }
	   
	          if(s.isEmpty())
	           return;
	          current = s.pop();
	   
	          if( current.right != null && !s.isEmpty() && current.right == s.peek( ) ) {
	              s.pop( );
	              s.push( current );
	              current = current.right;
	          } 
	          else 
	          {
	              System.out.print( current.data + " " );
	              current = null;
	          }
	      }
	  }
	public static void main(String[] args) 
	{
		TreePostOrder tp = new TreePostOrder();
		tp.root = new Node(5);
		tp.root.left = new Node(7);
		tp.root.right = new Node(9);
		tp.root.right.left = new Node(14);
		tp.root.right.right = new Node(16);
		tp.root.left.left = new Node(10);
		tp.root.left.right = new Node(12);
		tp.postFun(tp.root);
	}
}