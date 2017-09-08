package test.java.arrayPrograms;

public class SpecialCharacter 
{
	private static String reverseString(String s)
	{
		char[] temp = s.toCharArray();
		System.out.println(temp);
		for(int i=0, l=temp.length-1; i < temp.length && l >= 0 && l>i;)
		{
			char c = temp[i];
			char c1 = temp[l];
			int a = (int)c;
			int b = (int)c1;
			if((a>=97 && a<=122) && (b>=97 && b<=122))
			{
				swapElements(temp, i, l);
				i++;
				l--;
			} 
			
			else if((a>=97 && a<=122) && !(b>=97 && b<=122)) 
			{
				l--;
			} 
			else
			{
				i++;
			}
		}
		return new String(temp);
	}
	private static void swapElements(char[] temp, int i, int l) {
		char ch = temp[l];
		temp[l] = temp[i];
		temp[i] = ch;
	}
	
	public static void main(String[] args) 
	{
		String s = "$b,c,de!$";
		System.out.println(reverseString(s));
	}
}
