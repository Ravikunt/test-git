package test.java.LinkedListPrograms;

import java.util.LinkedList;

public class LinkList 
{
	public static void main(String[] args) 
	{
		int d = 10;
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(d);
		
		node n = new node(d);
		System.out.println(n);
	};
	
	public static class node
	{
		int data;
		node next;
		node(int d)
		{
			data = d;
			next = null;
		}
	}
}
