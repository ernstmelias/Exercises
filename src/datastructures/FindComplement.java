package datastructures;

import java.util.Stack;

public class FindComplement {
	
	public int findComplement(int num) {
	     Stack<Integer> binary  = new Stack<Integer>();
	     StringBuffer flip = new StringBuffer();
	      while(num !=0 )
	      {
	        int bit = num % 2;
	        binary.push(bit);
	         num = num /2;
	      }
	    
	    while(binary.size() !=0 )
	    {
	      int curr = binary.pop();
	      if (curr == 0)
	      {
	        flip.append("1");
	      }
	      if(curr == 1)
	      {
	       flip.append("0");
	      }
	    }
	    int result = Integer.parseInt(flip.toString(), 2);
	    return result;
	      
	    }

}
