package datastructures;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Logger {
	private Map<String,Integer> messages;
	/** Initialize your data structure here. */
    public Logger() {
       messages =  new LinkedHashMap<String,Integer>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */


	public boolean shouldPrintMessage(int timestamp, String message) 
    {
   
      if(messages.containsKey(message) == false)  
      {
    	  messages.put(message,timestamp);
    	  return true;
      }
      if(messages.containsKey(message) && message.equalsIgnoreCase("bug")==false)
      {  
    	  int saveTime = messages.get(message);
    	  if((saveTime != timestamp))
    	  {
    		  messages.put(message,timestamp);    
    	  }
    	  if(timestamp <= 10 )
    	  {
    		  return false;
    	  }
    	  if(timestamp > 10 )
    	  {
    	  if (saveTime == timestamp )
    	  {
    		  return false;
    	  }
    	  if ((saveTime != timestamp )&& (saveTime > 10) && (timestamp - saveTime < 10) )
    	  {
    		  return false;
    	  }
    	  return true;
    	  }
      }
      
      if(message.equalsIgnoreCase("bug"))
       {
    	  System.out.println("in condition");
	    int saveTime = messages.get(message);
	    if(timestamp <= 10 )
	    {
	    	return false;
	    }
	    if( timestamp > 10 && (saveTime == timestamp))
	    {
	    System.out.println("In here save " + saveTime + "timestamp: " + timestamp);
	    	return false;
	    }
	    if(timestamp > 10 && (saveTime != timestamp) &&  (timestamp - saveTime > 0))
	    {	
	     return true;
        }
	    
	    
    }
    
      return true;
}
	
    public boolean isNumber(String s) {
     boolean numb= false;
     try
     {
    	 Double.parseDouble(s);
    	 numb = true;
    	 return numb;
     }
     catch(Exception e)
     {
     }
     
     try
     {
    	 Integer.parseInt(s);
    	 numb = true;
    	 return numb;
     }
     catch(Exception e)
     {
     }
     
     try
     {
    	 Float.parseFloat(s);
    	 numb = true;
    	 return numb;
     }
     catch(Exception e)
     {
     }
     
     try
     {
    	 Long.parseLong(s);
    	 numb = true;
    	 return numb;
     }
     catch(Exception e)
     {
     }
     // made it out of standard checks
     if(numb == false)
     {
      int values=0;
      int operator=0;
      char[] valarr = s.toCharArray();
      for(int i=0; i < valarr.length ; i++)
      {
    	  try
    	     {
    	    	 String str = String.valueOf(valarr[i]);
    	    	 Integer.parseInt(str);
    	    	 values++;
    	     }
    	     catch(Exception e)
    	     {
    	    	 operator++;
    	     }  
      }
      
     
     }
    
	return numb;
    }
}