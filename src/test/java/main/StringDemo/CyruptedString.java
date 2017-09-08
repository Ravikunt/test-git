package test.java.main.StringDemo;

public class CyruptedString {
	public static void main(String[] args) {
		String s = "ab5c6dyhr6jju12";
		for (int i = 0; i < s.length();) {
			StringBuilder sBuilder = new StringBuilder();
			StringBuilder iBuilder = new StringBuilder();
			while(i < s.length()) {
				int x = (int) s.charAt(i);
				if((x >= 97 && x <=122))
				{
					sBuilder.append(s.charAt(i));
					i++;
				}
				else
				{
					break;
				}
			}
			while(i < s.length()) {
				int x = (int) s.charAt(i);
				if(!(x >= 97 && x <=122))
				{
					iBuilder.append(s.charAt(i));
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.println();
			printHere(sBuilder.toString(), Integer.parseInt(iBuilder.toString()));
		}
	}
	
	public static void printHere(String s, int x)
	{
		for(int i = 0; i < x; i++)
		{
			System.out.print(s);
		}
	}
}