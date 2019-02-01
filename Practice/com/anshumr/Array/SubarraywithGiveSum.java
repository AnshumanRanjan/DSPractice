package com.anshumr.Array;

/*
 * Learning :  sum , counter and start required 
 */
import java.util.Scanner;

public class SubarraywithGiveSum {
	
	public static void main (String[] args)
	{
		Scanner  scan = new Scanner(System.in);
		int numberOfTestCases = scan.nextInt();
		if (numberOfTestCases < 0)
		{
			return;
		}
		for (int i =0 ; i < numberOfTestCases ; i++)
		{
			int sizeofarray = scan.nextInt();
			int desiredSum = scan.nextInt();
			int[] data = new int[sizeofarray];
			for (int j =0 ; j < sizeofarray ; j++)
			{
				data[j] = scan.nextInt();
			}
			int[] returnval = findIndexInArray(data,sizeofarray,desiredSum);
			if(returnval == null)
			{
				System.out.println("-1");	
			}
			else{
			System.out.println( returnval[0]+" "+returnval[1]);
			}
		}
		
		
	}
	
	/*
	Input:
	2
	5 12
	1 2 3 7 5
	10 15
	1 2 3 4 5 6 7 8 9 10
	Output:
	2 4
	1 5
	*/
	public static int[] findIndexInArray(int[] d , int size , int requiredSum)
	{
		int sum = 0 ;
		int start=0;
		int counter=0;
		
		while(counter<size )
		{
			sum = sum+d[counter];
			if(sum == requiredSum)
			{
				int a[]= new int[]{start+1,counter+1};
				return a;
			}else if(sum > requiredSum)
			{
				sum=0;
				start++;
				counter=start;
				continue;
				
			}
				counter++;
			
		}
		
		return null; 
	}
}
