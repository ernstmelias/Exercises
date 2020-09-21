package datastructures;

public class Search {
	// assumes that the list is ordered
	public int  binarySearch(int [] list , int target)
	{
		
	 if( list.length==0 )
	 {
		 return -1;
	 }
	 if(list.length == 1 && list[0] == target)
	 {
		 return 0;
	 }
	 if(list.length == 1 && list[0] != target)
	 {
		 return -1;
	 }
	 
	 int midPoint = list.length / 2;
	 System.out.println("The midpoint is : " + midPoint + "the length: " + list.length);
	 if(list[midPoint] == target)
	 {
		 return midPoint;
	 }
	 // from 0... midPoint
	 if(target < list[midPoint])
	 {
	 int [] left =  new int[midPoint];
	 for(int i=0; i < midPoint; i++)
	 {
		 if(list[i] == target)
		 {
			 return i;
		 }
		left[i]= list[i] ;
	 }
	 binarySearch(left,target);
	 }
	 // from midPoint+1 ... n-1
	 if(target > list[midPoint])
	 {
	   int [] right = new int [ list.length - midPoint];
	   int start=0;
	   for(int j=midPoint; j < list.length ; j++)
	   {
		   if(list[j] == target)
			 {
				 return j;
			 }
		right[start]=list[j]  ;
		start++;
	   }
	   binarySearch(right,target);
	 }
	  return -1;
	}
}
