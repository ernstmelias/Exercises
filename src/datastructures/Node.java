package datastructures;

public class Node {
 private Object text;
 private Node next;
 
 public Node(Object node)
 {
	text = node;
	next = null;
 }
 public void setNode(Object data)
 {
	 text = data;
 }
 public Object getData()
 {
	 return text;
 }
 public void setNext(Node nnext)
 {
	 next = nnext;
 }
 public Node getNext()
 {
	 return next;
 }
}
