package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Solution
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	/*public static int hasBalancedBrackets(String str)
	{
	  Stack<String> container =  new Stack<String>();
	  for(int i=0; i < str.length(); i++)
	  {
		container.push( Character.toString(str.charAt(i))) ; 
	  }
		while (container.size() > 0)
		{
		 String current = container.pop();
		 if (current.equals("}") && container.peek().equals("{"))
		 {
			 return 1;
		 }
		}
		return 0;
	}*/
	
	public static int hasBalancedBrackets(String str)
	{
		Stack<Character> balancer = new Stack<Character>();
		balancer.push('$');
		char next = 0;
		for(int i=0; i < str.length(); i++)
		{
		 char currentChar = str.charAt(i);
		 if( i != str.length() -1)
		 {
			 next = str.charAt(i +1);
		  if( (currentChar =='{') 
			   && (next !='{' && next !='}'))
		  {
			  return 0;
		  }
		 }
		
		 if((!balancer.isEmpty()) &&(currentChar=='{' || currentChar=='}') 
			&& (currentChar == balancer.peek() || balancer.peek()=='$'))
		 {
			 balancer.push(currentChar);
		 }
		 if((!balancer.isEmpty()) &&(currentChar=='{' ||currentChar=='}') 
			&& (currentChar != balancer.peek() && balancer.peek()!='$'))
		 {
			balancer.pop(); 
		 }
		}
		if(balancer.size()==1)
		{
			return 1;
		}
		return 0;
	}
	
	/*public Org_Employee closetCommonManager(Org_Employee ceo, Org_Employee employee1, Org_Employee employee2)
	{
		return isManger = isManger(ceo , employee1, employee2);
	
	}*/
	
	public Org_Employee isManger(Org_Employee boss , Org_Employee a, Org_Employee b)
	{
	 while(boss != null)
	 {
		 Org_Employee left =  boss.getLeftEmployee();
		 Org_Employee right = boss.getRightEmployee();
	
	 if( (left == a || left == b) && (right == a || right == b))
	 {
		 return boss;
	 }
	   isManger(left, a ,b);
	   isManger(right,a,b);
	   
	 }
	 
	  return null;
	}
	
	public class Org_Employee {
		private String title;
		private String name;
		private Org_Employee leftEmployee;
		private Org_Employee rightEmployee;
		
		public String getTitle()
		{
			return title;
		}
		public void setTitle(String x )
		{
			this.title = x;
		}
        
		
		public String getName()
		{
			return name;
		}
		public void setName(String x )
		{
			this.name = x;
		}
		
		public Org_Employee getLeftEmployee()
		{
			return leftEmployee;
		}
		public void setLeftEmployee(Org_Employee x )
		{
			this.leftEmployee = x;
		}
		
		public Org_Employee getRightEmployee()
		{
			return rightEmployee;
		}
		public void setRightEmployee(Org_Employee x )
		{
			this.rightEmployee = x;
		}
	}
     // brute force
	 public int occurrence(int x , int [] a)
	 {
		 int count =0;
		 for(int curr : a)
		 {
		  if( curr==x)
		  {
			  x++;
		  }
		 }
		 return count;
	 }
   // Olog(n) - optimized
	 public int occurrenceOp(int x , int [] a , int pivotpoint, int count)
	 {
		 
		 pivotpoint = a.length /2 ;
		if(a[pivotpoint] == x)
		{
			count++;
		}
		if( a[pivotpoint] >= x)
		{
        occurrenceOp(x,a, pivotpoint++, count);
		}
		if(a[pivotpoint] <= x)
		{
		
		occurrenceOp(x,a ,pivotpoint--, count);
		}
		if(pivotpoint == 0 || pivotpoint == a.length - 1)
		{
			return count;
		}
		return count;
	 }
	 public void caller(int x , int [] arr)
	 {
		 simplier(x,0,arr,0); 	 
	 }
	 // user recursion to iterate through an array
	 private void simplier(int x ,int pos, int [] arr , int results)
	 {
	  if(pos == 0)
	  {
		  pos = arr.length / 2;
	  }
	
	 if(arr[pos] == x)
	 {
		 System.out.println("In equals");
		 results = results + 1;
		 int left = pos -1;
		 int right = pos + 1;
		 simplier(x,left,arr,results);
		 simplier(x,right,arr,results);
	 }
	 if(arr[pos] > x )
	 {
		 System.out.println("<");
		 pos = pos - 1;
		 if(pos ==0)
		 {
			 System.out.println("Appeared: " + results);
			 return;	 
		 }
		 simplier(x,pos, arr,results); 
	 }
	 if(arr[pos] < x)
	 {
		 
		 int mvright = pos + 1;
		 System.out.println(">: "+ pos + " " +  (arr.length -1));
		 if(pos == arr.length -1)
		 {
			 System.out.println("Appeared: " + results);
			 return;
		 }
		 simplier(x,mvright, arr,results); 
	 }
	
	 }
	 
	 public void nextGreaterNumber(int x)
	 {
      Stack<Integer> tempNumber = new Stack<Integer>();
      while(x > 0)
      {
    	  tempNumber.push( x % 10);
    	  x = x /10;
      }
      int [] container = new int [tempNumber.size()];
      int pos = 0;
      int len = tempNumber.size();
      while(pos < len)
      {
       container[pos]= tempNumber.pop();
       pos++;
      }
      if(decreasingOrder(container))
      {
    	System.out.println("Not Possible");  
    	return;
      }
      if(increacsingOrder(container))
      {
    	int temp  = container[container.length -1];
    	container[container.length -1] = container[container.length -2];
    	container[container.length-2] = temp;
        for(int i=0; i < container.length ; i++)
        {
        	System.out.print(container[i]);
        }
        return;
      }
      int base= container[0];
     for(int i=1; i < container.length ;i++)
     {
    	 int curr = container[i];
    	 for(int j=i+1;  j <container.length -1 ; i++)
    	 {
    	  if(curr > container[i]) 
    	  {
    	   int temp = container[j];
    	   container[j]=curr;
    	   curr = container[j];
    	   
    	  }
    	 }
     }
     
      int lg = container[2];
      container[2] = container[1];
      container[1] = lg;
      
      for(int i=0; i < container.length ; i++)
      {
      	System.out.print(container[i]);
      }
      
      
	 }
	 private boolean decreasingOrder(int [] a)
	 {
	   int i=0;
	   while (i < a.length -1)
	   {
		 if(a[i+1] > a[i])
		 {
			 return false;
		 }
		 i++;
	   }
		return true;
		 
	 }
	 private boolean increacsingOrder(int [] a)
	 {
		 int i=0;
		   while (i < a.length -1)
		   {
			 if(a[i+1] < a[i])
			 {
				 return false;
			 }
			 i++;
		   }
		return true; 
	 }
	 
	 
	
		    public List<String> fizzBuzz(int n) {
		     List<String> nums = new ArrayList<String>();
		     int i=1;
		     while( i <= n)
		     {
		      if( i % 3 == 0 && i % 5 !=0) 
		      {
		         nums.add("Fizz");
		      }
		      if(i % 5 == 0 && i % 3 != 0)
		      {
		          nums.add("Buzz");
		      }
		      if(i % 3 == 0 && i % 5 == 0)
		      {
		          nums.add("FizzBuzz");
		      }
		      if(i % 3 != 0 && i % 5 !=0 && i % 15 !=0)
		      {
		          nums.add(Integer.toString(i));
		      }
		       i++;  
		     }
		      return nums;
		    }
		
	 
	
}