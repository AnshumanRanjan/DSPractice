package com.anshumr.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayLeader {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Faster way to read input
		int numOfCases = Integer.parseInt(br.readLine());
		for (int i=0;i<numOfCases;i++)
	    {
	    	int size = Integer.parseInt(br.readLine());
	    	String[] datastring = br.readLine().split(" ");
	    	int[] data = new int[size];
	    	for (int j=0;j<size;j++)
	    	{
	    		data[j] = Integer.parseInt(datastring[j]);
	    	}
	    	leaderarray2(data,size);
	    	
	    }
	}

	
	// Solution that passed 
	
	public static void leaderarray2(int data[],int len)
	{
		int lead[] = new int[len-1];
		int max = data[len-1];
		int counter =0;
		for(int i =len-1 ; i>=0;i--)
		{
			if (data[i] >= max)
			{
				max= data[i];
				lead[counter] = max;
				counter++;
			}
		}
		for(int i = counter - 1; i >= 0; i--)      
            System.out.print(lead[i]+" ");
            
        System.out.println();
	}
	
	
	/*
	Input:
		3
		6
		16 17 4 3 5 2
		5
		1 2 3 4 0
		5
		7 4 5 7 3
		Output:
		17 5 2
		4 0
		7 7 3
	*/
	public static void leaderarray1(long data[],int len)
	{
		long maxright =0;
		StringBuilder stb = new StringBuilder("");
		maxright = data[len -1];
		stb.insert(0,maxright+" ");

		for (int i = len -2 ; i >= 0;i-- )
		{
			
				if(data[i] >= maxright )
				{
					stb.insert(0,data[i]+" ");
				    maxright = data[i];
				}
			
		}
		System.out.println(stb);
	}
	
	
	
	public static  void leaderArray(int[] data)
	{
		
		for (int i =0 ; i <data.length;i++)
		{
		int isleader = 0;
		if (i+1 != data.length)
		{
		for (int j=i+1;j<data.length ;j++)
		{
			if (data[j] > data[i])
			{
				isleader = 1;
			}
		}
		}
		if (isleader == 0 )
		System.out.print(data[i] + " ");	
		
		}
		System.out.println();
	}
}
