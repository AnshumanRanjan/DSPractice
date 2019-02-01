package com.anshumr.Datastructures;

/*
 * Use double pointers when  querying from the end  
 * o(n) , 
 */
import com.anshumr.Datastructures.LinkedList.Node;

public class NlastElementLinkedlist {
	static Node  head;

	static class Node
	{
		int data ;
		Node next = null;
		Node(int data) {this.data = data ; next = null;};

	}
	public static void push(int data ) {
		Node NewNode = new Node(data);
		if (head != null)
		{
		NewNode.next = head;
		}
		head = NewNode;			
	}
	public static  int nLastElem(int num)
	{
		
		Node pointer1 = head;
		Node pointer2 = head;
		
		for (int i =0 ; i<num;i++)
		{
			pointer2=pointer2.next;
		}
		
		while(pointer2 != null)
		{
			pointer1=pointer1.next;
			pointer2=pointer2.next;
		}
		return pointer1.data;
		
	}
	
	public  static void main(String args[])
	{
		NlastElementLinkedlist n1 = new NlastElementLinkedlist();
		NlastElementLinkedlist.push(2);
		NlastElementLinkedlist.push(3);
		NlastElementLinkedlist.push(4);
		NlastElementLinkedlist.push(6);
		Node n = head;
		while(n != null)
		{
		System.out.print(n.data + "-->");
		n = n.next;
		}
		System.out.println();
		System.out.println(nLastElem(2) );
		
	}
	
}
