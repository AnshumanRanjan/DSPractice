package com.anshumr.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Advance DP problem :    create a copy of array  not deep copy 
 loop starts from i =1  and  j= 0  ,  requires to mantain local max in j loop 
 */

public class MaxsumincreasinSubsequence {

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
	    	System.out.println(maxSumfun(data));
	    	
	    }
	}
/*	
	Input:
		2
		7
		1 101 2 3 100 4 5
		4
		10 5 4 3

		Output:
		106
		10
		(1,101); (1,2,3,100); (1,2,3,4,5). Out of these (1, 2, 3, 100) 
*/
	public static int maxSumfun(int[] data)
	{
		int[] maxsumarray = new int[data.length];
		for (int i =0 ;i <data.length;i++)
		{
			maxsumarray[i] = data[i];
		}
		int i =1;
		int j=0;
		for (i=1 ; i<data.length;i++)
		{
			int localmaximum = maxsumarray[i];
			for (j=0;j<i;j++)
			{
				
				if(data[i] > data[j])
				{
					if (localmaximum < maxsumarray[i] + maxsumarray[j] )
						localmaximum = maxsumarray[i] + maxsumarray[j];
					
				}
				
			}
			maxsumarray[i] = localmaximum;
			
		}
		
	   int max = 0;
	   for (int k =0 ;k <maxsumarray.length;k++)
		{
		   //System.out.print(maxsumarray[k] + " ");
			if(maxsumarray[k] > max) 
				max=maxsumarray[k];
		}
	   
	   return max;
	}

}
