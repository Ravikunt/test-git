package test.java.main.StringDemo;

public class TwoStrings 
{
	public static void windowRemove(String str, String pat)
	{
		if(str.length()<pat.length())
		{
			System.out.println("No such window");
		}
		
		for(int i=0; i<pat.length(); i++)
		{
			int count = 0;
			for(int j=0; j<str.length(); j++)
			{
				if(str.charAt(i)==pat.indexOf(j))
				{
					count++;
				} 
			}
			if(count==pat.length())
			{
				
			}
		}
		
	}
	public static void main(String[] args) 
	{
		String str = "this is a test string";
		String pat = "tist";
		windowRemove(str, pat);
	}
}
