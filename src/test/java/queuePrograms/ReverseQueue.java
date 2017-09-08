package test.java.queuePrograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue 
{
	
	public static void reverse(Queue<Integer> queue, int a)
	{
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0; i<a; i++)
		{
				s.push(queue.peek());
				queue.remove();
		}
		while(!s.isEmpty())
		{
			queue.add(s.lastElement());
			s.pop();
		}
		for(int i=0; i<queue.size()-a; i++)
		{
			queue.add(queue.peek());
			queue.remove();
		}
	}
	public static void printQueue(Queue<Integer> queue)
	{
		System.out.print(queue);
	}
	public static void main(String[] args) 
	{
		Queue<Integer> queue = new LinkedList<Integer>() ;
		int a = 7;
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		System.out.println(queue);
		reverse(queue, a);
		printQueue(queue);
	}
}
