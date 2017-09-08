package test.java.arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class ReducingArray 
{
	static void reduce(int[] arr)
	{
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i< arr.length; i++)
		{
			int minPost = -1;
			int min = Integer.MAX_VALUE;
			for(int j=0; j<arr.length; j++)
			{
				if(!set.contains(j) && arr[j]<min)
				{
					min = arr[j];
					minPost = j;
				}
			}
			arr[minPost]= count;
			count++;
			set.add(minPost);
		}	
		}
	public static void main(String[] args) 
	{
		int[] arr = {10, 40, 20, 7, 12, 25};
		for(int i =0; i< arr.length ; i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		reduce(arr);
		for(int i =0; i< arr.length ; i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}
