package datastructures;

import java.util.Arrays;
import java.util.Collection;

/*@author Ernst Melias
 *  Custom arraylist implementation.
 *  https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 */
public class ArrayListCus<T> {
 private  int size = 0;
 private final int LENGTH = 10;
 private Object elements [];
 
 /**
  * General Constructor that initialize collection.
  */
 public ArrayListCus()
 {
	 elements = new Object[LENGTH];
 }
 public ArrayListCus(int initial)
 {
	 elements = new Object[initial];
 }
 /**
  * Constructor that that takes in collection and initializes elmement.
  * @param cpyelements
  */
 public ArrayListCus(Collection <T> elements)
 {
	 addAll(elements) ;
 }
 /**
  * Inserts the element to the end of this list.
  * @param element
  * @return
  */
 public boolean add(T element)
 {
   if(size == LENGTH)
   {
	   int nSize = (size * 3/2) + 1;
	   ensureCapacity(nSize) ; // formula (current capacity x 3/2) +1 change
   }
   elements[size++] = element;
   
	 return false;
 }
 /**
  * Inserts the element in a specific posistion in the list
  * @param index
  * @param element
  */
 public void add(int index, T element)
 {
	if (index < 0 || index > size)
	{
		throw new IndexOutOfBoundsException();
	}
	ensureCapacity(size + 1) ;
	
	Object old = elements[index];
	elements[index] = element;
	int end = index +1;
	int start = size -1;
	while(start > end)
	{
	 elements[start]= elements[start -1];
	 start --;
	}
	elements[end] = old;
 }
 /**
  * Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
  * @param elements
  * @return
  */
 public boolean addAll(Collection<T> nElements)
 {
	 int pivot = size;
	 Object [] temp = Arrays.copyOf(elements, size + nElements.size());
	 Object [] additions = nElements.toArray();
	 for(int i = pivot; i < temp.length ; i++)
	 {
		 for (int j = 0 ; j < pivot - 1; j++)
		 {
			 temp[i+1] = additions[j];
		 }
	 }
	 elements = temp;
	 return true;
 }

 /**
  * Removes all of the elements from this list.
  */
 public void clear()
 {
	 Object [] temp = Arrays.copyOf(elements, 0); 
	 elements = temp;
	 Object [] temp2 = Arrays.copyOf(elements, LENGTH);
	 elements = temp2;
 }
 /**
  * Returns true if this list contains the specified element.
  * @param element
  * @return
  */
 public boolean contains (T element)
 {
	 int i = 0;
	 while( i < size)
	 {
		 if(elements[i] == element)
		 {
			 return true;
		 }
		 i++;
	 }
	 return false;
 }
 /**
  * Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument
  * @param minCapacity
  */
 public void ensureCapacity(int minCapacity)
 {
	 Object [] temp = Arrays.copyOf(elements, minCapacity); 
	  elements = temp;
 }
 /**
  * Returns the element at the specified position in this list.
  * @param index
  * @return
  */
 public Object get(int index)
 {
	 return elements[index];
 }
 /**
  * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
  * @param o
  * @return
  */
 public int indexOf(Object o)
 {
	 int i = 0;
	 while( i < size)
	 {
		 if(elements[i] == o)
		 {
			 return i;
		 }
		 i++;
	 } 
	 return - 1;
 }
 /**
  * Returns true if this list contains no elements.
  * @return
  */
 public boolean isEmpty()
 {
	 if(size==0)
	 {
		 return true;
	 }
	 return false;
 }
 /**
  * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
  * @param o
  * @return
  */
 public int lastIndexOf(Object o)
 {
	 int lastIndex = -1;
	 int i = 0;
	 while( i < size)
	 {
		 if(elements[i] == o)
		 {
			 lastIndex = i;
		 }
		 i++;
	 } 
	 return lastIndex;
 }
 /**
  * Removes the element at the specified position in this list.
  * @param index
  * @return
  */
 public Object 	remove(int index)
 {
	 if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException();
		}
	 Object e = elements[index];
	 elements[index] = null;
	 while(index  > 0)
	 {
		 elements[index] = elements[index -1];
		 elements[index-1] = null;
		 index --;
	 }
	 Object [] temp  = Arrays.copyOf(elements, size - 1);
	 elements = temp;
	 
	 return e;
 }
 /**
  * Removes the first occurrence of the specified element from this list, if it is present.
  * @param o
  * @return
  */
 public boolean remove(Object o)
 {
	 int i = 0;
	 int index = -1;
	 while( i < size)
	 {
		 if(elements[i] == o)
		 {
			elements[i] = null;
			index =i;
			break;
		 }
		 i++;
	 } 
	 
	 while(index  > 0)
	 {
		 elements[index] = elements[index -1];
		 elements[index-1] = null;
		 index --;
	 }
	 Object [] temp  = Arrays.copyOf(elements, size - 1);
	 elements = temp;
	 
	 return true;
 }
 /**
  * Returns the number of elements in this list.
  * @return
  */
 public int size()
 {
	return size; 
 }
 
}
