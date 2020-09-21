# Exercises

Different data Structure and algorithm exercises.

## Examples

```Java

	public int [] MergeSortRun(int [] input)
	{
	 int [] result = mergeSortSplit(input);
	 return result;
	}
	private int [] mergeSortSplit(int [] in )
	{
	 if( in.length < 2)
	 {
		 return  in;
	 }
	 
	 int middle =  in.length / 2 ;
	 int [] left = new int[middle];
	 int [] right = new int[in.length - middle];
	 
	 for(int i=0; i< middle ; i++)
	 {
		 left[i] = in[i];
	 }
	 int x=0;
	 for(int j= middle; j < in.length; j++)
	 {
		 right[x] = in[j];
		 x++;
	 }
	 left= mergeSortSplit(left);
	 right= mergeSortSplit(right);
	 
	 int [] result = mergeSortMerge(left,right);
	 return result;
	}
	private int [] mergeSortMerge(int [] left, int [] right) 
	{
	int [] result = new int[left.length + right.length];
	int indexLeft =0;
	int indexRight = 0;
	int resultIndex =0;
	
	while( indexLeft < left.length || indexRight < right.length)
	{
		 // combining left and right array after being sorted
	    if(indexLeft < left.length  && indexRight < right.length)
	    {
	    	if(left[indexLeft] <= right[indexRight])
	    	{
	    		result[resultIndex] = left[indexLeft];
	    		indexLeft++;
	    		resultIndex++;
	    	}
	    	else
	    	{
	    		result[resultIndex] = right[indexRight];
	    		indexRight++;
	    		resultIndex++;
	    	}
	    }
	    
	    // sorting left only 
	    else if(indexLeft < left.length)
	    {
	    	result[resultIndex] = left[indexLeft];
	    	resultIndex++;
	    	indexLeft++;
	    }
	    // sorting right only 
	    else  if(indexRight < right.length)
	    {
	    	result[resultIndex]  = right[indexRight];
	    	resultIndex++;
	    	indexRight++;
	    }
	}
	return result;
	}


```

## Getting Started

To begin using this template, choose one of the following options to get started:
* Clone the repo: `git clone https://github.com/ernstmelias/Exercises.git`
* Fork the repo