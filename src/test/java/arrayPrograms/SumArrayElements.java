package test.java.arrayPrograms;

public class SumArrayElements 
{
	static void sumElements(int[] arr, int sum)
	{
		int x=0,i,j;
		for(i=0; i<arr.length-1; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if((arr[i])+(arr[j])==sum)
				{
					x++;
				}
			}
		}
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		int sum = 11;
		sumElements(arr, sum);
	}	
}
