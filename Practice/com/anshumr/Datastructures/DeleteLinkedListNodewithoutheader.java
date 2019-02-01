package com.anshumr.Datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteLinkedListNodewithoutheader {

	static Node head;
	static class Node
	{
		int data ;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	 void deleteNode(Node del)
	    {
	       
	    }
/*	 
	 Input:
		 2
		 2
		 1 2
		 1
		 4
		 10 20 4 30
		 20

		 Output:
		 2
		 10 4 30 
*/	 
	 public static void main(String args[]) throws NumberFormatException, IOException
		{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Faster way to read input
			int numOfCases = Integer.parseInt(br.readLine());
			for (int i=0;i<numOfCases;i++)
		    {
		    	int size = Integer.parseInt(br.readLine());
		    	String[] datastring = br.readLine().split(" ");
		    	int[] data = new int[size];
		    	Node headp = head;
		    	for (int j=0;j<size;j++)
		    	{
		    		if( headp != null)
		    		{
		    		Node n1 = new Node(Integer.parseInt(datastring[j]));
		    		headp.next = n1;
		    		headp = n1;
		    		}
		    		else
		    		{
		    			head = new Node(Integer.parseInt(datastring[j]));
		    			headp= head;
		    		}
		    		
		    	}
		    	printll(headp);
		    	
		    }
		}
	 static void  printll(Node n)
	 {
		 while(n != null)
		 {
			 System.out.print(n.data);
			 n=n.next;
		 }
	 }
}
