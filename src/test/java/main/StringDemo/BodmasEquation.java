package test.java.main.StringDemo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class BodmasEquation 
{
	static void equation(String s) throws ScriptException
	{
		char[] ch = s.toCharArray();
		int[] arr = new int[]{2,4,6,18,12};
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++)
		{
			sb.append(arr[i]);
		}
		String s1 = sb.toString();
		char[] arr1 = s1.toCharArray();
		int q = 0;
		for(int i=0; i<ch.length; i++)
		{
			int x = (int)ch[i];
			if(x>=97 || x<=122)
			{
				ch[i] = arr1[q];
				q++;
				i++;
			}
		}
		System.out.println(ch);
		String ss = new String(ch);
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    System.out.println(engine.eval(ss));
	}
	public static void main(String[] args) throws ScriptException 
	{
		String s = "a+b-c*d/e";
		equation(s);
	}
}
