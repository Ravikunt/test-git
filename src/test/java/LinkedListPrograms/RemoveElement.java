package test.java.LinkedListPrograms;

public class RemoveElement
{
	static void print(Node r)
	{
		Node current = r;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	static Node addElement(Node r, int a)
	{
		Node h = r;
		Node c = r;
		Node p = null;
		while(c != null)
		{
			if(c.data == a)
			{
				if(h == c)
				{
					h = c.next;
				}
				else
				{
					p.next = c.next;
				}
			}
			else
			{
				p = c;
			}
			c = c.next;
		}
		return h;
	}
	public static void main(String[] args) 
	{
		Node one = new Node(9);
		Node two = new Node(1);
		Node three = new Node(8);
		Node four = new Node(1);
		Node five = new Node(1);
		Node six = new Node(2);
		Node seven = new Node(1);
		Node eight = new Node(3);
		Node nine = new Node(1);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = eight;
		eight.next = nine;
		addElement(one, 1);
		Node n = addElement(one, 1);
		print(n);
	}
}
