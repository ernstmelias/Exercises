package datastructures;

import java.util.*;

public class FindWords {
	
	 public static String[] findWords(String[] words) {
	     
	       ArrayList<String> result = new ArrayList<String>();
	       String row1 = "QWERTYUIOP" ;
	       String row2 = "ASDFGHJKL";
	       String row3 = "ZXCVBNM";
	       
	       int i=0;
	        while(i < words.length)
	       {
	         String currentWord = words[i].toUpperCase();
	         String orig = words[i];
	         
	          int z=0;
	          int count1=0;
	          int count2=0;
	          int count3=0;
	          
	          while(z < currentWord.length())
	          {
	         if(row1.contains(Character.toString(currentWord.charAt(z))))
	         {
	          count1++;
	         }
	         
	         if(row2.contains(Character.toString(currentWord.charAt(z))))
	         {
	          count2++;
	         }
	         
	         if(row3.contains(Character.toString(currentWord.charAt(z))))
	         {
	          count3++;
	         }
	          z++;
	          }
	          if(count1 == currentWord.length() || count2 == currentWord.length() || count3 == currentWord.length() )
	          {
	            result.add(orig);
	          }
	          
	         i++;
	       }
	       return result.toArray(new String[result.size()]);
	    }

}
