/*********************************************************************************
 * purpose : Program to sort list of string by using merge Sort method
 * 
 * @author Ansar
 * @version 1.2
 * @since 28/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class MergeSortArrayRunner 
{
	public static void main(String[] args) 
	{
		String strArr[]=Utility.createStrArr();
		System.out.println("Unsorted List of String");
		System.out.println("=======================");
		Utility.displayStrArr(strArr);
		
		System.out.println();

		Utility.stringMergeSort(strArr, 0, strArr.length-1);
		System.out.println("Sorted List Of String(Merge Sort Approach)");
		System.out.println("==========================================");
		Utility.displayStrArr(strArr);
		
	}
}
