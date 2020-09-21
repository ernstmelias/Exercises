package datastructures;

import java.util.List;

public class TreeNode {
	private int value;
	private ArrayListCus<TreeNode> children;
	
	public TreeNode(int value)
	{
		this.value = value;
		this.children = new ArrayListCus<TreeNode>();
	}
	public TreeNode()
	{
		this.value=0;
		this.children = new ArrayListCus<TreeNode>();
	}
	public void setValue(int val )
	{
	this.value = val;
	}
	
	public int getValue()
	{
    return this.value;
	}
	public void addChildren(TreeNode anode)
	{
	 this.children.add(anode);	
	}
	public  ArrayListCus<TreeNode> getChildred()
	{
		return this.children;
	}
	
	public TreeNode getNode(int value)
	{
	 if(this.children.size() ==0)
	 {
		 return null;
	 }
	 for(int i = 0; i < this.children.size() ; i++)
	 {
		if(((TreeNode) this.children.get(i)).getValue() == value) 
		{
			return (TreeNode)this.children.get(i);
		}
	 }
	 return null;
	}
	public boolean removeNode(int value)
	{
		if(this.children.size() ==0)
		 {
			 return true;
		 }
		 for(int i = 0; i < this.children.size() ; i++)
		 {
			if(((TreeNode) this.children.get(i)).getValue() == value) 
			{
				this.children.remove(i);
				return true;
			}
		 }	
		 return false;
	}
	
	public static void print(TreeNode aNode)
	{
		System.out.println(aNode.getValue());
		System.out.println("|");
		
		for(int i=0; i < aNode.getChildred().size(); i++)
		{
		  TreeNode current  = (TreeNode) aNode.getChildred().get(i);
		  if(current.getChildred().size()==0)
		  {
			  System.out.println(current.getValue()); 
			  return;
		  }
		  print(current);
		}
	}
	
}
