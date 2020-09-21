package datastructures;

import java.util.Stack;

public class SetofStacks {
	 private int stackThreshold;
	 private Plate [] headPlateStack;
	 private Stack<Plate []> masterStack;
	public SetofStacks(int stackThreshold)
	{
	 this.stackThreshold = stackThreshold;
	 headPlateStack = new Plate [stackThreshold];
	 masterStack = new Stack<Plate []> ();
	}
	
	public  void push( Plate aItem)
	{
		Stack<Plate[]> tempMaster   = new Stack<Plate[]> ();
		// empty stack of plates and empty stack of stacks
	  if(masterStack.size() == 0 && headPlateStack.length < stackThreshold)	
	  {
		  for(int i=0 ; i < headPlateStack.length; i++)
		  {
			  if(headPlateStack[i] == null)
			  {
				  headPlateStack[i]= aItem;
			  }
		  }
		  masterStack.push(headPlateStack);
	  }
	  
	  while(masterStack != null)
	  {
		  Plate [] temp =  masterStack.pop();
		  //  no space
		  if(temp.length == stackThreshold)
		  {
			 tempMaster.push(temp);
		  }
		  // some space
		  if(temp.length  < stackThreshold)
		  {
			  for( int k=0; k < temp.length ; k++)
			  {
				  if(temp[k] == null)
				  {
					  temp[k] = aItem;
				  }
			  }
			tempMaster.push(temp);
		  }
	  }
	   masterStack = tempMaster;
	   // no space at all left
	   if(!masterStack.contains(aItem))
	   {
		  Plate [] emptyStack = buildEmptyStack();
		  emptyStack[0]= aItem;
		  masterStack.add(emptyStack);
	   }
	  
	}
   
	public Plate pop()
	{
	  Plate [] temp = masterStack.pop();
	  return temp[0];
	}
	
	public Plate popAt(int index)
	{
		Plate [] current = masterStack.pop();
		if(current[index] == null)
		{
			return null;
		}
		Plate  result = current[index];
		current[index] = null;
		// reduce size by one
		Plate [] lessThan = new Plate [ current.length - 1];
		for(int i= 0; i < current.length; i++)
		{
			if(current[i] != null)
			{
				lessThan[i] = current[i];
			}
		}
		masterStack.push(lessThan);
		
		return result;
	}
	
	private Plate[] buildEmptyStack()
	{
	  Plate [] aStack  = new Plate[stackThreshold];
	  return aStack;
	}
	
	private boolean contains(Plate aItem)
	{
		return false;
	}
}
