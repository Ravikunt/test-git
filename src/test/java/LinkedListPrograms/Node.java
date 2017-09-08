package test.java.LinkedListPrograms;

public class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
	public static void main(String[] args) 
	{
		//Node n1 = new Node(10);
		addNode(10);
		addNode(20);
		addNode(30);
		print(10);
	}
	static void addNode(int d)
	{
		Node n = new Node(d);
		Node first = null;
		Node last = null;
		if(first==null && last==null)
		{
			first = n;
			last = n;
		}
		else
		{
			last.next = n;
			last = n;			
		}
	}
	static void print(int d)
	{
		System.out.println(d);
	}
}