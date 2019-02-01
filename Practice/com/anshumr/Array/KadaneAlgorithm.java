/*package whatever //do not write package name here */
/* Sample Input 
2
5
1 2 3 -2 5
4
-1 -2 -3 -4
*/
package com.anshumr.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

class KadaneAlgorithm {
	public static void main (String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    int numberOfTestCase = sc.nextInt();
	    for (int i =0 ; i < numberOfTestCase ; i++)
	    {
	        int ArraryLength = sc.nextInt();
	        int[] input = new  int[ArraryLength];
	        for (int j =0 ; j<ArraryLength;j++)
	        {
	            input[j] = sc.nextInt();
	        }
	        System.out.println(maxSub(input,ArraryLength));
	        
	    }

	}

	static int maxSub(int a[] , int size)
	{
		int maxSum = Integer.MIN_VALUE;
		int sumcount =0 ;
		if (a != null)
		{
		for (int i=0;i<size;i++)
		{
			sumcount = sumcount + a[i];
			if (maxSum < sumcount )
			{
				maxSum = sumcount;
			}
			if (sumcount < 0)
			{
				sumcount=0;
			}
		}
		}
		return maxSum;
	}
	
}