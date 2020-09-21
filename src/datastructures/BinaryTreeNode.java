package datastructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTreeNode {
     private int value;
     private BinaryTreeNode leftChild;
     private BinaryTreeNode rightChild;
     
     public BinaryTreeNode()
     {
    	 this.value =0;
    	 this.leftChild = null;
    	 this.rightChild = null;
     }
     public BinaryTreeNode( int value)
     {
    	this.value = value;
    	this.leftChild = null;
    	this.rightChild = null;
     }
     public BinaryTreeNode(int value, BinaryTreeNode aleft, BinaryTreeNode aright)
     {
    	 this.value = value;
    	 this.leftChild = aleft;
    	 this.rightChild = aright;
     }
     public void setLeft(BinaryTreeNode aleft)
     {
    	 this.leftChild = aleft;
     }
     public BinaryTreeNode getLeft()
     {
    	 return this.leftChild;
     }
     public void setRight(BinaryTreeNode aRight)
     {
    	 this.rightChild = aRight;
     }
     public BinaryTreeNode getRight()
     {
    	 return this.rightChild;
     }
     public void setValue(int val)
     {
    	 this.value = val;
     }
     public int getValue()
     {
    	 return this.value;
     }
     public boolean isLeaft()
     {
    	 if(this.getLeft() == null && this.getRight()==null)
    	 {
    		 return true;
    	 }
    	 return false;
     }
	// inorder travasal depth first
     public static void inOrder(BinaryTreeNode aNode)
     {
      if(aNode.isLeaft())
      {
      System.out.println(aNode.getValue());
      return;
      }
      inOrder(aNode.getLeft());
      System.out.println(aNode.getValue());
      inOrder(aNode.getRight());
     }
	
	// pre-order traval aka depth first travasal.
     
     public static void preOrder(BinaryTreeNode aNode)
     {
      if(aNode.isLeaft())
      {
      System.out.println(aNode.getValue());
      return;
      }
      
      System.out.println(aNode.getValue());
      inOrder(aNode.getLeft());
      inOrder(aNode.getRight());
     }
	// post-order depth first
     
     public static void postOrder(BinaryTreeNode aNode)
     {
      if(aNode.isLeaft())
      {
      System.out.println(aNode.getValue());
      return;
      }
   
      inOrder(aNode.getLeft());
      inOrder(aNode.getRight());
      System.out.println(aNode.getValue());
     }
     
	
	// breadth
	public void breadthFirst(BinaryTreeNode aNode)
	{
		PriorityQueue<BinaryTreeNode> levels = new PriorityQueue<BinaryTreeNode> ();
		levels.add(aNode);
		while(!levels.isEmpty())
		{
		BinaryTreeNode current = levels.remove();
		System.out.println(current.getValue());
		levels.add(current.getLeft());
		levels.add(current.getRight());
		}
		
	}
	
	// depth
}
