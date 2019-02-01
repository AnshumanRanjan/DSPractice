package com.anshumr.Array;

import java.util.Scanner;

/*
 * Input and  output Sample
2
5
1 2 3 5
10
5
2 3 4 5
1 2 3 4 5 6 7 8 10 
 */
public class MissingNumberinArray {

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
			int numberCount = scan.nextInt();
			int[] data = new int[numberCount-1];
			for (int j =0 ; j < numberCount-1 ; j++)
			{
				data[j] = scan.nextInt();
			}
			System.out.println( findMissingNumber(data,numberCount));
		}
		
		
	}
	
	public static boolean checknull( Object ob)
	{
		if (ob != null)
		{
			return true;
		}
		return false;
	}
	
	/*
	 * This methods return if mid value matches with the  expected value
	 * return negatve if less or positive if more
	 * a[2] = 3
	 * a[0] = 1
	 */
	/*
	5
	1 2 3 5
	10
	5
	2 3 4 5
	7
	2 3 4 1 6 7
	*/
	public static int findMissingNumber(int[] a ,int length )
	{
		for (int i=1;i<= length-1 ;i++)
		{
			if(a[i-1] != i)
			{
				return i;
			}
			
		}
		return 0;
	}
	public static int findMissingNumberRandom(int[] a ,int length )
	{
		int sum= 0;
		for (int i=0;i<length-1;i++)
		{
			sum = sum+a[i];
		}
		int requiredSum = (length*(length+1))/2;
		return (requiredSum-sum);
		
	}
	public static int findMissingNumberRandomoptimize(int[] a ,int length )
	{
		int netsum= 0;
		for (int i=0;i<length-1;i++)
		{
			netsum = (a[i]*(a[i+1]))/2;
			if (a[i] - netsum != 0)
			{
				return (a[i] - netsum);
			}
		}
	 return -1;
		
	}
	
}
