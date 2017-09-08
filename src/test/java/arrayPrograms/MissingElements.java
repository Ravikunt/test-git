package test.java.arrayPrograms;

import java.util.HashSet;

public class MissingElements 
{
	static void missingElements(int[] arr, int low, int high)
	{
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			hs.add(arr[i]);
		}
		for(int i=low; i<high; i++)
		{
			if(!hs.contains(i))
			{
				System.out.print(i+", ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1, 14, 11, 51, 15};
		int low = 50;
		int high = 55;
		missingElements(arr, low, high);
	}
}
