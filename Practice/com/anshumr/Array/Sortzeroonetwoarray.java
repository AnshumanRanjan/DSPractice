package com.anshumr.Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Learning 
 * Alwasy use three pointer two init to start and  last init to size-1 and mode mid pointer  
 * 
 */
public class Sortzeroonetwoarray {

	public static void main (String args[]) throws NumberFormatException, IOException
	{
		
		/*
		 * Reading a array method 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Faster way to read input
		 int t = Integer.parseInt(br.readLine());
		
		 while(t != 0) {
		    int n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    
		    String[] arr = br.readLine().split(" "); //Faster way to read Input
		    for(int i = 0; i < n; i++) {
		        a[i] = Integer.parseInt(arr[i]);
}
		 */
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
	    	int [] returndata = findsortedarraydfs(data);
	    	
	    	//printArray(returndata,size);
	    	printa(returndata);
	    }
	}
	
	/* Dutch flag problem solution */
	/*0 2 1 2 0*/
	/*2 2 0 2 1 0*/
	public static int[] findsortedarraydfs(int[] data)
	{
		int start , mid ,end;
		start =0;mid=0;
		end=data.length -1;
		while(mid <= end)
		{
			switch (data[mid]){
				case 1:
					mid++;
					continue;
				case 0:
					int temp;
					temp = data[start];
					data[start] = data[mid];
					data[mid] = temp;
					start++;
					mid++;
					break;
				case 2:
					temp = data[end];
					data[end] = data[mid];
					data[mid] = temp;
					end--;
					break;
				
			}
			
			
		}
		return data;
	}
	
	
	/*0 2 1 2 0*/
	/*2 2 0 2 1 0*/
	/* Sorting evrything */
	public static int[] findsortedarrayfaster(int[] data)
	{
		int i,j=0,temp;
		for(i=0;i<data.length -1;i++)
		{
			j=0;
			while(j<data.length -1 -i)
			{
				if (data[j] > data[j+1])
				{
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
				j++;
			}
		}
		return data;
		
	}
	
	
	
	 static void printArray(int arr[], int arr_size) 
	    { 
	        int i; 
	        for (i = 0; i < arr_size; i++) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(""); 
	    } 
	 
	 static void printa(int arr[])
	 {
			StringBuffer sb = new StringBuffer(); 
			for(int el : arr)
		        sb.append(el + " ");
			System.out.println(sb.toString());
	 }
	
	public static int[] findsortedarray(int[] data)
	{
		int zero=0;int one = 0; int two =0;
		for(int i =0;i<data.length;i++)
		{
			if (data[i] == 0) {zero++;}
			else if(data[i] == 1){one++;}
			else if(data[i] == 2){two++;}
		}
	//	int returnarray[] = new int[data.length];
		int counter=0;
		while(zero!=0)
		{
			data[counter] = 0;
			counter++;
			zero--;
		}
		while(one!=0)
		{
			data[counter] = 1;
			counter++;
			one--;
		}
		while(two!=0)
		{
			data[counter] = 2;
			counter++;
			two--;
		}
		return data;
	}
	
}
