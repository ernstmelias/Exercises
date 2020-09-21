package sorting;

import java.util.Random;

public class QuickSort {
	public QuickSort(){}
	
	public int [] QuickSortStart(int [] input)
	{
		int [] result=null;
		result = QuickSortSplit(input , 0 , input.length-1);
		return result;
	}
	
	private  int [] QuickSortSplit(int [] input, int low, int high)
	{
		if((high - low ) < 2)
		{
			return input;
		}
	int pos = partition(input, low, high);
    
	QuickSortSplit(input, low, pos-1);
	QuickSortSplit(input,pos+1,high);
    return input;
	}
	
	private int partition( int [] input, int low, int high)
	{
	  int pivot = input[high];
	  int i = (low -1);
	  for(int j = low ; j <= high -1 ; j++)
	  {
		  if(input[j] <= pivot)
		  {
			  i++;
			  int tempj = input[j];
			  input[j] = input[i];
			  input[i] = tempj;
		  }
		  
	  }
	  int tempi = input[i+1];
	  input[i+1] = input[high];
	  input[high] = tempi;
	
	  return (i+1);
	}
	
	public int [] buildTest(int len)
	{
		int [] test = new int[len];
		Random ran = new Random();
	   for(int i=0 ; i < len ; i++)
	   {
		   test[i] = ran.nextInt(1000) + 1;
	   }
		return test;
	}

	public void  print(int []a)
	{
	   System.out.print("[ ");
	for( int one : a)
	{
		System.out.print(one + " ");
	}
		System.out.print("] ");
	}
}
