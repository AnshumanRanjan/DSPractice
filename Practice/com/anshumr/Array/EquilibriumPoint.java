package com.anshumr.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
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
	    	System.out.println(findequilibrium2(data));
	    	
	    }
	}
	
	/*
	Input:
		2
		1
		1
		5
		1 3 5 2 2

		Output:
		1
		3
		*/
	
	
	public  static int findequilibrium2(int[] data)
	{
		int totalsum=0,startsum = 0;
		for (int i =0 ; i< data.length ;i++)
		{
			totalsum=totalsum + data[i];
		}
	
		for (int i =0 ; i< data.length ;i++)
		{
            totalsum -= data[i]; 
  
            if (startsum == totalsum) 
                return i; 
  
            startsum += data[i]; 
         
		}
		return -1;
	
	}
	
	public  static int findequilibrium1(int[] data)
	{
	int end=data.length -1;
	int mid=0;
	int sumstart=0;
	
	if(end == 0)
	{
		return 1;
	}
	while(mid != end)
	{
	int sumend =0;
	
	if(mid >0)
	{
    sumstart = sumstart + data[mid-1]; 
	}
	for(int i =mid+1;i<=end;i++)
	{
		sumend = sumend + data[i]; 
		if(sumend > sumstart)
		{
			break;
		}
	}
	if (sumstart == sumend)
	{
		return mid+1;
	}
	mid++;
	}
	return -1;
		
	}
	
	
	public static int findEquilibrium(int[] data)
	{
		int start=0;
		int end=data.length -1;
		int sumstart =data[0];
		int sumend=data[end];
		
		while(end - start != 2)
		{
		
		if (sumstart > sumend)
		{
			end--;
			sumend = sumend+data[end];
		}
		else if (sumstart < sumend)
		{
			start++;
			sumstart = sumstart + data[start];
			
		}
		else {
			if(end-start == 2)
			{
			 return start+2;
			}
			start++;
			end--;
			sumend = sumend+data[end];
			sumstart = sumstart + data[start];
			
		}
			
			
		}
			
		
		return -1;
	}
	
	
}
