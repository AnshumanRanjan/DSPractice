package com.anshumr.Array;

/*  Learnings : 
 * When ever doing  value of i  and the  i++  in array ,  use directly i++
 * 
 * 
 */

public class MergeSortedArray {

	public static void main (String[] args)
	{
		
		int[]  input1 = {1,2,3,6,7};
		int[]  input2 = {4,5,8};
		int returnArray[] = mergeSortedArrray(input1,input2);
		System.out.println(returnArray[0] + " "+  returnArray[1]   + " "+  returnArray[2] + " "+ returnArray[3] + " "+ returnArray[4]+ " "+ returnArray[5]+ " "+ returnArray[6]+" "+ returnArray[7]);
	}

	public static int[]  mergeSortedArrray(int a[], int b[])
	{
		int returnArray[] = new int[a.length +b.length+1];
		int loop =0;
		int indexcolverd=0;
		int i =0;
		
		while(i < a.length && indexcolverd <b.length)
		{			
				if(a[i] >b[indexcolverd])
				{
					returnArray[loop++] = b[indexcolverd++];
				}
				else
				{
					returnArray[loop++] = a[i++];
				}
			
		}
		while(i < a.length) 
		{
			returnArray[loop++] = a[i++];
		}
		while(indexcolverd <b.length)
		{
			returnArray[loop++] = b[indexcolverd++];

		}
		return returnArray;
	}
	
}
