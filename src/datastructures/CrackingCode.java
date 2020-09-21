package datastructures;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class CrackingCode {
	
	/**
	 * Tell if a string contains nothing but unique strings. 
	 * @param input
	 * @return
	 */
	public boolean uniqueStr(String input)
	{
	char [] letters = input.toCharArray();
	for(int i=0; i < letters.length; i++)
	{
		char current = letters[i];
	 for(int j= i+1; j < letters.length -2 ; j++)
	 {
		if(current == letters[j]) 
		{
		 return false;	
		}
	 }
	} // end
	 return true;
	}
	/**
	 *  reverse a string
	 */
	public String reverseStr(String input)
	{
		StringBuffer reverse = new StringBuffer();
		char [] word = input.toCharArray();
		for(int i= word.length; i > 0; i--)
		{
		 reverse.append(word[i]);
		}
		return reverse.toString();
	}
	public boolean  isPermutation(String first, String second)
	{
		return false;
		// abc - > a+ bc , a +cb
		
	}
	  /**
	   * String permutation.
	   * @param prefix
	   * @param str
	   * @param set
	   * @param level
	   */
       private void permutation(String prefix, String str, boolean [] set, int level)
       {
    	if(str.length() == level) 
    	{
    		return;
    	}
    	for(int left=0; left <  str.length() ; left++)
    	{
    		if(set[left]) continue;
    		permutation(str.substring(left, left+1),str.substring(left+1, str.length()-1), set, str.substring(left+1, str.length()-1).length());
    		set[left]= false;
    	}
       }
       /**
        * Character replace in a string.
        * @param input
        * @return
        */
       public String replaceStr(String input)
       {
    	 return input.replace(" ", "%20");
       }
       
       /**
        * Chracter repalce another implementation.
        * @param input
        * @return
        */
       public String replaceStrSec(String input)
       {
    	  char [] result = input.toCharArray();
    	  for(int i=0; i < result.length; i++)
    	  {
    		  if(result[i] == ' ')
    		  {
    			  result[i]= '%' + 20;
    		  }
    	  }
    	  return result.toString();
       }
       
       /**
        * String compressor
        * @param input
        * @return
        */
       public String compressStr(String input)
       {
    	   ArrayListCus<Object []> dictionary = new ArrayListCus<Object[]> ();
    	   for(int i=0; i< input.length(); i++)
    	   {
    		 String curr = input.substring(i, i);
    		
    		 for(int j=0; j < dictionary.size() ; j++)
    		 {
    			Object [] currObj = (Object[]) dictionary.get(j) ;
    			String key  = (String)currObj[0];
    			if(curr.equals(key))
    			{
    			int count = (Integer) currObj[1];
    			count++;
    			currObj[1] = count;
    			}
    			else
    			{
    			 Object [] newSet = new Object [2];
    			 newSet[0] = curr;
    			 newSet[1] = 0;
    			 dictionary.add(newSet);
    			}
    			
    		 }
    		 // now produce your string and output correct string
    		 StringBuffer result = new StringBuffer();
    		 for(int m=0; m < dictionary.size() ; m++)
    		 {
    			 Object [] piece = (Object[]) dictionary.get(m);
    			 result.append((String) piece[0]);
    			 result.append((Integer)piece[1]);
    		 }
    		 if(result.toString().length() < input.length())
    		 {
    			 return result.toString();
    		 }
    		 
    	   }
    	   return input;
       }
       
       /**
        * Rotating an M x N image represented by 4 pixels each.
        * double check this
        */
       public int[][]  rotateImage(int m, int n, int[][] image)
       {
    	  for(int p=0;  p<  m - 1 ; p++)
    	  {
    		  for(int j=0; j < n-1; j++)
    		  {
    			image[p] [j]  = image[p++][j++];
    		  }
    	  }
    	  return  image;
       }
       
       /**
        * Remove duplicates from an unsortered list.
        * @param input
        * @return
        */
       public LinkedList<Object> removeDups(LinkedList<Object> input)
       {
    	   Set<Object> orderedInput = new LinkedHashSet<Object>();
    	   for(int i=0 ;  i < input.size() ; i++)
    	   {
    		  orderedInput.add(input.get(i));
    	   }
    	   LinkedList<Object> result = new LinkedList<Object>();
    	   result.addAll(orderedInput);
    	   
    	   return result; 
       }
       
       /**
        * pretty sure this is wrong didn't understand the problem question page 77 Cracking the coding Interview.
        * @param k
        * @param input
        * @return
        */
       public  Object findKthElement(int k, LinkedList<Object> input)
       {
    	   return input.get(k);
       }
       /**
        * remove a node from a linkedlist
        * @param node
        */
       public void removeNode(Object node)
       {
    	   LinkedList<Object> internal = new LinkedList<Object>();
    	   boolean removed = internal.remove(node);
    	   System.out.println("removed: " + removed);
       }
       /**
        * Partition a integer linkedList
        * @param x
        * @param input
        * @return
        */
       public LinkedList<Integer> partitionList(int x, LinkedList<Integer> input)
       {
    	   LinkedList<Integer> left =  new LinkedList<Integer>();
    	   LinkedList<Integer> right =  new LinkedList<Integer>();;
    	   LinkedList<Integer> result =  new LinkedList<Integer>();;
    	   for(int i=0; i < input.size() ; i++)
    	   {
    		   if(input.get(i) < x)
    		   {
    			 left.add(input.get(i));
    		   }
    		   if(input.get(i) > x)
    		   {
    			   right.add(input.get(i));
    		   }
    		
    	   }
    	   result.addAll(left);
    	   result.addAll(right);
    	   
    	   return result;
       }
       /**
        * Add two integers represented by LinkedList where each node contains one integer and they 
        * are in reverese order.
        * @param a
        * @param b
        * @return
        */
        public int sumList(LinkedList<Integer> a , LinkedList<Integer> b)
			{
        	 StringBuffer numOrderOne = new StringBuffer();
        	 StringBuffer numOrderTwo = new StringBuffer();
        	 
	         int sum = -1;
	         for(int i =a.size(); i > 0 ; i--)
	         {
	        	 numOrderOne.append(a.get(i));
	         }
	         
	         for(int m =b.size(); m > 0 ; m--)
	         {
	        	 numOrderTwo.append(b.get(m));
	         }
	          sum  =   Integer.parseInt(numOrderOne.toString()) + Integer.parseInt(numOrderTwo.toString());
	         return sum;
            }
        
        
       
       
}
