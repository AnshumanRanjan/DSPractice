package com.anshumr.Datastructures;
import java.util.*; 
public class LinkedList {
	static Node  head;
	
	static class Node
	{
		static int classcounter =0;
		int data ;
		Node next = null;
		Node(int data) {this.data = data ; next = null;classcounter++; };
		
	}
	static public void push(int data ) {
		Node NewNode = new Node(data);
		NewNode.next = head;
		head = NewNode;
	}
	
	static boolean detectLoop(Node n)
	{
	HashSet<Node> hash = new HashSet<Node>();
	while (n != null)
	{
		if (hash.contains(n) )
		{
			return true;
		}
		else
		{
			hash.add(n);
			n=n.next;
		}
	}
	return false;
		
	}
	
	static int countloop(Node n) {
		int counter =0;
		Node last = n;
		while (n.next != last )
		{
			counter++;
		}
		return counter;
		
	}
	
	static  boolean  floydscyclefindingalgorithm(Node n)
	{
		// Create a  slow moving node pointer and  a fast moving node pointer 
		Node slownode = n;
		Node fastnode = n;
		while (slownode != null &&  fastnode !=null && fastnode.next != null)
		{
			slownode = slownode.next;
			fastnode = fastnode.next.next;
			if (slownode == fastnode)
			{
				System.out.println("Loop found length of loop: " + countloop(fastnode));
				return  true;
			}	
		}
		return false;
		
	}
	public static StringBuffer printll(LinkedList llist)
	{
	Node llist1 = llist.head; 
    /*Create loop for testing */
	final  StringBuffer printll = new StringBuffer();
	HashSet<Node> hset  = new HashSet<Node>();
	while (llist1 != null && hset.contains(llist1) != true){
		hset.add(llist1);
		//System.out.print(llist1.data+"-->");
		printll.append(llist1.data+"-->");
		
	    llist1=llist1.next;
	    
	}
	
	return printll;
	}
	
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList(); 
        
		llist.push(5); 
		llist.push(4); 
		llist.push(3); 
		llist.push(2); 
		llist.push(1); 

		System.out.println(printll(llist));
		

		llist.head.next.next.next.next = llist.head; 
		
		System.out.println(printll(llist));

   
        if (detectLoop(head)) 
        {
            System.out.println("Loop found"); 
           // System.out.println(head.classcounter);
        }
        else
            System.out.println("No Loop"); 
        System.out.println("outofloop");

       floydscyclefindingalgorithm(head);
      
	}
	

}
