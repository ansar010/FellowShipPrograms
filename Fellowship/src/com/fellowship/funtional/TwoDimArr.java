/******************************************************************************
 * purpose : To create matrix type 2D array and write elements in txt file 
 * 
 * @author Ansar
 * @version 1.2
 * @since 18/12/2018
 ******************************************************************************/
package com.fellowship.funtional;
import com.fellowship.utilities.Utility;
public class TwoDimArr
{	/*
	 *The main function written to run the TwoDArr
	 */
	public static void main(String[] args)
	{
		
		System.out.println("Enter the Number of rows");
		int row=Utility.getInt();
		System.out.println("Enter the Number of Columns");
		int col=Utility.getInt();
		
		// Calling method to write elements in the form of 2D Array
		Utility.TwoDArr(row, col);
		
	}
}
