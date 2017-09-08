class Solution
{
    public static void main(String []argh)
    {
    	int[] arr = {2, 1, 3, 1, 2, 2};
    	int k = 3;
    	int result=0;
    	for(int i=0; i<arr.length; i++)
    	{
    		System.out.println();
    		for(int j=0; j<arr.length; j++)
    		{
    			int count = 0;
    			int q = 0;
    			if(arr[i]==arr[j])
    			{
    				count++;
    			}
    			
    			if(arr[i]<arr[j] && count==k)
    			{
    				result = arr[i];
    			}
    			System.out.print(count+", ");
    		}
    		
    	}
    	System.out.println(result);
    }
}