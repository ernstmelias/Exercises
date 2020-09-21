package sorting;

public class Sorting {
	public static int [] bubbleSort(int []a )
	{
		int [] result = a;
		for(int i=0; i <result.length; i++)
		{
			for(int j=i; j < result.length ; j++)
			{
				if(result[i] > result[j])
				{
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result;
	}

}
