package datastructures;

import java.util.Collection;

// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
public class ErnstLinkedList<T> {
	private Node head;
	private Node tail;
	private int size;
	
	/**
	 * General constructor
	 */
	public ErnstLinkedList()
	{
	head = null;
	size =0;
	}
	/**
	 * Collection constructor
	 * @param elements
	 */
	public ErnstLinkedList(Collection <T> elements)
	{
		//addAll(elements);	
	}
	/**
	 * Appends the specified element to the end of this list.
	 */
	public boolean 	add(T e)
	{
		if(e == null)
		{
			return false;
		}
	 if(head ==null)
	 {
	 head = new Node(e);
	  size++;
	  return true;
	 }
	 Node toAdd = new Node(e);
	 Node tempHead = head;
	 while(tempHead.getNext() !=null)
	 {
		tempHead = tempHead.getNext(); 
	 }
	 tempHead.setNext(toAdd);
	 size++;
	 return true;
	}
	/**
	 * Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 * @param index
	 * @param c
	 * @return
	 *//*
	public boolean 	addAll(Collection<? extends T> c)
	{
		
	}
	*//**
	 * Inserts the specified element at the beginning of this list.
	 * @param first
	 *//*
	public void addFirst( T first)
	{
	if(head == null)
	{
	 head = new Node(first);
	}
	Node oldHead = head;
	Node newHead = new Node(first);
	while(head.getNext()!=null)
	{
		newHead.setNext(head.getNext());
	}
	newHead.setNext(oldHead);
	size++;
	head = oldHead;
	}
	
	*//**
	 * Removes all of the elements from this list.
	 *//*
	public void clear()
	{
	while(head.getNext()!=null)
	{
	 head.getNext().setNode(null);
	}
	head = null;
	size=0;
	}
	*//**
	 * Returns a shallow copy of this LinkedList.
	 *//*
	@SuppressWarnings("rawtypes")
	public Object clone()
	{
		ErnstLinkedList clone = (ErnstLinkedList)super.clone();
		return clone;
	}
	*//**
	 * Returns true if this list contains the specified element.
	 * @param data
	 * @return
	 *//*
	public boolean contains(T data) 
	{
		if(data == null)
		{
			return false;
		}
		if(head == null)
		{
			return false;
		}
		if(head.getData() == data)
		{
			return true;
		}
		Node temp = head;
		while(temp.getNext() !=null)
		{
         if(temp.getData() == data)
         {
        	 return true;
         }
		}
		return false;
	}
	*//**
	 * Returns the element at the specified position in this list.
	 * @param index
	 * @return
	 *//*
	public Object get(int index)
	{
	if(index  < 0)
	{
		return null;
	}
	 int counter=0;
	 if(head == null)
	 {
		 return false;
	 }
	Node temp = head;
	while(temp.getNext()!=null)
	{
	 if(counter == index)
	 {
		 return temp.getData();
	 }
	 counter++;
	}
	return null;
	}
	*//**
	 * Returns the first element in this list.
	 * @return
	 *//*
	public Object getFirst()
	{
		if(head== null)
		{
			return null;
		}
		Node temp = head;
		return temp;
	}
	*//**
	 * Returns the last element in this list.
	 * @return
	 *//*
	public Object getLast()
	{
		if(head== null)
		{
			return null;
		}
		while()
	}
	*//**
	 * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 *//*
	public int  indexOf(Object o)
	{
		
	}
	*//**
	 * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 *//*
	public int 	lastIndexOf(Object o)
	{
		
	}
   *//**
    * Retrieves, but does not remove, the head (first element) of this list.
    * @return
    *//*
	public Object peek()
	{
		
	}
	*//**
	    * Retrieves, but does not remove, the head (first element) of this list.
	    * @return
	    *//*
	public Object peekFirst()
	{
		
	}
	*//**
	 * Retrieves and removes the head (first element) of this list.
	 * @return
	 *//*
	public Object remove()
	{
		
	}
	*//**
	 * Removes the element at the specified position in this list.
	 * @param index
	 * @return
	 *//*
	public Object remove(int index)
	{
		
	}
	*//**
	 * Removes the first occurrence of the specified element from this list, if it is present.
	 * @param o
	 * @return
	 *//*
	public Object 	remove(Object o)
	{
		
	}
	*//**
	 * Replaces the element at the specified position in this list with the specified element.
	 * @param index
	 * @param element
	 * @return
	 *//*
	public boolean set(int index, E element)
	{
		
	}
	*//**
	 * Returns the number of elements in this list.
	 * @return
	 */
	public int size()
	{
	 return size;	
	}
	private void setHead(Node nHead)
	{
		head = nHead;
	}
	public Node getHead()
	{
		return head;
	}
	public void setSize(int nSize)
	{
		size = nSize;
	}
	public int getSize()
	{
		return size;
	}
}
