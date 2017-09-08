package test.java.main.StringDemo;

public class Temp 
{
	public static void main(String[] args) 
	{
		int count=0,max=0;
		String s = "geeksforgeeks";
		char c = ' ';
		for(int i=0; i<s.length(); i++)
		{
			count = 0;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(max<count)
			{
				max = count;
				c = s.charAt(i);
			}
		}
		System.out.println(c+":"+max);
	}
}
