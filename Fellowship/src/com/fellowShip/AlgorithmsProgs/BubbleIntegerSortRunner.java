/**********************************************************
 *
 * purpose : Program to sort integer by using bubble sort
 * 
 * @author Ansar
 * @version 1.2
 * @sonce 27/12/2018
 * 
 **********************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class BubbleIntegerSortRunner 
{	/*
 	 * Written main method to run the bubble sort integer
 	 */
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number of Element : ");
		int arr[]=Utility.createIntArr();// calling method to create integer array
		System.out.println("Sorted List(By using Bubblbe sort technique)");
		System.out.println("============================================");
		Utility.bubbleSortInt(arr);//calling method to sort integer
		Utility.displayArr(arr);// calling method to display the sorted array
		
	}
}
