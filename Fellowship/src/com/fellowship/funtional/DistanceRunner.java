/************************************************
 * purpose : To calculate Euclidean distance
 * 
 * @author Ansar
 * @version 1.2
 * @since 19/12/2018
 ************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class DistanceRunner 
{	/*
	 *The main function written to run the EuclideanDistance
	 */
	public static void main(String[] args)
	{	// Command Line arguments 
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Utility.euclideanDistance(x,y);

	}
}
