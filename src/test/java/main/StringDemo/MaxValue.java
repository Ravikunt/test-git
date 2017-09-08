package test.java.main.StringDemo;

import java.util.Scanner;

public class MaxValue 
{	
	public void maxValue(String s)
	{
		int count=1;
		int max=0;
		char ch = ' ';
		for(int i=0; i<s.length(); i++)
		{
			count=1;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
				max = count;
				ch = s.charAt(i);
			}
		}
		System.out.println(ch+":"+max);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String s = sc.next();
		MaxValue mx = new MaxValue();
		mx.maxValue(s);
	}
}