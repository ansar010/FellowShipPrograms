/*********************************************************************************
 * purpose : Program to convert binary number decimal and perform nibble
 * 
 * @author Ansar
 * @version 1.2
 * @since 29/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class BinarryNibble 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the integer(Decimal Value for nibble) : ");
		int num = Utility.getInt();
		
		while(num>256)
		{
			System.out.println("The number should be less than 256");
			num = Utility.getInt();
		}
		
		String binary = Utility.toBinary(num);
		System.out.println(binary);
		Utility.nibbleBinary(binary);

	}
}
