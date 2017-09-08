package test.java.LinkedListPrograms;

public class LinkListInsertion {
	static void print(Node r) {
		Node current = r;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	static Node removeNode(Node r, int a) {
		Node current = r;
		Node previous = null;
		Node head = r;
		int d = a;
		while (current != null) {
			if (current.data == d) {
				if (current == head) {
					head = current.next;
				} else {
					previous.next = current.next;
				}
			} else {
				previous = current;
			}
			current = current.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node sec = new Node(9);
		Node third = new Node(8);
		Node four = new Node(1);
		Node five = new Node(2);
		Node six = new Node(3);
		Node seven = new Node(1);
		head.next = sec;
		sec.next = third;
		third.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		Node root = removeNode(head, 1);
		System.out.println(root);
		print(removeNode(head, 1));
	}
}