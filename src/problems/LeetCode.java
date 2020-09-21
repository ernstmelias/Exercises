package problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LeetCode {
    /**
     * Reverse a string runtine 6ms 
     * @param s
     * @return
     */
	public String reverseString(String s)
	{
	StringBuffer last = new StringBuffer();
	 char [] letters = s.toCharArray();
	 int end = letters.length -1;
	 while(end >= 0)
	 {
		last.append(letters[end]); 
		end--;
	 }
	 return last.toString();
	}
	
	public int[] twoSum(int[] nums, int target) {
	       int [] res = new int [2] ;
	       Set<Integer> numbSet = new HashSet<Integer>();
	       for(int i=0; i < nums.length ; i++)
	       {
	    	for(int j=i+1; j < nums.length; j++) 
	    	{
	    	 if((nums[i] + nums[j]) == target )
	    	 {
	    		 numbSet.add(j);
	    		 numbSet.add(i);
	    	}
	    	 }	
	    	}
	      int p =0;
	      for(Integer temp : numbSet)
	      {
	       res[p++] = temp;
	      }
	       return res;
	    }
	
public String convert(String s, int numRows) {
	if(numRows == 1)
    {
  	  return s;
    }
	  String solution = "";
	  StringBuffer res [] = new StringBuffer [numRows] ;
	  for(int i=0; i < res.length ; i++ )
	  {
		 res[i] = new StringBuffer();
	  }
      
      int counter =0;
      for(int i=0; i < s.length() ; i++)
      {
    	  if(counter  == numRows -1)
    	  {
    		counter--;  
    	  }
    	  else
    	  {
    		  counter++;  
    	  }
    	  res[counter].append(s.charAt(i));
    	  
      }
      
      for(int j=0; j < res.length; j++)
      {
    	  solution+= res[j].toString();
      }
      System.out.println("solution:" + solution);
      return solution;
    }
/*public int depthSum(List<Object> nestedList) {
      int i=0;
      while(i < nestedList.size())
      {
     Object current = nestedList.get(i);
     if(current instanceof Integer)
     {
    	 
     }
     if(current instanceof List)
     {
    	 
     }
     i++;
      }
    }*/

}
