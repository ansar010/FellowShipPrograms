/***********************************************************************************
 * purpose : A program with cubic running time. Read in N integers and counts the
 *			 number of triples that sum to exactly 0. 
 *
 *@author Ansar
 *@version 1.2
 *@since 18/12/2018
 ***********************************************************************************/
package com.fellowship.funtional;
import com.fellowship.utilities.Utility;
public class TripletsRunner 
{	/*
	 *The main function written to run the Triplets
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of inputs");
		int[] arr=Utility.createIntArr();
		int l = arr.length;
		
		// Calling method to Display the Elements
		Utility.displayArr(arr);
		 // Calling method to give triplets of zero
		Utility.tripletsZero(arr,l);
	}
}
