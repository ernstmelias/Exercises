package datastructures;

import java.util.Random;

public class Sort {
	/**
	 *  MergeSort
	 *  Divide and conquer algorithm - breaks a complex problem into smaller parts
	 *  works best wort recursion.
	 *  performance is O(n log n) - for n elements does the merge case log n times
	 *  best to user with larger datasets  probally min 10,000 in real ife situation.
	 *  worst case will occur in when the max number of comparisons have to be made such the array is nearly sorted.
	 *  Though efficient quicksort is more superior in most cases because it does not require additional space &
	 *   and offers spaceial locality.
	 */
	public Sort(){}
	
	public int [] mergeSort(int [] input)
	{
		int[] result= mergeSortSplit(input);
		return result;
	}
	
	public int [] mergeSortSplit( int [] input)
	{
		if( input.length < 2)
		{
			return input;
		}
		int middle = input.length / 2;
		int [] left = new int[middle];
		int [] right = new int[input.length - middle];
		
		for(int i=0; i< middle; i++)
		{
			left[i]= input[i];
		}
		int x =0;
		for(int j=middle; j < input.length ; j++)
		{
			right[x] = input[j];
			x++;
		}
		left = mergeSortSplit(left);
		right = mergeSortSplit(right);
		
		int [] result = mergeSortMerge(left,right);
		
		return result;
	}

public int [] mergeSortMerge(int [] left , int [] right)
{
	int  [] result = new int [left.length + right.length];
	int indexLeft=0;
	int indexRight=0;
	int indexRes=0;
	while( (indexLeft < left.length) || (indexRight < right.length))
	{
		if( indexLeft < left.length && indexRight < right.length)
		{
		 if(left[indexLeft] <= right[indexRight])
		 {
		   result[indexRes]= left[indexLeft];
		   indexLeft++;
		   indexRes++;
		 }
		 else
		 {
		  result[indexRes] = right[indexRight];
		  indexRight++;
		  indexRes++;
		 }
		}
		else if ( indexLeft < left.length)
		{
		result[indexRes] = left[indexLeft];
		indexLeft++;
		indexRes++;
		}
		else if (indexRight < right.length)
		{
		result[indexRes] = right[indexRight];
	    indexRight++;
	    indexRes++;		
		}
	}
	
	return result;
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
