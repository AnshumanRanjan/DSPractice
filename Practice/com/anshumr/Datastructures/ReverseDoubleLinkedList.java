package com.anshumr.Datastructures;

import com.anshumr.Datastructures.LinkedList.Node;

/* Learnings
 * duble linkedliist has always addition in the head.prev 
 * */

public class ReverseDoubleLinkedList{

	static Node head; 
	  
    static class Node { 
  
        int data; 
        Node next, prev; 
  
        Node(int d) { 
            data = d; 
            next = prev = null; 
        } 
    }
    
    void push(int new_data) {
    	
    	Node nextNode = new Node(new_data);
    	nextNode.prev = null;
    	nextNode.next = head;
    	if(head != null )
    	{
    		head.prev = nextNode;
    	}
    	head = nextNode;
    }
    
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
    void reverse() {
    	/*
    	 * 10.next = 8
    	 * 10.prev = null
    	 * 
    	 * 
    	 * 10.next = null
    	 * 10.prev = 8
    	 * 
    	 * 
    	 * 
    	 * Null <--Prev--  (10) --Next--> 8
    	 *                      <--Prev--
    	 *    10.next = 8
    	 *    10.prev = null
    	 *    
    	 *    8.next=6
    	 *    8.prev=10
    	 * 
    	 */
    //	10-->8-->4-->2
    	Node currNode = head;
    	Node TempNode = null;
    	while(currNode != null)
    	{
    		TempNode = currNode.prev;
    		currNode.prev = currNode.next;
    		currNode.next = TempNode;
    		currNode = currNode.prev;
    	}
        head = TempNode.prev; 
    	
    }
    
    
	public static void main(String args[])
	{
		ReverseDoubleLinkedList list = new ReverseDoubleLinkedList(); 
		  
	        /* Let us create a sorted linked list to test the functions 
	         Created linked list will be 10->8->4->2 */
	        list.push(2); 
	        list.push(4); 
	        list.push(8); 
	        list.push(10); 
	  
	        System.out.println("Original linked list "); 
	        list.printList(head); 
	  
	        list.reverse(); 
	        System.out.println(""); 
	        System.out.println("The reversed Linked List is "); 
	        list.printList(head); 
	}
	
}
